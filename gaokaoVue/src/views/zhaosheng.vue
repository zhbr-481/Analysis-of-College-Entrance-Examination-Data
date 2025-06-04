<template>
  <div class="body">
    <div>
      <el-button @click="findSchoolByname" type="success">搜索</el-button>
      <el-input v-model="schoolinput.findSchoolName" placeholder="请输入要查找的学校"></el-input>
    </div>
    <div v-for="school in schoolList" :key="school.id" class="neirong" style="position: relative">
      <div class="content">
        <div class="logo">
          <img :src="school.image" alt="School Logo">
        </div>
        <div class="details" style="position: absolute;top: 50px;left: 200px">
          <a target="_blank" :href="school.guanwang" style="margin-left: 30px;font-size: 40px;font-family: '华文新魏';text-decoration: none;
  color: black;">{{ school.schoolname }}</a>
          <div class="types">
            <el-link :underline="false">{{ school.type1 }}</el-link>
            <el-link :underline="false">{{ school.type2 }}</el-link>
            <el-link 
              v-for="(schoolType, schoolIndex) in school.type3" 
              :key="schoolIndex" 
              :underline="false" 
              class="link">{{ schoolType[0] }}{{ schoolType[1] }}
            </el-link>
          </div>
          <div class="plan-info">
            <el-link :underline="false">{{ school.plan }}</el-link>
            <el-link :underline="false" class="link1">{{ school.majornum }}</el-link>
            <el-link :underline="false" class="link1">{{ school.kuozhao }}</el-link>
            <button @click="toggleChart(school.id, school.zslist)">招生计划趋势图</button>
          </div>
        </div>
      </div>

      <div v-if="visibleCharts[school.id]" class="chart-container">
        <div class="close-button" @click="toggleChart(school.id)">✖</div>
        <div :id="'category-' + school.id" class="chart"></div>
      </div>
    </div>

    <el-pagination
      @size-change="handleSizeChange"
      @current-change="handleCurrentChange"
      :current-page="schoolinput.pageNum"
      :page-sizes="[5, 10, 15, 20]"
      :page-size="schoolinput.pageSize"
      layout="total, sizes, prev, pager, next, jumper"
      :total="fenye.total">
    </el-pagination>
  </div>
</template>
<script>
import * as echarts from 'echarts';
import request from '@/utils/request';

export default {
  name: "zhaoShengVue",
  created() {
    this.load();
  },
  data() {
    return {
      schoolList: [],
      fenye: {},
      visibleCharts: {},
      schoolinput: {
        findSchoolName: '',
        pageNum: 1,
        pageSize: 5
      }
    };
  },
  methods: {
    async load() {
      await this.searchSchools();
    },
    async searchSchools() {
      const result = await request.get('/zhaosheng/findByName', { params: this.schoolinput });
      this.schoolList = result.data.list;
      console.log(this.schoolList);
      this.fenye = result.data;
    },
    initCategoryCharts(schoolId, zslist) {
      let charDom = document.getElementById(`category-${schoolId}`);
      if (charDom) {
        let myChart = echarts.init(charDom);
        let option = {
          xAxis: {
            type: 'category',
            data: ['2021', '2022', '2023', '2024']
          },
          yAxis: {
            type: 'value'
          },
          series: [{
            data: zslist,
            type: 'line'
          }]
        };
        myChart.setOption(option);
      } else {
        console.error(`Chart DOM element not found for school ID: ${schoolId}`);
      }
    },
    handleSizeChange(pagesize) {
      this.schoolinput.pageSize = pagesize;
      this.schoolinput.pageNum = 1;  // 重置到第一页
      this.load();
    },
    handleCurrentChange(pageNum) {
      this.schoolinput.pageNum = pageNum;
      this.load();
    },
    toggleChart(schoolId, zslist) {
      this.$set(this.visibleCharts, schoolId, !this.visibleCharts[schoolId]);
      this.$nextTick(() => {
        if (this.visibleCharts[schoolId]) {
          this.initCategoryCharts(schoolId, JSON.parse(zslist));
        }
      });
    },
    async findSchoolByname() {
      this.schoolinput.pageNum = 1;  // 每次新搜索时重置页码
      await this.searchSchools();
    }
  }
};
</script>

<style>
.chart-container {
  position: absolute;
  top: 170px;
  left: 600px;
  width: 1000px;
  height: 500px;
  flex: 0 0 500px;
  z-index: 10;
}
.body {
  width: 100%;
  padding: 20px;
  box-sizing: border-box;
  
}
.neirong {
  width: 100%;
  height: 200px;
  margin-bottom: 20px;
  border: 1px solid #ddd;
  border-radius: 8px;
  /* overflow: hidden; */
  background-color: white;
  box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
}
.content {
  display: flex;
  padding: 20px;
  align-items: flex-start;
  height: 300px;
}
.logo {
  /* flex: 0 0 120px; */
  margin-right: 20px;
  float: left;
}
.logo img {
  width: 100%;
  height: 150px;
  border-radius: 8px;
}
.details {
  /* flex: 1; */
  margin-right: 20px;
  float: right;
}
.types {
  margin: 10px 0;
}
.link, .link1 {
  margin-right: 10px;
}
.chart {
  width: 50%;
  height: 200px;
  background: #f9f9f9;
  border-radius: 8px;
  border: 1px solid #ddd;
}

</style>
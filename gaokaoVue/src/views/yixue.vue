<template>
  <div class="box">
    <div class="image1">
      <img src="../assets/zhuanyePK/yisheng1.jpg" alt="">
    </div>
    <div class="image2">
      <img src="../assets/zhuanyePK/yisheng2.jpg" alt="">
    </div>
    <h1>医学提前批专业</h1>
    <h1><span style="color: blue;">pk</span></h1>
    <div class="kuangjia">
      <div class="leftBox">
        <div class="input-container">
          <el-input placeholder="请输入想要PK的院校" v-model="school1.schoolname"></el-input>
          <el-button @click="SearchSchool1Sp">确定搜索</el-button>
          <el-input placeholder="请选择想要PK的专业" v-model="school1.zhuanye" class="input-with-select">
            <el-select v-model="school1.zhuanye" slot="prepend" placeholder="请选择">
              <el-option v-for="item in school1.List" :key="item" :label="item" :value="item"></el-option>
            </el-select>
            <el-button slot="append" icon="el-icon-search"></el-button>
          </el-input>
          <el-button @click="SearchSchool1detail" style="margin-top: 10px;">确定搜索</el-button>
        </div>
        <div class="content">
          <p>批次: {{ school1.detail.batch }}</p>
          <p>招生计划: {{ school1.detail.number }}</p>
          <p>地区: {{ school1.detail.province }}</p>
          <p>选科要求: {{ school1.detail.request }}</p>
          <p>学校代码: {{ school1.detail.schoolcode }}</p>
          <p>专业名称: {{ school1.detail.specialty }}</p>
          <p>专业代码: {{ school1.detail.specialtycode }}</p>
          <p>学制: {{ school1.detail.time }}</p>
          <p>类型: {{ school1.detail.type }}</p>
          
          <p>学费:{{ school1.detail.tuition }}</p>
        </div>
      </div>
      <el-button @click="drawer = true" type="primary" style="margin-top: 20px; width: 100px;height:100px;border-radius: 50%;font-family: '华文新魏';font-size: 30px">
        对比
      </el-button>

      <el-drawer
          size="80%"
          @open="huatu"
          id="tanchu"
          title="对比图"
          :visible.sync="drawer"
          :direction="direction"
          :before-close="handleClose">
        <div ref="chart" style="width: 100%; height: 100%;">
          <div id="tu1" style="background-color: white;"></div>
          <div id="tu2" style="background-color: white;"></div>
        </div>
      </el-drawer>
      <div class="rightBox">
        <div class="input-container">
          <el-input placeholder="请输入想要PK的院校" v-model="school2.schoolname"></el-input>
          <el-button @click="SearchSchool2Sp">确定搜索</el-button>
          <el-input placeholder="请选择想要PK的专业" v-model="school2.zhuanye" class="input-with-select">
            <el-select v-model="school2.zhuanye" slot="prepend" placeholder="请选择">
              <el-option v-for="item in school2.List" :key="item" :label="item" :value="item"></el-option>
            </el-select>
            <el-button slot="append" icon="el-icon-search"></el-button>
          </el-input>
          <el-button @click="SearchSchool2detail" style="margin-top: 10px;">确定搜索</el-button>
        </div>
        <div class="content">
          <p>批次: {{ school2.detail.batch }}</p>
          <p>招生计划: {{ school2.detail.number }}</p>
          <p>地区: {{ school2.detail.province }}</p>
          <p>选科要求: {{ school2.detail.request }}</p>
          <p>学校代码: {{ school2.detail.schoolcode }}</p>
          <p>专业名称: {{ school2.detail.specialty }}</p>
          <p>专业代码: {{ school2.detail.specialtycode }}</p>
          <p>学制: {{ school2.detail.time }}</p>
          <p>类型: {{ school2.detail.type }}</p>
          
          <p>学费：{{ school2.detail.tuition }}</p>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import request from '@/utils/request';
import echarts from 'echarts/lib/echarts';
export default {
  name: "yxVue",
  data() {
    return {
      drawer: false,
      direction: 'btt',
      school1: {
        schoolname: '',
        zhuanye: '',
        List: [],
        detail: {}
      },
      school2: {
        schoolname: '',
        zhuanye: '',
        List: [],
        detail: {}
      },
      List1: ['计算机科学', '机械工程', '电子信息'] // 例子中的专业列表
    };
  },
  methods: {
    huatu(){
      this.$nextTick(()=>{
        this.initChart();
        this.initChart2();
 
      })
    },
    async SearchSchool1Sp() {
      console.log(this.school1);
      const result = await request.get("schoolPk/yx", {
        params: {
          schoolname: this.school1.schoolname,
          specialty: this.school1.zhuanye
        }
      });
      console.log(result);
      this.school1.List = result.data.map(item => item.specialty);
    },
    async SearchSchool1detail() {
      const result = await request.get("schoolPk/yxdetail", {
        params: {
          schoolname: this.school1.schoolname,
          specialty: this.school1.zhuanye
        }
      });
      console.log(result);
      this.school1.detail = result.data[0];
      console.log(this.school1.detail);
    },
    async SearchSchool2Sp() {
      console.log(this.school2);
      const result = await request.get("schoolPk/yx", {
        params: {
          schoolname: this.school2.schoolname,
          specialty: this.school2.zhuanye
        }
      });
      console.log(result);
      this.school2.List = result.data.map(item => item.specialty);
    },
    async SearchSchool2detail() {
      const result = await request.get("schoolPk/yxdetail", {
        params: {
          schoolname: this.school2.schoolname,
          specialty: this.school2.zhuanye
        }
      });
      console.log(result);
      this.school2.detail = result.data[0];
      console.log(this.school2.detail);
    }, initChart() {
      const chartDom = document.getElementById('tu1') // 获取图表容器
      const myChart = echarts.init(chartDom); // 初始化 ECharts 实例
      const option = {
        title:{
          text:"                                                      招生计划对比图"
        },
        tooltip: {
    trigger: 'axis', // 改为 'axis'，以便在悬停时显示整个类别的 tooltip
    formatter: function (params) {
      let tooltipContent = '';
      params.forEach(param => {
        tooltipContent += `${param.seriesName}<br/>${param.name}: ${param.value}<br/>`;
      });
      return tooltipContent;
    }
  },
  angleAxis: [
    {
      type: 'category',
      polarIndex: 0,
      startAngle: 90,
      endAngle: 0,
      data: ['招生计划'] 
    },
    {
      type: 'category',
      polarIndex: 1,
      startAngle: -90,
      endAngle: -180,
      data: ['招生计划']
    }
  ],
  radiusAxis: [{ polarIndex: 0 }, { polarIndex: 1 }],
  polar: [{}, {}],
  series: [
    {
     
      name: this.school1.detail.schoolname,
      type: 'bar',
      polarIndex: 0,
      data: [this.school1.detail.number],
      coordinateSystem: 'polar',
      itemStyle: {
        color: '#ff4d4d' // 设置柱子的颜色
      },
      label: {
       
        show: true,
        position: 'top', // 在柱子顶部显示标签
        formatter: '{c}' // 显示数据值
      }
    },
    {
      name: this.school2.detail.schoolname,
      type: 'bar',
      polarIndex: 1,
      data: [this.school2.detail.number],
      coordinateSystem: 'polar',
      itemStyle: {
        color: '#87ceeb' // 设置柱子的颜色
      },
      label: {
        show: true,
        position: 'top', // 在柱子顶部显示标签
        formatter: '{c}' // 显示数据值
      }
    }
  ]
      };
      myChart.setOption(option); // 设置图表配置
    },
    initChart2() {
      const chartDom = document.getElementById('tu2') // 获取图表容器
      const myChart = echarts.init(chartDom); // 初始化 ECharts 实例
      const option = {
        title:{
          text:"                                                      学费对比图"
        },
        tooltip: {
    trigger: 'axis', // 改为 'axis'，以便在悬停时显示整个类别的 tooltip
    formatter: function (params) {
      let tooltipContent = '';
      params.forEach(param => {
        tooltipContent += `${param.seriesName}<br/>${param.name}: ${param.value}<br/>`;
      });
      return tooltipContent;
    }
  },
  angleAxis: [
    {
      type: 'category',
      polarIndex: 0,
      startAngle: 90,
      endAngle: 0,
      data: ['学费'] 
    },
    {
      type: 'category',
      polarIndex: 1,
      startAngle: -90,
      endAngle: -180,
      data: ['学费']
    }
  ],
  radiusAxis: [{ polarIndex: 0 }, { polarIndex: 1 }],
  polar: [{}, {}],
  series: [
    {
      name: this.school1.detail.schoolname,
      type: 'bar',
      polarIndex: 0,
      data: [this.school1.detail.tuition],
      coordinateSystem: 'polar',
      itemStyle: {
        color: '#ff4d4d' // 设置柱子的颜色
      },
      label: {
        show: true,
        position: 'top', // 在柱子顶部显示标签
        formatter: '{c}' // 显示数据值
      }
    },
    {
      name: this.school1.detail.schoolname,
      type: 'bar',
      polarIndex: 1,
      data: [this.school2.detail.tuition],
      coordinateSystem: 'polar',
      itemStyle: {
        color: '#87ceeb' // 设置柱子的颜色
      },
      label: {
        show: true,
        position: 'top', // 在柱子顶部显示标签
        formatter: '{c}' // 显示数据值
      }
    }
  ]
      };
      myChart.setOption(option); // 设置图表配置
    },
  }
};
</script>

<style>
.box {
background: linear-gradient(to bottom, #ffffff, #007bff); /* 设置背景为蓝白渐变色 */
}
.image1{
  height: 200px;
}
.image2{
  height: 200px;
}
h1 {
  text-align: center;
  font-size: 36px;
  margin-bottom: 20px;
  color: #333;
}

.kuangjia {
  display: flex;
  justify-content: space-between;
  align-items: flex-start;
  width: 100%;
  height: auto;
  margin: 20px 0;
}

.leftBox, .rightBox {
  width: 45%;
  border-radius: 10px;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
  display: flex;
  flex-direction: column;
  padding: 20px;
  background-color: #fff;
}

.leftBox {
  border: 1px solid #ff4d4f;
}

.rightBox {
  border: 1px solid #87ceeb;
}

.pk {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  background: #f5f5f5;
  width: 8%;
  height: 100%;
  border-radius: 10px;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

.pk p {
  margin: 0;
  font-size: 3em;
  font-weight: bold;
  color: #333;
}

.input-container {
  width: 100%;
  margin-bottom: 20px;
}

.content {
  flex-grow: 1;
  display: flex;
  flex-direction: column;
  align-items: flex-start;
  justify-content: flex-start;
  border-top: 1px solid #f0f0f0;
  margin-top: 20px;
  padding-top: 20px;
  padding-left: 10px;
}

.content p {
  margin: 5px 0;
  font-size: 16px;
  color: #333;
}

.el-input, .el-button {
  width: 100%;
  margin-bottom: 10px;
}

.el-select {
  width: 100%;
}
#tu1{
  width: 50%;height: 500px;float: left;background: white;
}
#tu2{
  width: 50%;height: 500px;float: left;background: white;
}
</style>
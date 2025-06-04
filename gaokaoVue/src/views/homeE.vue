<script>
export default {
  data() {
    return {
      activeName: 'first',
      xinwName: 'first',
      tableDatazhuan: [{
        name: '1.青岛港湾职业技术学院',
      }, {
        name: '2.日照职业技术学院',
      }, {
        name: '3.开封大学',
      }, {
        name: '4.武汉职业技术学院',
      }, {
        name: '5.重庆交通职业学院',
      }, {
        name: '6.重庆医药高等专科学院',
      }, {
        name: '7.山东职业学院',
      }, {
        name: '8.天津市职业大学',
      }, {
        name: '9.成都职业技术学院',
      }, {
        name: '10山东商业职业技术学院',
      }],
        tableDataben: [{
        name: '1.厦门大学',
      }, {
        name: '2.四川大学',
      }, {
        name: '3.武汉大学',
      }, {
        name: '4.中山大学',
      }, {
        name: '5.中南大学',
      }, {
        name: '6.西南大学',
      }, {
        name: '7.南京大学',
      }, {
        name: '8.北京大学',
      }, {
        name: '9.电子科技大学',
      }]
    };
  },
  methods: {
    handleClick(tab, event) {
      console.log(tab, event);
    },
  }
};
</script>

<template>
<div>
  <el-row :gutter="20" style="height: 400px">
    <el-col :span="16">

      <el-tabs v-model="xinwName" @tab-click="handleClick" class="left-tabs">
        <div class="left" style="height: 300px;" >
          
            <div><a href="http://www.sdzk.cn/NewsInfo.aspx?NewsID=6663">2024年夏季高考普通类和体育类常规批第2次志愿、艺术类专科批以及春季高考专科批第1次志愿填报注意事项</a></div>
            <div><a href="http://www.sdzk.cn/NewsInfo.aspx?NewsID=6662">2024年普通类常规批（本科）第2次志愿院校专业计划</a></div>
            <div><a href="http://www.sdzk.cn/NewsInfo.aspx?NewsID=6661">山东省2024年普通高等学校专科层次分专业招生计划补充信息</a></div>
            <div><a href="http://www.sdzk.cn/NewsInfo.aspx?NewsID=6660">山东省2024年普通高校招生专业（专业类）选考科目要求</a></div>
          
        </div>
<!--        <el-tab-pane label="高考推荐" name="second">-->
<!--          <ul class="infinite-list" v-infinite-scroll="load" style="overflow:auto;height: 300px;">-->
<!--          </ul>-->
<!--        </el-tab-pane>-->
<!--        <el-tab-pane label="高校资讯" name="third">-->
<!--          <ul class="infinite-list" v-infinite-scroll="load" style="overflow:auto;height: 300px;">-->
<!--            <a href="http://https://www.sict.edu.cn/">山东商业职业技术学院</a>-->
<!--          </ul>-->
<!--        </el-tab-pane>-->
      </el-tabs>

    </el-col>

    <el-col :span="8" style="position:relative;top: 20px;">
      <p class="redu">
        院校热度
      </p>
      <el-tabs v-model="activeName" type="card" @tab-click="handleClick">
        <el-tab-pane label="本科" name="first">
          <ul class="infinite-list" v-infinite-scroll="load" style="overflow:auto;height: 300px;" >
            <el-table
                :data="tableDataben"
                style="width: 91%" class="ke">
              <el-table-column
                  prop="name"
                  label=""
                  width="180"
              >
              </el-table-column>
            </el-table>
          </ul>
        </el-tab-pane>
        <el-tab-pane label="专科" name="second">
          <ul class="infinite-list" v-infinite-scroll="load" style="overflow:auto;height: 300px;">
            <el-table
                :data="tableDatazhuan"
                style="width: 91%" class="ke">
              <el-table-column
                  prop="name"
                  label=""
                  width="180"
                  >
              </el-table-column>
            </el-table>
          </ul>

        </el-tab-pane>

      </el-tabs>
    </el-col>
  </el-row>
  <div class="bottom-zhufu"> <img src="./6.png" alt=""></div>
</div>


</template>

<style scoped lang="less">
.ke{
  left: 35px;
}
.footer{
  background-color: #0e2152;
  width:1270px;
  height: 100px;
}

a {
  text-decoration: none;
  color: black;
}
.redu{
  position: relative;
  bottom: 5px;
  font-weight: bold;
  font-size: 35px;
  color:dimgray;
  font-family: '华文新魏';
}

a:hover {
  color: orange;
}

.left-tabs{
  border: 1px solid skyblue;
  position: relative;
  top: 30px;
  border-radius: 15px;
  box-shadow: 10px 10px 5px rgba(89, 87, 87, 0.5);
  background-color: #f7fbff;
}
.bottom-zhufu{
  img{
    position: relative;
    top: 20px;
    width: 100%;
    height: 120px;
  }
}
.left{
  border: skyblue 5px solid;
  border-radius: 3%;
}
.left div{
  height: 70px;
  margin-left: 20px;
  line-height: 70px;
 
}
.left div:hover{
  background: rgb(0, 153, 255);
}
</style>
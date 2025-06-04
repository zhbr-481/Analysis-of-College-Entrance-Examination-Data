<template>
    <div style="width: 100%;height: 100%;">
        <!-- 右侧选择 -->
          <div class="biaodan">
    <span>智能志愿填报</span>
    <div class="danxuan">
      <el-radio v-model="person.radio" label="1">普通类</el-radio>
      <el-radio v-model="person.radio" label="2">艺术类</el-radio>
    </div>
    <div class="shouxuan">
      <h4>首选(2选1)</h4>
      <el-radio v-model="person.radio1" label="1" border>物理</el-radio>
      <el-radio v-model="person.radio1" label="2" border>历史</el-radio>
    </div>
    <div class="cixuan">
      <h4>次选(4选2)</h4>
      <el-checkbox v-model="person.checked1" label="化学" border></el-checkbox>
      <el-checkbox v-model="person.checked2" label="生物" border></el-checkbox>
      <el-checkbox v-model="person.checked3" label="地理" border></el-checkbox>
      <el-checkbox v-model="person.checked4" label="政治" border></el-checkbox>
    </div>
    <div class="shuru">
      <h4>分数</h4>
      <el-row :gutter="20">
        <el-col :span="12">
          <el-input
              placeholder="请输入您的分数"
              prefix-icon="el-icon-edit"
              v-model="person.score">
          </el-input>
        </el-col>
        <el-col :span="12">
          <el-input
              placeholder="请输入您的位次"
              prefix-icon="el-icon-s-data"
              v-model="person.place">
          </el-input>
        </el-col>
      </el-row>
    </div>
    <el-button @click="table=true; recommend()" type="primary" round>
      智能推荐大学
    </el-button>
            <el-drawer
                id="ovo"
                title="推荐学校"
                :visible.sync="table"
                direction="rtl"
                size="85%"
                @open="logqwq">
  
                <div style="width: 50%;float: left;height: 1000px;" id="qwq">
  
                </div>  
  
                <div style="width: 50%;float: left;"> 
                  <table>
                <tr>
                  <th>专业名称</th>
                  <th>院校名称</th>
                  <th>招生计划</th>
                  <th>录取最低位次</th>
                </tr>
                <tr v-for="(value, index) in toudangList" :key="index">
                  <td>{{ value.specialty }}</td>
                  <td>{{ value.schoolname }}</td>
                  <td>{{ value.planNum }}</td>
                  <td>{{ value.place }}</td>
                </tr>
              </table>
            </div>
             
            </el-drawer>
          </div>

     
    </div>
  </template>
  
  <script>
  import request from '@/utils/request';
  import * as echarts from 'echarts';
  
  export default {
    data() {
      return {
        table: false,
        toudangList: [],
        person: {
          radio: '0',
          radio1: '0',
          checked1: false,
          checked2: false,
          checked3: false,
          checked4: false,
          score: '',
          place: '',
        },
        imageList: [
          'https://pic1.zhimg.com/70/v2-8468ec0e30a670ef477b791b1c122848_1440w.avis?source=172ae18b&biz_tag=Post',
          'https://img.zcool.cn/community/0129f55f0492bca801215aa09da9f8.jpg@1280w_1l_2o_100sh.jpg',
          'https://img1.baidu.com/it/u=4286880693,2372408530&fm=253&fmt=auto&app=138&f=JPEG?w=760&h=456',
          'https://img.zcool.cn/community/01f3e260bd78c611013f4720875de6.png@1280w_1l_2o_100sh.png'
        ],
        result:''
      }
      
    },
    mounted() {
      console.log(document.getElementById('ovo'))
      // console.log("qwq")
      // console.log(document.getElementsByClassName("qwq"))
      // this.drawLine();
    },
    methods: {
      logqwq(){
        this.$nextTick(()=>{
          this.getData();
          console.log(document.getElementById('qwq'))
        })
        
      },
      drawLine() {
        const chartDom = document.getElementById("qwq");
        if (chartDom) { // 确保DOM元素存在
          let myChart = echarts.init(chartDom);
          myChart.setOption({
             title:{
              text:'高校招生计划对比图'
             },
            tooltip:{
              trigger:'item'
            },
            legend:{
              top:'5%',
              left:'center'
            },
            series:[
              {
                title:'高校招生计划对比图',
                name:'qwq',
                type:'pie',
                radius:['40%','70%'],
                avoidLabelOverlap:false,
                itemStyle:{
                  borderRadius:10,
                  borderColor:'#fff',
                  borderWidth:2
                },
                label:{
                  show:false,
                  position:'center'
                },
                emphasis:{
                  label:{
                    show:true,
                    fontSize:'20',
                    fontWeight:'bold'
                  }
                },
                labelLine:{
                  show:false
                },
                data:this.result
              }
            ]
          });
          
        }
        
        
      },
      async recommend() {
        try {
          const result = await request.get('toudang/toudang1', {
            params: {
              place: this.person.place
            }
          });
          console.log(result);
          this.result=result
          this.toudangList = result.data; // 确保 result.data 是数组
        } catch (error) {
          console.error('API请求失败', error);
        }
       
        
      },
      async getData(){
        const result = await request.get('toudang/toudang1', {
            params: {
              place: this.person.place
            }
          });
          const dataArray = result.data;
          console.log(dataArray);
          
          this.result=dataArray.map(item=>{
            return{
              value:item.planNum,
              name:item.schoolname
            }
          })
          console.log(this.result);
          this.drawLine()
      }
    }
  }
  </script>
  
  <style scoped>
  *{padding: 0; margin: 0;}
  
  #qwq { margin: auto; width: 100%; height: 400px; } /* 确保有高度和宽度 */
  
  .lunbo {
    .Carousel {
      border-radius: 10px;
    }
  }
  .biaodan {
    background-color: #ffffff;
    box-shadow: 0 2px 4px rgba(0, 0, 0, .12), 0 0 6px rgba(0, 0, 0, .04);
    height: 1000px;
    border-radius: 10px;
    padding: 20px;
    margin: 10px;
  }
  
  .danxuan, .shouxuan, .cixuan, .shuru {
    margin-bottom: 70px;
  }
  
  .el-radio, .el-checkbox {
    margin-right: 10px;
  }
  
  .el-input {
    margin-bottom: 15px;
  }
  
  .el-row {
    margin-bottom: 10px;
  }
  
  .el-button {
    display: block;
    width: 100%;
    margin-top: 20px;
  }
  
  h4 {
    margin-bottom: 10px;
    font-weight: bold;
  }
  
  span {
    display: block;
    margin-bottom: 10px;
    font-size: 20px;
    font-weight: bold;
  }
  table {
        width: 100%;
        margin: 20px auto;
        border-collapse: collapse;
        font-family: Arial, sans-serif;
      }
      th, td {
        border: 1px solid #ddd;
        padding: 8px;
        text-align: center;
      }
      th {
        background-color: #f2f2f2;
        font-weight: bold;
      }
      tr:nth-child(even) {
        background-color: #f9f9f9;
      }
      tr:hover {
        background-color: #e2e2e2;
      }
  </style>
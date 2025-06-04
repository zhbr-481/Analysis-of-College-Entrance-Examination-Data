<template>
  <div class="box">
    <h1>各省高考难度数据分析</h1>

    <!-- 图表一 -->
    <div id="chart-container-1" style="width: 100%; height: 350px;"></div>

    <!-- 表格 1-->
    <div id="table1">
      <table border="1" style="border-collapse: collapse; width: 100%;">
        <caption>高考报名人数统计表</caption>
        <thead>
        <tr>
          <th>年份</th>
          <th v-for="(year, index) in chartData.xData" :key="index">{{ year }}</th>
        </tr>
        </thead>
        <tbody>
        <tr>
          <th>高考报名人数/人</th>
          <td v-for="(item, index) in chartData.yData1" :key="index">{{ item }}</td>
        </tr>
        </tbody>
      </table>
    </div>

    <br><br>

    <!-- 图表二 -->
    <div id="chart-container-2" style="width: 100%; height: 350px;"></div>
    <div id="table2">
      <table border="1" style="border-collapse: collapse; width: 100%;">
        <caption>高考录取人数统计表</caption>
        <thead>
        <tr>
          <th>年份</th>
          <th v-for="(year, index) in chartData2.xData" :key="index">{{ year }}</th>
        </tr>
        </thead>
        <tbody>
        <tr>
          <th>高考报名人数</th>
          <td v-for="(item, index) in chartData2.yData1" :key="index">{{ item }}</td>
        </tr>
        </tbody>
      </table>
    </div>
    <br><br>
    <div id="chart-container-3" style="width: 100%; height: 350px;"></div>
    <!-- 表格三 -->
    <div id="table2">
      <table border="1" style="border-collapse: collapse; width: 100%;">
        <caption>高考录取率统计表</caption>
        <thead>
        <tr>
          <th>年份</th>
          <th v-for="(year, index) in chartData3.xData" :key="index">{{ year }}</th>
        </tr>
        </thead>
        <tbody>
        <tr>
          <th>高考录取率/%</th>
          <td v-for="(item, index) in chartData3.yData1" :key="index">{{ item }}</td>
        </tr>
        </tbody>
      </table>
    </div>
  </div>
</template>

<script>
import * as echarts from 'echarts'; // 引入 ECharts

export default {
  data() {
    return {
      chartData: {
        xData: ['2020年', '2021年', '2022年', '2023年', '2024年'],
        yData1: [769325, 795000, 867000, 980000, 998000], // 高考报名人数
      },
      chartData2: {
        xData: ['2020年', '2021年', '2022年', '2023年', '2024年'],
        yData1: [654824, 688509, 743747, 790714, 818731] // 高考录取人数
      },
      chartData3: {
        xData: ['2020年','2021年','2022年','2023年','2024年'],
        yData1: [ 90.45, 86.60, 85.78, 80.69,82.03 , ]
      },
    };
  },
  mounted() {
    // 初始化图表
    this.initChart1();
    this.initChart2();
    this.initChart3();
  },
  methods: {
    initChart1() {
      let chart = echarts.init(document.getElementById('chart-container-1'));
      let option = {
        xAxis: {
          type: 'category',
          data: this.chartData.xData,
        },
        yAxis: {
          type: 'value',
        },
        tooltip: {
          trigger: 'item',
        },
        legend: {
          data: ['高考报名人数'],
        },
        series: [
          {
            data: this.chartData.yData1,
            type: 'line',
            name: '高考报名人数',
            lineStyle: {
              color: 'red',
            },
          },
        ],
      };

      chart.setOption(option);
    },
    initChart2() {
      let lineChart = echarts.init(document.getElementById('chart-container-2'));
      let lineOption = {
        xAxis: {
          type: 'category',
          data: this.chartData2.xData,
        },
        yAxis: {
          type: 'value',
          axisLabel: {
            formatter: '{value}', // 设置y轴标签格式
          },
        },
        tooltip: {
          trigger: 'item',
        },
        legend: {
          data: ['高考录取人数'],
        },
        series: [
          {
            data: this.chartData2.yData1,
            type: 'line',
            name: '高考录取人数',
            lineStyle: {
              color: 'blue', // 将折线颜色修改为蓝色
            },
          },
        ],
      };

      lineChart.setOption(lineOption);
    },
    initChart3() {
      let lineChart = echarts.init(document.getElementById('chart-container-3'));
      let lineOption = {
        xAxis: {
          type: 'category',
          data: this.chartData3.xData,
        },
        yAxis: {
          type: 'value',
          axisLabel: {
            formatter: '{value}%', // 设置y轴标签格式为百分比
          },
        },
        tooltip: {
          trigger: 'item',
        },
        legend: {
          data: ['高考录取率'],
        },
        series: [
          {
            data: this.chartData3.yData1,
            type: 'line',
            name: '高考录取率',
            lineStyle: {
              color: 'blue', // 将折线颜色修改为蓝色
            },
          },
        ],
      };

      lineChart.setOption(lineOption);
    },

  },
};
</script>

<style scoped>
.box {
  padding: 20px;
  background: linear-gradient(to left, #ffffff, #ffffff); 
}
table {
  margin-top: 20px;
  width: 100%;
}
th, td {
  padding: 10px;
  text-align: center;
}
</style>



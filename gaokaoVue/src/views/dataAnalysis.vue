<template>
  <div class="box1">
    <!-- 图表一 -->
    <h1>（一）近年全国高考报名人数、录取人数、录取率分析</h1>
    <div id="chart-container" style="width: 100%; height: 350px;"></div>
    <!-- 表格一 -->
    <div id="table1">
      <table border="1" collapse="0" >
      <caption>高考报名人数和录取人数统计表</caption>
      <thead>
        <tr>
          <th>年份</th>
          <th>2015年</th>
          <th>2016年</th>
          <th>2017年</th>
          <th>2018年</th>
          <th>2019年</th>
          <th>2020年</th>
          <th>2021年</th>
          <th>2022年</th>
          <th>2023年</th>
          <th>2024年</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <th>高考报名人数/万</th>
          <td>942</td>
          <td>940</td>
          <td>940</td>
          <td>975</td>
          <td>1031</td>
          <td>1071</td>
          <td>1078</td>
          <td>1193</td>
          <td>1291</td>
          <td>1342</td>
        </tr>
        <tr>
          <th>录取人数/万</th>
          <td>737.85</td>
          <td>748.61</td>
          <td>761.49</td>
          <td>790.99</td>
          <td>914.90</td>
          <td>967.45</td>
          <td>1001.3</td>
          <td>1014.5</td>
          <td>1042.2</td>
          <td>1043</td>
        </tr>
        </tbody>
      </table>
    </div>
    <br><br>
    <!-- 图表二 -->
    <div id="line-chart" style="width: 100%; height: 350px;"></div>
    <!-- 表格二 -->
    <div id="table2">
      <table border="1" collapse="0" style="height: 100px;" >
        <caption>高考录取率统计表</caption>
      <thead>
        <tr>
          <th>年份</th>
          <th>2015年</th>
          <th>2016年</th>
          <th>2017年</th>
          <th>2018年</th>
          <th>2019年</th>
          <th>2020年</th>
          <th>2021年</th>
          <th>2022年</th>
          <th>2023年</th>
          <th>2024年</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <th>高考录取率</th>
          <td>78.33%</td>
          <td>79.64%</td>
          <td>81.01%</td>
          <td>81.13%</td>
          <td>88.74%</td>
          <td>90.33%</td>
          <td>92.89%</td>
          <td>85.04%</td>
          <td>80.72%</td>
          <td> </td>
        </tr>
      </tbody>
      </table>
    </div>
    <br><br>
    <div>
      <p>从上表可以看出，从2015-2024年高考报名人数和录取人数（注：这里的录取人数包括全国普通、职业本专科招生人数）均呈上升趋势。其中，高考报名人数在2021年后增幅变大；录取人数在2019年增幅最大，2020年之后虽在上升但增幅不大。综合高考报名人数和录取人数的变化情况，高考录取率在2021年之前呈上升趋势，但2021年之后出现下降趋势。由此看来，随着大家对教育关注的不断加强及我国整体教育水平的提高，近几年高中升学竞争压力有加强趋势。</p>
    </div>
    <!-- 图表三 -->
    <h1>（二）近年全国普通高校招生人数分析</h1>
    <div id="chart-container3" style="width: 100%; height: 350px;"></div>
    <!-- 表格三 -->
    <div id="table3">
      <table border="1" collapse="0" >
        <caption>高考录取率统计表</caption>
      <thead>
        <tr>
          <th>年份</th>
          <th>2015年</th>
          <th>2016年</th>
          <th>2017年</th>
          <th>2018年</th>
          <th>2019年</th>
          <th>2020年</th>
          <th>2021年</th>
          <th>2022年</th>
          <th>2023年</th>
          
        </tr>
      </thead>
      <tbody>
        <tr>
          <th>普通高校招生数/万</th>
          <td>802.36</td>
          <td>815.32</td>
          <td>842.10</td>
          <td>876.79</td>
          <td>1006.55</td>
          <td>1078.11</td>
          <td>1118.97</td>
          <td>1138.77</td>
          <td>1172.39</td>
        </tr>
      </tbody>
      </table>
    </div>
    <br><br>
    <!-- 图表四 -->
    <div id="chart-container4" style="width: 100%; height: 350px;"></div>
    <!-- 表格四 -->
    <div id="table4">
      <table border="1" collapse="0" >
      <caption>高考报名人数和录取人数统计表</caption>
      <thead>
        <tr>
          <th>年份</th>
          <th>2015年</th>
          <th>2016年</th>
          <th>2017年</th>
          <th>2018年</th>
          <th>2019年</th>
          <th>2020年</th>
          <th>2021年</th>
          <th>2022年</th>
          <th>2023年</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <th>研究生招生数/万</th>
          <td>64.51</td>
          <td>66.71</td>
          <td>80.61</td>
          <td>85.8</td>
          <td>91.65</td>
          <td>110.66</td>
          <td>117.65</td>
          <td>124.25</td>
          <td>130.17</td>
          
        </tr>
        <tr>
          <th>普通本(专)科招生数/万</th>
          <td>737.85</td>
          <td>748.61</td>
          <td>761.49</td>
          <td>790.99</td>
          <td>914.90</td>
          <td>967.45</td>
          <td>1001.3</td>
          <td>1014.5</td>
          <td>1042.2</td>
          
        </tr>
        </tbody>
      </table>
    </div>
    <div>
      <p> 上表为2015-2023年普通高校招生人数统计图，从图表中可以看出，2015-2023年普通高校招生人数一直处于逐年上升趋势，尤其在2019年，上升幅度最大。普通高校招生人数包含了普通本（专）科招生数和研究生招生数，上表3-8便展现了2015-2023年这两类分别的招生人数变化，其中本（专）科招生人数高于研究生招生人数，两者一直处于逐年增加状态，而本（专）科招生人数在2019年提升幅度最大。</p>
    </div>
    <br><br>
    <h1>（三）近年全国本科和专科招生人数分析</h1>
    <!-- 图表五 -->
    <div id="chart-container5" style="width: 100%; height: 350px;"></div>
    <br><br>
    <!-- 图表五 -->
    <div id="chart-container6" style="width: 100%; height: 350px;"></div>
    <!-- 表格六 -->
    <div id="table6">
      <table border="1" collapse="1" >
      <thead>
        <tr>
          <th>年份</th>
          <th>2017年</th>
          <th>2018年</th>
          <th>2019年</th>
          <th>2020年</th>
          <th>2021年</th>
          <th>2022年</th>
          <th>2023年</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <th>本科录取率</th>
          <td>43.70%</td>
          <td>43.30%</td>
          <td>41.83%</td>
          <td>41.37%</td>
          <td>41.63%</td>
          <td>39.86%</td>
          <td>37.73%</td>
          
        </tr>
        <tr>
          <th>专科录取率</th>
          <td>37.31%</td>
          <td>37.83%</td>
          <td>46.91%</td>
          <td>48.96%</td>
          <td>51.26%</td>
          <td>45.18%</td>
          <td>43.00%</td>
          
        </tr>
        </tbody>
      </table>
    </div>
    <div>
      <p> 从上中可以看出，在2015-2023年间，本科招生人数（注：本科招生人数包括普通本科和职业本科招生人数）和专科招生人数（注：这里专科招生人数特指高职专科招生人数）均呈上升趋势，但专科招生人数上升速度整体上快于本科招生人数。并且，在2019年前，本科招生人数高于专科招生人数，2019年之后，专科招生人数超过了本科招生人数。在上表3-6中显示，本科录取率在2015-2023年间呈缓慢下降趋势，专科录取率整体呈上升趋势，尤其是2019-2021年间，专科录取率极大提升，但在2021年之后呈现下降趋势。究其原因，专科录取率上升与国家为培养更多技术型人才而导致高职院校扩招及初中升学普职分流政策促进选报职业院校人数增加以支撑扩招有一定关系；专科录取率下降与高考总报名人数增加影响报录比降低有一定关系。</p>
    </div>
    <br><br>
    <h1>（四）近年山东省高考报名人数、录取人数、录取率分析</h1>
    <!-- 图表七 -->
    <div id="chart-container7" style="width: 100%; height: 350px;"></div>
    <!-- 表格七 -->
    <div id="table7">
      <table border="1" collapse="0" >
      <thead>
        <tr>
          <th>年份</th>
          <th>2020年</th>
          <th>2021年</th>
          <th>2022年</th>
          <th>2023年</th>
          <th>2024年</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <th>山东省高考报考人数/万</th>
          <td>76.93</td>
          <td>79.50</td>
          <td>86.70</td>
          <td>97.76</td>
          <td>99.80</td>
          
        </tr>
        <tr>
          <th>山东省录取人数/万</th>
          <td>65.48</td>
          <td>68.85</td>
          <td>74.37</td>
          <td>79.07</td>
          <td> </td>
        </tr>
        </tbody>
      </table>
    </div>
    <br><br>
    <!-- 图表八 -->
    <div id="chart-container8" style="width: 100%; height: 350px;"></div>
    <!-- 表格八 -->
    <div id="table8">
      <table border="1" collapse="0" >
      <thead>
        <tr>
          <th>年份</th>
          <th>2020年</th>
          <th>2021年</th>
          <th>2022年</th>
          <th>2023年</th>
          
        </tr>
      </thead>
      <tbody>
        <tr>
          <th>全国高考录取率</th>
          <td>90.33%</td>
          <td>92.89%</td>
          <td>85.04%</td>
          <td>80.72%</td>
          
          
        </tr>
        <tr>
          <th>山东省高考录取率</th>
          <td>85.12%</td>
          <td>86.60%</td>
          <td>85.78%</td>
          <td>80.88%</td>
        </tr>
        </tbody>
      </table>
    </div>
    <div>
      <p>从上表中看出，2019-2023年山东省高考录取人数逐年提升；2019-2014年山东省高考报名整体人数也在上升，尤其是2022和2023年提升幅度最大，2024年提升速度变缓。从上表3-8中可以看出，2019-2023年无论全国还是山东省，高考录取率虽在2021年出现上升，但之后都处于下降趋势。另外，在上表3-8中，2021年后山东省高考录取率渐渐超过全国高考录取率。</p>
    </div>
    <br><br>
    <!-- 图表九 -->
    <h1>（五）近年山东本科和专科录取人数分析</h1>
    <div id="chart-container9" style="width: 100%; height: 350px;"></div>
    <br><br>
    <!-- 图表十 -->
    <div id="chart-container10" style="width: 100%; height: 350px;"></div>
   <div>
    <p>从上面图表中可以看出，2019-2023年山东省本科和专科录取人数都在逐年增加，其中专科录取人数增速尤为突出；另外，2020-2023年间，专科录取人数一直高于本科录取人数，并且两者的差距有逐渐拉大之势。这些现象，依然与国家注重增加技术型人才导致高职院校扩招及初中升学普职分流政策以支撑扩招有一定关系。

</p>
   </div>
    <!-- 表格十 -->
    <div id="table10">
      <table border="1" collapse="0" >
      <thead>
        <tr>
          <th>年份</th>
          <th>2020年</th>
          <th>2021年</th>
          <th>2022年</th>
          <th>2023年</th>
          
        </tr>
      </thead>
      <tbody>
        <tr>
          <th>山东省本科录取率</th>
          <td>37.28%</td>
          <td>37.03%</td>
          <td>35.99%</td>
          <td>32.73%</td>
          
          
        </tr>
        <tr>
          <th>山东省专科录取率</th>
          <td>47.85%</td>
          <td>49.57%</td>
          <td>49.80%</td>
          <td>48.15%</td>
        </tr>
        </tbody>
      </table>
    </div>
    <br><br>
    <!-- 图表十一 -->
    <div id="chart-container11" style="width: 100%; height: 350px;"></div>
  
    <!-- 表格十一 -->
    <div id="table11">
      <table border="1" collapse="0" >
      <thead>
        <tr>
          <th>年份</th>
          <th>2020年</th>
          <th>2021年</th>
          <th>2022年</th>
          <th>2023年</th>
          
        </tr>
      </thead>
      <tbody>
        <tr>
          <th>山东省本科录取率</th>
          <td>37.28%</td>
          <td>37.03%</td>
          <td>35.99%</td>
          <td>32.73%</td>
          
          
        </tr>
        <tr>
          <th>全国本科录取率</th>
          <td>41.37%</td>
          <td>41.63%</td>
          <td>39.86%</td>
          <td>37.73%</td>
        </tr>
        </tbody>
      </table>
    </div>
    <br><br>
    <!-- 图表十二 -->
    <div id="chart-container12" style="width: 100%; height: 350px;"></div>
    <div>
        <p>从上表中可以看出，即使2019-2023年全国和山东省本科录取人数在增加，但本科录取率都在逐年下降；另外，山东省本科录取率始终低于全国本科录取率。从上表3-12中可以看出，2019-2023年山东专科录取率始终保持上涨趋势；但全国专科录取率在2021年为上涨趋势，但之后进入下降趋势，并且全国专科录取率出现了低于山东省专科录取率的局面。</p>
      </div>
    <!-- 表格十二 -->
    <div id="table12">
      <table border="1" collapse="0" >
      <thead>
        <tr>
          <th>年份</th>
          <th>2020年</th>
          <th>2021年</th>
          <th>2022年</th>
          <th>2023年</th>
          
        </tr>
      </thead>
      <tbody>
        <tr>
          <th>山东省专科录取率</th>
          <td>47.07%</td>
          <td>49.57%</td>
          <td>49.80%</td>
          <td>48.15%</td>
          
          
        </tr>
        <tr>
          <th>全国专科录取率</th>
          <td>48.96%</td>
          <td>51.26%</td>
          <td>45.18%</td>
          <td>43.00%</td>
        </tr>
        
        </tbody>
      </table>
      
    </div>





















  </div>
</template>

<script>
import * as echarts from 'echarts';

export default {
  data() {
    return {
      // 图表数据
      chartData: {
        xData: ['2015年', '2016年', '2017年', '2018年', '2019年','2020年','2021年','2022年','2023年','2024年'],
        yData1: [942, 940, 940, 975, 1031,1071,1078,1193,1291,1342],
        yData2: [737.85,748.61,761.49,790.99,914.90,967.45,1001.3,1014.5,1042.2,1043,]
      },
      chartData2:{
        xData: ['2015年', '2016年', '2017年', '2018年', '2019年','2020年','2021年','2022年','2023年','2024年'],
        yData1: [78.33, 79.64, 81.01,81.13, 88.74, 90.33, 92.89, 85.04, 80.72, null, ]
      },
      chartData3: {
        xData: ['2015年', '2016年', '2017年', '2018年', '2019年', '2020年', '2021年', '2022年', '2023年'],
        yData1: [802.36,815.32,842.10,876.79,1006.55,1078.11,1118.97,1138.77,1172.39]
      },
      chartData4: {
        xData: ['2015年', '2016年', '2017年', '2018年', '2019年','2020年','2021年','2022年','2023年'],
        yData1: [64.51, 66.71, 80.61, 85.8, 91.65,110.66,117.65,124.25,130.17,],
        yData2: [737.85,748.61,761.49,790.99,914.90,967.45,1001.3,1014.5,1042.2,null,],
      },
      chartData5: {
        xData: ['2017年', '2018年', '2019年','2020年','2021年','2022年','2023年'],
        yData1: [410.75, 422.16, 431.29,443.12,448.74,475.57,487.15,],
        yData2: [350.74,368.83,483.61,524.34,552.58,538.98,555.07,]
      },
      chartData6: {
        xData: [ '2017年', '2018年', '2019年','2020年','2021年','2022年','2023年'],
        yData1: [43.70, 43.30, 41.83,41.37,41.63,39.86,37.73,],
        yData2: [37.31,37.83,46.91,48.96,51.26,45.18,43.00]
      },
      chartData7: {
        xData: [ '2020年','2021年','2022年','2023年','2024年'],
        yData1: [76.93,79.50,86.70,97.76,99.80],
        yData2: [65.48,68.85,74.37,79.07,null,]
      },
      chartData8: {
        xData: [ '2020年','2021年','2022年','2023年'],
        yData1: [90.33,92.89,85.04,80.72,],
        yData2: [85.12,86.60,85.78,80.88,]
      },
      chartData9: {
        xData: ['2020年','2021年','2022年','2023年'],
        yData1: [28.68,29.44,31.20,32.00],
        yData2: [36.81,39.41,43.18,47.07]
      },
      chartData10: {
        xData: ['2020年','2021年','2022年','2023年'],
        yData1: [37.28,37.03,35.99,32.73],
        yData2: [47.85,49.57,49.80,48.15]
      },
      chartData11: {
        xData: ['2020年','2021年','2022年','2023年'],
        yData1: [37.28,37.03,35.99,32.73],
        yData2: [41.37,41.63,39.86,37.73]
      },
      chartData12: {
        xData: ['2020年','2021年','2022年','2023年'],
        yData1: [47.07,49.57,49.80,48.15],
        yData2: [48.96,51.26,45.18,43.00]
      },

     
    };
  },
  mounted() {
    // 图表初始化
      //图一 
    this.initChart();
      // 图二
    this.initLineChart();
      // 图三
    this.initLineChart3();
      // 图四
    this.initLineChart4();
      //图五 
    this.initBarChart();
      // 图六
    this.initLineChart6();
      //图七 
    this.initLineChart7();
      //图八
    this.initLineChart8();
      // 图九
    this.initBarChart9();
      // 图十
    this.initLineChart10();
      // 图十一
    this.initLineChart11();
      // 图十二
    this.initLineChart12();
    


 

      
  },
  methods: {
     //图表一
    initChart() {
      let chart = echarts.init(document.getElementById('chart-container'));
      let option = {
        xAxis: {
          type: 'category',
          data: this.chartData.xData
        },
        yAxis: {
          type: 'value'
          
        },
        tooltip: {
          trigger: 'item' // 设置触发类型为点
        },
        // 增加图例
        legend: {
          data: ['高考报名人数', '录取人数']
        },
        series: [
          {
            data: this.chartData.yData1,
            type: 'line',
            name: '高考报名人数',
            lineStyle: {
          color: 'red' // 将折线颜色修改为红色
        }
          },
          {
            data: this.chartData.yData2,
            type: 'line',
            name: '录取人数'
          }
        ]
      };
     
      chart.setOption(option);
    },
    // 图表二
    initLineChart() {
      let lineChart = echarts.init(document.getElementById('line-chart'));
      
      let lineOption = {
        xAxis: {
          type: 'category',
          data: this.chartData2.xData  
        },
        yAxis: {
          type: 'value',
          axisLabel: { // 设置y轴标签格式为百分比
        formatter: '{value}%'
      }
        },
        tooltip: {
          trigger: 'item' // 设置触发类型为点
        },
        legend: {
          data: ['高考录取率']
        },
        series: [
          {
            data: this.chartData2.yData1,
            type: 'line',
            name: '高考录取率',
            lineStyle: {
          color: 'red' // 将折线颜色修改为红色
        }
          }
        ]
      };
     
      lineChart.setOption(lineOption);
    },
    // 图表三
    initLineChart3() {
  let lineChart3 = echarts.init(document.getElementById('chart-container3'));
  
  let lineOption3 = {
    xAxis: {
      type: 'category',
      data: this.chartData3.xData  
    },
    yAxis: {
      type: 'value'
    },
    tooltip: {
      trigger: 'item' // 设置触发类型为点
    },
    legend: {
      data: ['招生人数']
    },
    series: [
      {
        data: this.chartData3.yData1,
        type: 'line',
        name: '招生人数',
        lineStyle: {
          color: 'red' // 将折线颜色修改为红色
        }
      }
    ]
  };
 
  lineChart3.setOption(lineOption3);
    },
    //图表四 
    initLineChart4() {
          let chart = echarts.init(document.getElementById('chart-container4'));
          let option = {
            xAxis: {
              type: 'category',
              data: this.chartData4.xData
            },
            yAxis: {
              type: 'value'
            },
            tooltip: {
              trigger: 'item' // 设置触发类型为点
            },
            // 增加图例
            legend: {
              data: ['研究生招生数', '普通本(专)科招生数']
            },
            series: [
              {
                data: this.chartData4.yData1,
                type: 'line',
                name: '研究生招生数',
                lineStyle: {
          color: 'red' // 将折线颜色修改为红色
        }
              },
              {
                data: this.chartData4.yData2,
                type: 'line',
                name: '普通本(专)科招生数'
              }
            ]
          };
        
          chart.setOption(option);
    },
    // 图表五
    initBarChart() {
  let barChart = echarts.init(document.getElementById('chart-container5'));
  
  let barOption = {
    xAxis: {
      type: 'category',
      data: this.chartData5.xData
    },
    yAxis: {
      type: 'value'
    },
    tooltip: {
      trigger: 'item' // 设置触发类型为点
    },
    legend: {
      data: ['本科招生数', '高职专科招生数']
    },
    series: [
      {
        data: this.chartData5.yData1,
        type: 'bar',
        name: '本科生招生数',
        
      },
      {
        data: this.chartData5.yData2,
        type: 'bar',
        name: '高职专科招生数招生数'
      }
    ]
  };
 
  barChart.setOption(barOption);
    },
    // 图表六
    initLineChart6() {
  let lineChart6 = echarts.init(document.getElementById('chart-container6'));
  
  let lineOption6 = {
    xAxis: {
      type: 'category',
      data: this.chartData6.xData  
    },
    yAxis: {
      type: 'value',
      axisLabel: { // 设置y轴标签格式为百分比
        formatter: '{value}%'
          }
    },
    tooltip: {
      trigger: 'item' // 设置触发类型为点
    },
    legend: {
      data: ['本科录取率', '专科录取率']
    },
    series: [
      {
        data: this.chartData6.yData1,
        type: 'line',
        name: '本科录取率',
        lineStyle: {
          color: 'red' // 将折线颜色修改为红色
        }
      },
      {
        data: this.chartData6.yData2,
        type: 'line',
        name: '专科录取率'
      }
    ]
  };
 
  lineChart6.setOption(lineOption6);
    },
    
    // 图表七
  initLineChart7() {
  let lineChart7 = echarts.init(document.getElementById('chart-container7'));
  
  let lineOption7 = {
    xAxis: {
      type: 'category',
      data: this.chartData7.xData  
    },
    yAxis: {
      type: 'value',
      
    },
    tooltip: {
      trigger: 'item' // 设置触发类型为点
    },
    legend: {
      data: ['山东省高考报考人数','山东省录取人数']
    },
    series:  [
              {
                data: this.chartData7.yData1,
                type: 'line',
                name: '山东省高考报考人数',
                lineStyle: {
          color: 'red' // 将折线颜色修改为红色
        }
              },
              {
                data: this.chartData7.yData2,
                type: 'line',
                name: '山东省录取人数'
              }
            ]
  };
 
  lineChart7.setOption(lineOption7);
    },
    // 图表八
  initLineChart8() {
  let initLineChart8 = echarts.init(document.getElementById('chart-container8'));
  let lineOption8 = {
    xAxis: {
      type: 'category',
      data: this.chartData8.xData  
    },
    yAxis: {
      type: 'value',
      axisLabel: { // 设置y轴标签格式为百分比
        formatter: '{value}%'
      }
    },
    tooltip: {
      trigger: 'item' // 设置触发类型为点
    },
    legend: {
      data: ['山东省本科录取率','山东省专科录取率']
    },
    series:  [
              {
                data: this.chartData8.yData1,
                type: 'line',
                name: '山东省本科录取率',
                lineStyle: {
          color: 'red' // 将折线颜色修改为红色
        }
              },
              {
                data: this.chartData8.yData2,
                type: 'line',
                name: '山东省专科录取率'
              }
            ]
  };
 
  initLineChart8.setOption(lineOption8);
    },
    // 图表九
    initBarChart9() {
  let initBarChart9 = echarts.init(document.getElementById('chart-container9'));
  
  let barOption9 = {
    xAxis: {
      type: 'category',
      data: this.chartData9.xData
    },
    yAxis: {
      type: 'value'
    },
    tooltip: {
      trigger: 'item' // 设置触发类型为点
    },
    legend: {
      data: ['山东省本科录取率', '山东省专科录取率']
    },
    series: [
      {
        data: this.chartData9.yData1,
        type: 'bar',
        name: '山东省本科录取率'
      },
      {
        data: this.chartData9.yData2,
        type: 'bar',
        name: '山东省专科录取率'
      }
    ]
  };
 
  initBarChart9.setOption(barOption9)
    },
    // 图表十
    initLineChart10() {
  let initLineChart10 = echarts.init(document.getElementById('chart-container10'));
  let lineOption10 = {
    xAxis: {
      type: 'category',
      data: this.chartData10.xData  
    },
    yAxis: {
      type: 'value',
      axisLabel: { // 设置y轴标签格式为百分比
        formatter: '{value}%'
      }
    },
    tooltip: {
      trigger: 'item' // 设置触发类型为点
    },
    legend: {
      data: ['全国高考录取率','山东省高考录取率']
    },
    series:  [
              {
                data: this.chartData10.yData1,
                type: 'line',
                name: '全国高考录取率',
                lineStyle: {
          color: 'red' // 将折线颜色修改为红色
        }
              },
              {
                data: this.chartData10.yData2,
                type: 'line',
                name: '山东省高考录取率',
               
              }
            ]
  };
 
  initLineChart10.setOption(lineOption10);
    },
    // 图表十一
    initLineChart11() {
  let initLineChart11 = echarts.init(document.getElementById('chart-container11'));
  let lineOption11 = {
    xAxis: {
      type: 'category',
      data: this.chartData11.xData  
    },
    yAxis: {
      type: 'value',
      axisLabel: { // 设置y轴标签格式为百分比
        formatter: '{value}%'
      }
    },
    tooltip: {
      trigger: 'item' // 设置触发类型为点
    },
    legend: {
      data: ['山东省本科录取率','全国本科录取率']
    },
    series:  [
              {
                data: this.chartData11.yData1,
                type: 'line',
                name: '山东省本科录取率',
                lineStyle: {
          color: 'red' // 将折线颜色修改为红色
        }
              },
              {
                data: this.chartData11.yData2,
                type: 'line',
                name: '全国本科录取率'
              }
            ]
  };
 
  initLineChart11.setOption(lineOption11);
    },
    // 图表十二
    initLineChart12() {
  let initLineChart12 = echarts.init(document.getElementById('chart-container12'));
  let lineOption12 = {
    xAxis: {
      type: 'category',
      data: this.chartData12.xData  
    },
    yAxis: {
      type: 'value',
      axisLabel: { // 设置y轴标签格式为百分比
        formatter: '{value}%'
      }
    },
    tooltip: {
      trigger: 'item' // 设置触发类型为点
    },
    legend: {
      data: ['山东省专科录取率','全国专科录取率']
    },
    series:  [
              {
                data: this.chartData12.yData1,
                type: 'line',
                name: '山东省专科录取率',
                lineStyle: {
          color: 'red' // 将折线颜色修改为红色
        }
              },
              {
                data: this.chartData12.yData2,
                type: 'line',
                name: '全国专科录取率'
              }
            ]
  };
 
  initLineChart12.setOption(lineOption12);
    },




        
    }
};
</script>

<style>
.box1{
  background: linear-gradient(to bottom, #ffffff, #84b4e9); 
}
#table1 {
  margin: 0 25%; /* 设置表格水平居中 */
}
#table1 th, #table1 td {
  border: 1px solid #000; /* 添加边框样式 */
  width: 100px;
  height: 30px;
}

#table2 {
  margin: 0 25%; /* 设置表格水平居中 */
  
}
#table2 th, #table2 td {
  width: 100px;
  height: 30px;
}
#table3 {
  margin: 0 25%; /* 设置表格水平居中 */
}
#table3 th, #table3 td {
  width: 100px;
  height: 30px;
}
#table4 {
  margin: 0 25%; /* 设置表格水平居中 */
}
#table4 th, #table4 td {
  width: 100px;
  height: 30px;
}
#table6 {
  margin: 0 25%; /* 设置表格水平居中 */
  
}
#table6 th, #table6 td {
  width: 100px;
  height: 30px;
}
#table7 {
  margin: 0 30%; /* 设置表格水平居中 */
}
#table7 th, #table7 td {
  width: 100px;
  height: 30px;
}
#table8 {
  margin: 0 30%; /* 设置表格水平居中 */
}
#table8 th, #table8 td {
  width: 100px;
  height: 30px;
}
#table10 {
  margin: 0 30%; /* 设置表格水平居中 */
}
#table10 th, #table10 td {
  width: 100px;
  height: 30px;
}
#table11 {
  margin: 0 30%; /* 设置表格水平居中 */
}
#table11 th, #table11 td {
  width: 100px;
  height: 30px;
}
#table12 {
  margin: 0 30%; /* 设置表格水平居中 */
}
#table12 th, #table12 td {
  width: 100px;
  height: 30px;
}
</style>

<template>
  <div class="content">
    <div ref="charts" style="width: 1000px; height: 750px; margin: 0 auto"></div>
  </div>
</template>

<script>
import * as echarts from 'echarts';
import china from '../assets/china.json';
import shandong from '../assets/shandong.json'; // 导入山东省的地图数据
import { Title } from 'chart.js';

export default {
  data() {
    return {
      point: [
        { name: '北京', value: 115 },
        { name: '天津', value: 69 },
        { name: '河北', value: 134 },
        { name: '山西', value: 91 },
        { name: '内蒙古', value: 56 },
        { name: '辽宁', value: 132 },
        { name: '吉林', value: 81 },
        { name: '黑龙江', value: 94 },
        { name: '上海', value: 81 },
        { name: '江苏', value: 180 },
        { name: '浙江', value: 117 },
        { name: '安徽', value: 131 },
        { name: '福建', value: 91 },
        { name: '江西', value: 115 },
        { name: '山东', value: 172 },
        { name: '河南', value: 184 },
        { name: '湖北', value: 146 },
        { name: '湖南', value: 150 },
        { name: '广东', value: 179 },
        { name: '广西', value: 93 },
        { name: '海南', value: 26 },
        { name: '重庆', value: 76 },
        { name: '四川', value: 150 },
        { name: '贵州', value: 83 },
        { name: '云南', value: 92 },
        { name: '陕西', value: 111 },
        { name: '甘肃', value: 54 },
        { name: '青海', value: 15 },
        { name: '宁夏', value: 23 },
        { name: '新疆', value: 69 },
        { name: '西藏', value: 7 },
        { name: '澳门', value: 10 },
        { name: '香港', value: 12 },
        { name: '台湾', value: 159 },
      ],
      shandongCitiesData: [
        { name: '济南市', value: 21 },
        { name: '青岛市', value: 18 },
        { name: '淄博市', value: 12 },
        { name: '枣庄市', value: 7 },
        { name: '东营市', value: 6 },
        { name: '烟台市', value: 15 },
        { name: '潍坊市', value: 11 },
        { name: '济宁市', value: 9 },
        { name: '泰安市', value: 8 },
        { name: '威海市', value: 5 },
        { name: '日照市', value: 4 },
        { name: '莱芜市', value: 3 },
        { name: '临沂市', value: 13 },
        { name: '德州市', value: 10 },
        { name: '聊城市', value: 5 },
        { name: '滨州市', value: 6 },
        { name: '菏泽市', value: 7 },
      ],
    };
  },
  mounted() {
    this.initCharts();
  },
  methods: {
    initCharts() {
      const charts = echarts.init(this.$refs['charts']);

      const option = {
        title: {
    text: '全国高校分布数量',
    left: 'center',
    textStyle: {
      color: '#FFFFFF', // 设置字体颜色为金色（或者您想要的其他颜色）
      fontSize: 20,     // 设置字体大小
    }
  },
        backgroundColor: '#0E2152',
        tooltip: {
          show: true,
          trigger: 'item',
          formatter: (params) => {
            if (params.value) {
              return `${params.name}的数量: ${params.value}所`;
            }
            return params.name;
          },
          backgroundColor: 'rgba(0,0,0,0.16)',
          hideDelay: 100,
          triggerOn: 'mousemove',
          enterable: true,
          textStyle: {
            color: '#DADADA',
            fontSize: '12',
            overflow: 'break',
          },
          showDelay: 100,
        },
        geo: {
          map: 'china',
          label: {
            normal: {
              show: true,
              textStyle: {
                color: '#fff',
              },
            },
            emphasis: {
              textStyle: {
                color: '#fff',
              },
            },
          },
          itemStyle: {
            normal: {
              borderColor: 'rgba(147,235,248,1)',
              borderWidth: 1,
              areaColor: {
                type: 'radial',
                x: 0.5,
                y: 0.5,
                r: 0.5,
                colorStops: [
                  {
                    offset: 0,
                    color: 'rgba(0,102,154,0)',
                  },
                  {
                    offset: 1,
                    color: 'rgba(0,102,154,4)',
                  },
                ],
                globalCoord: false,
              },
              shadowColor: 'rgba(128,217,248,1)',
              shadowOffsetX: -2,
              shadowOffsetY: -2,
              shadowBlur: 10,
            },
            emphasis: {
              areaColor: '#2386AD',
              borderWidth: 0,
            },
          },
        },
        series: [
          {
            name: '数量',
            type: 'map',
            zoom: 1.2,
            data: this.point,
            geoIndex: 0,
            selectedMode: 'single',
            emphasis: {
              label: {
                show: true,
                color: '#fff',
              },
              itemStyle: {
                areaColor: '#2386AD',
                borderWidth: 0,
              },
            },
            selected: {
              '山东': true, // 初始选中山东省
            },
          },
        ],
      };

      // 注册中国地图和山东省的地图
      echarts.registerMap('china', china);
      echarts.registerMap('山东', shandong);

      charts.setOption(option);

      // 监听地图点击事件
      charts.on('click', (params) => {
        if (params.name === '山东') {
          this.drillDownShandong();
        }
        // 可以根据需要添加其他省份的处理逻辑
      });

      window.addEventListener('resize', () => {
        charts.resize();
      });
    },
    drillDownShandong() {
      const charts = echarts.getInstanceByDom(this.$refs['charts']);
      if (charts) {
        const option = charts.getOption();
        option.geo[0].map = '山东';
        option.series[0].data = this.shandongCitiesData; // 更新为山东省各市的大学数据
        charts.clear();
        charts.setOption(option);
      }
    },
  },
};
</script>

<style scoped>
.content {
  background-color: #0e2152;
  height: 100%;
}
</style>

<template>
  
  <div id="map-container" style="width: 100%; height: 900px;">
    
  </div>
  
</template>

<script>
import * as echarts from 'echarts';
import { defineComponent, onMounted } from 'vue';
import chinaGeoJson from '@/assets/china.json';  // 引入地图数据

export default defineComponent({
  name: 'GaokaoMap',
  setup() {
    onMounted(() => {
      // 注册地图
      echarts.registerMap('china', chinaGeoJson);

      const chart = echarts.init(document.getElementById('map-container'));

      // 省份的高考难度数据（示例）
      const data = [
        {name: '北京', value: 90},  // 极难
        {name: '上海', value: 90},  // 极难
        {name: '广东', value: 85},  // 很难
        {name: '江苏', value: 85},  // 很难
        {name: '浙江', value: 80},  // 很难
        {name: '天津', value: 80},  // 很难
        {name: '山东', value: 75},  // 难
        {name: '河南', value: 75},  // 难
        {name: '重庆', value: 70},  // 难
        {name: '陕西', value: 70},  // 难
        {name: '黑龙江', value: 65},  // 中等
        {name: '吉林', value: 65},  // 中等
        {name: '辽宁', value: 65},  // 中等
        {name: '四川', value: 60},  // 中等
        {name: '湖北', value: 60},  // 中等
        {name: '湖南', value: 60},  // 中等
        {name: '江西', value: 60},  // 中等
        {name: '福建', value: 55},  // 容易
        {name: '安徽', value: 55},  // 容易
        {name: '河北', value: 50},  // 容易
        {name: '山西', value: 50},  // 容易
        {name: '内蒙古', value: 45},  // 容易
        {name: '广西', value: 45},  // 容易
        {name: '云南', value: 40},  // 非常容易
        {name: '贵州', value: 40},  // 非常容易
        {name: '西藏', value: 35},  // 非常容易
        {name: '海南', value: 35},  // 非常容易
        {name: '甘肃', value: 30},  // 非常容易
        {name: '青海', value: 30},  // 非常容易
        {name: '新疆', value: 25},  // 非常容易
        {name: '宁夏', value: 25},  // 非常容易
        {name: '澳门', value: 20},  // 非常容易
        {name: '香港', value: 20},  // 非常容易
        {name: '台湾', value: 15}   // 非常容易
      ];

      // 难度梯度映射
      const difficultyMapping = {
        '极难': '极难',
        '很难': '很难',
        '难': '难',
        '中等': '中等',
        '容易': '容易',
        '非常容易': '非常容易'
      };

      // 配置项
      const option = {
        title: {
          text: '中国高考难度地图',
          left: 'center'
        },
        tooltip: {
          trigger: 'item',
          formatter: function (params) {
            // 根据 value 获取梯度描述
            let difficulty;
            if (params.value > 90) {
              difficulty = '极难';
            } else if (params.value > 70) {
              difficulty = '很难';
            } else if (params.value > 50) {
              difficulty = '难';
            } else if (params.value > 30) {
              difficulty = '中等';
            } else if (params.value > 10) {
              difficulty = '容易';
            } else {
              difficulty = '非常容易';
            }
            return `${params.name}<br/>难度: ${difficulty}`;
          }
        },
        visualMap: {
          min: 0,
          max: 100,
          splitNumber: 6, // 设置为6个挡位
          text: ['难', '易'], // 图例文字
          realtime: false,
          calculable: true,
          inRange: {
            color: ['#f8d7da', '#f5c6cb', '#f1a6a8', '#e63946', '#c8102e', '#6c1d1d'] // 红色渐变色，差距大一点
          },
          pieces: [
            {gt: 90, label: '极难', color: '#6c1d1d'},
            {gt: 70, lte: 90, label: '很难', color: '#c8102e'},
            {gt: 50, lte: 70, label: '难', color: '#e63946'},
            {gt: 30, lte: 50, label: '中等', color: '#f1a6a8'},
            {gt: 10, lte: 30, label: '容易', color: '#f5c6cb'},
            {lte: 10, label: '非常容易', color: '#f8d7da'}
          ]
        },
        series: [
          {
            name: '难度',
            type: 'map',
            map: 'china',
            roam: false,
            label: {
              show: true
            },
            data: data
          }
        ]
      };

      // 使用配置项
      chart.setOption(option);

      // 监听窗口大小变化
      window.addEventListener('resize', () => {
        chart.resize();
      });
    });
  }
});
</script>

<style scoped>
#map-container {
  width: 100%;
  height: 100%;
}
</style>

<!--高考报名变化数据趋势-->
<script>
import trendMap from "@/views/trendMap.vue";
import trendbiao from "@/views/trendbiao.vue";
export default {
components:{
  trendMap,
  trendbiao
}
}
</script>

<template>
  <div>
    <el-card class="box-card">
      <div>
        <el-row :gutter="20">
          <el-col :span="12">
            <trendbiao/>
          </el-col>
          <el-col :span="12">
            <div class="analysis-section">
              <h1>分析</h1>
              <h3>总体趋势 (2020-2024)</h3>
              <p>
                根据2020年至2024年的数据分析，高考报名人数和录取人数呈现整体上升的趋势。特别是自2021年起，报名人数的增幅显著增大，而录取人数在2019年达到最大增幅后，尽管继续上升，但增幅相对较小。
              </p>
              <h3>高校招生情况</h3>
              <p>
                从2020年到2023年，普通高校的招生人数一直在增长，尤以2021年增长最为明显。普通高校招生人数由普通本（专）科和研究生的招生构成。
              </p>
              <h3>本科与专科招生</h3>
              <p>
                在本科和专科招生方面，自2020年以来，招生人数均为上升趋势。然而，专科招生人数的增长速度整体上超过本科招生人数。2021年后，专科招生人数反超本科。
              </p>
              <h3>录取率变化</h3>
              <p>
                本科录取率在2020年至2023年间缓慢下降，而专科录取率总体上升，尤其是在2021年至2023年间。
              </p>
              <h3>山东省情况</h3>
              <p>
                在山东省，2020年至2023年高考录取人数逐年增加，尤其是在2022年和2023年。2021年后山东省的高考录取率开始超过全国平均水平。
              </p>
              <h3>结论</h3>
              <p>
                虽然全国和山东省的本科录取人数在增加，但本科录取率却在下降。此外，山东省的本科录取率始终低于全国平均水平。在专科方面，山东省的录取率从2020年至2023年持续上升。
              </p>
            </div>
          </el-col>
        </el-row>
      </div>

    </el-card>
  </div>
</template>

<style scoped>
.analysis-section {
  background-color: #f9f9f9;
  padding: 15px;
  border-radius: 10px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  overflow-y: auto;
  max-height: 800px; 
}

.analysis-section h2 {
  font-size: 24px;
  margin-bottom: 10px;
  color: #333;
}

.analysis-section p {
  font-size: 14px;
  line-height: 1.6;
  color: #555;
  margin-bottom: 10px;
  margin-top: 15px;
}
</style>
<script>
export default {
  methods: {
    navigateToHomeBA(region) {
      this.$router.push({ path: '/homeBA', query: { region } });
    }
  }
}
</script>

<template>
<div>
  <el-container>
    <el-header class="el-header">
      <div><p style="font-weight: bold;font-size: 35px;color:dimgray;font-family: '华文新魏';" >热门院校</p></div>

      <div ><el-button type="text"  class="huan" ><i class="el-icon-refresh"></i>换一换</el-button></div>
    </el-header>
<!--    内容-->
    <el-main>
      <el-row :gutter="20">
        <el-col :span="6" >
          <el-card shadow="always" class="A">
            <a @click="navigateToHomeBA('region1')" target="_blank">
            <div class="wenzi" style="height: 320px">
              <h2>山东商业职业技术学院</h2>
              <div class="A-a">
                <div>财经类</div>
                <div>公办</div>
              </div>
              <img src="https://s.cn.bing.net/th?id=OJ.FLmMVOSu0s7k0w&qlt=80&o=6&dpr=2&pid=SANGAM">
            </div>
            </a>
          </el-card>
        </el-col>

        <el-col :span="9">
          <el-card shadow="always" class="B">
            <a @click="navigateToHomeBA('region2')" target="_blank">
            <el-row class="B-b">
              <el-col :span="4">
                <img src="https://s.cn.bing.net/th?id=OJ.KW4rei4n3VyeyQ&qlt=80&o=6&dpr=2&pid=SANGAM">
              </el-col>
              <el-col :span="20">
                <div class="wenzi">
                  <h2>山东大学 </h2>
                  <div class="A-a" style="margin-left: 40px">
                    <div>综合类</div>
                    <div>公办</div>
                  </div>
                </div>
              </el-col>
            </el-row>
            </a>
          </el-card>

          <el-card shadow="always" class="B" style="margin-top: 20px">
            <a @click="navigateToHomeBA('region3')" target="_blank">
            <el-row class="B-b">
              <el-col :span="4">
                <img src="
               https://s4.cn.bing.net/th?id=OJ.zQ4Vw0wPRsiDmQ&qlt=80&o=6&dpr=2&pid=SANGAM">
              </el-col>
              <el-col :span="20">
                <div class="wenzi">
                  <h2>中国海洋大学 </h2>
                  <div class="A-a" style="margin-left: 40px">
                    <div>综合类</div>
                    <div>公办</div>
                  </div>
                </div>
              </el-col>
            </el-row>
            </a>
          </el-card>

          <el-card shadow="always" class="B" style="margin-top: 20px">
            <a @click="navigateToHomeBA('region4')" target="_blank">
            <el-row class="B-b">
              <el-col :span="4">
                <img src="
                https://s4.cn.bing.net/th?id=OJ.TecrcmCmmdGfXA&qlt=80&o=6&dpr=2&pid=SANGAM">
              </el-col>
              <el-col :span="20">
                <div class="wenzi">
                  <h2>中国石油大学</h2>
                  <div class="A-a" style="margin-left: 40px">
                    <div>理工类</div>
                    <div>公办</div>
                  </div>
                </div>
              </el-col>
            </el-row>
            </a>
          </el-card>
        </el-col>

        <el-col :span="9">
          <el-card shadow="always" class="B">
            <a @click="navigateToHomeBA('region5')" target="_blank">
            <el-row class="B-b">
              <el-col :span="4">
                <img src="
               https://s3.cn.bing.net/th?id=OJ.KermwdXI6vN0AQ&qlt=80&o=6&dpr=2&pid=SANGAM">
              </el-col>
              <el-col :span="20">
                <div class="wenzi">
                  <h2>青岛科技大学 </h2>
                  <div class="A-a" style="margin-left: 40px">
                    <div> 理工类</div>
                    <div>公办</div>
                  </div>
                </div>
              </el-col>
            </el-row>
            </a>
          </el-card>

          <el-card shadow="always" class="B" style="margin-top: 20px">
            <a @click="navigateToHomeBA('region6')" target="_blank">
            <el-row class="B-b">
              <el-col :span="4">
                <img src="
               https://s4.cn.bing.net/th?id=OJ.8k1jj0QmiQbgOw&qlt=80&o=6&dpr=2&pid=SANGAM">
              </el-col>
              <el-col :span="20">
                <div class="wenzi">
                  <h2>青岛理工大学</h2>
                  <div class="A-a" style="margin-left: 40px">
                    <div> 理工类</div>
                    <div>公办</div>
                  </div>
                </div>
              </el-col>
            </el-row>
            </a>
          </el-card>

          <el-card shadow="always" class="B" style="margin-top: 20px">
            <a @click="navigateToHomeBA('region7')" target="_blank">
            <el-row class="B-b">
              <el-col :span="4">
                <img src="
                https://s2.cn.bing.net/th?id=OJ.UsKNEEselfjlXg&qlt=80&o=6&dpr=2&pid=SANGAM">
              </el-col>
              <el-col :span="20">
                <div class="wenzi">
                  <h2>临沂大学 </h2>
                  <div class="A-a" style="margin-left: 40px">
                    <div>综合类</div>
                    <div>公办</div>
                  </div>
                </div>
              </el-col>
            </el-row>
            </a>
          </el-card>
        </el-col>
      </el-row>
    </el-main>
  </el-container>
</div>
</template>

<style scoped lang="less">
.A:hover{
  box-shadow: 10px 10px 10px rgba(0,0,0,0.5);
}
.el-header{
  display: flex;
  justify-content: space-between; //水平上两端显示
  align-items: center; //垂直上垂直居中
}
.wenzi {
  img{
    position: relative;
    top: 10px;
    left:30px;
    margin-bottom: 10px;
  }
  h2{
    text-align: center;
  }

  .A-a {
    margin-top: 10px;
    display: flex;
    justify-content: space-between; //水平上两端显示
    align-items: center; //垂直上垂直居中
  }
}
.B{
  .B-b{
    height: 65px;
    img{
      height: 70px;
      width: 70px;
    }
  }
}
.B:hover{
  box-shadow: 10px 10px 10px rgba(0,0,0,0.5);
}
.huan{
  border: white;
}
.huan :hover{
  color: #007bff;
}
</style>
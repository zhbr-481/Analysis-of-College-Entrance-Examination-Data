<script>
export default {

}
</script>

<template>
  <div>
    <el-row :gutter="20">
      <el-col :span="12">
        <el-header class="el-header">
          <div><p style="font-weight:bold;font-size: 30px;color:white;font-family: '华文新魏'">热门专业(本科)</p></div>
          <div><el-button type="text" class="huan"><i class="el-icon-refresh"></i>换一换</el-button></div>
        </el-header>
        <el-row :gutter="20">
          <el-col :span="8">
            <div class="zhuanye">
              <el-card shadow="always" class="color">
                1.计算机科学与技术
              </el-card>
            </div>
          </el-col>
          <el-col :span="8">
            <div class="zhuanye">
              <el-card shadow="always" class="color">
                2.电气工程及其自动化
              </el-card>
            </div>
          </el-col>
          <el-col :span="8">
            <div class="zhuanye">
              <el-card shadow="always" class="color">
                3.电子信息工程
              </el-card>
            </div>
          </el-col>
        </el-row>
        <el-row :gutter="20">
          <el-col :span="8">
            <div class="zhuanye">
              <el-card shadow="always" class="color">
                4.临床医学
              </el-card>
            </div>
          </el-col>
          <el-col :span="8">
            <div class="zhuanye">
              <el-card shadow="always" class="color">
                5.软件工程
              </el-card>
            </div>
          </el-col>
          <el-col :span="8">
            <div class="zhuanye">
              <el-card shadow="always" class="color">
                6.法学
              </el-card>
            </div>
          </el-col>
        </el-row><el-row :gutter="20">
        <el-col :span="8">
          <div class="zhuanye">
            <el-card shadow="always" class="color">
              7.汉语言文学
            </el-card>
          </div>
        </el-col>
        <el-col :span="8">
          <div class="zhuanye">
            <el-card shadow="always" class="color">
              8.会计学
            </el-card>
          </div>
        </el-col>
        <el-col :span="8">
          <div class="zhuanye">
            <el-card shadow="always" class="color">
              9.通信工程
            </el-card>
          </div>
        </el-col>
      </el-row>
      <div class="bottom-remen"></div>
      </el-col>
      <el-col :span="12">
        <el-header class="el-header" >
          <div><p style="font-weight:bold;font-size: 30px;color:white;font-family: '华文新魏'">热门专业(专科)</p></div>
          <div><el-button type="text" class="huan"><i class="el-icon-refresh"></i>换一换</el-button></div>
        </el-header>
        <el-row :gutter="20">
          <el-col :span="8">
            <div class="zhuanye">
              <el-card shadow="always" class="color">
                1.会计学
              </el-card>
            </div>
          </el-col>
          <el-col :span="8">
            <div class="zhuanye">
              <el-card shadow="always" class="color">
                2.护理
              </el-card>
            </div>
          </el-col>
          <el-col :span="8">
            <div class="zhuanye">
              <el-card shadow="always" class="color">
                3.机电一体化技术
              </el-card>
            </div>
          </el-col>
        </el-row><el-row :gutter="20">
        <el-col :span="8">
          <div class="zhuanye">
            <el-card shadow="always" class="color">
              4.电子商务
            </el-card>
          </div>
        </el-col>
        <el-col :span="8">
          <div class="zhuanye">
            <el-card shadow="always" class="color">
              5.人力资源管理
            </el-card>
          </div>
        </el-col>
        <el-col :span="8">
          <div class="zhuanye">
            <el-card shadow="always" class="color">
              6.计算机应用技术
            </el-card>
          </div>
        </el-col>
      </el-row><el-row :gutter="20">
        <el-col :span="8">
          <div class="zhuanye">
            <el-card shadow="always" class="color">
              7.学前教育
            </el-card>
          </div>
        </el-col>
        <el-col :span="8">
          <div class="zhuanye">
            <el-card shadow="always" class="color">
              8.铁道交通运营管理
            </el-card>
          </div>
        </el-col>
        <el-col :span="8">
          <div class="zhuanye">
            <el-card shadow="always" class="color">
              9.空中国乘务
            </el-card>
          </div>
        </el-col>

      </el-row>
        <div class="bottom-remen"></div>
      </el-col>
    </el-row>
  </div>
</template>

<style scoped lang="less">
.el-header{
  display: flex;
  justify-content: space-between; //水平上两端显示
  align-items: center; //垂直上垂直居中
  background-color: cornflowerblue;
  border-top-left-radius: 15px;
  border-top-right-radius: 15px;
  
}
.bottom-remen{
  background-color: cornflowerblue;
  width: 100%;
  height: 50px;
  position: relative;
  top: -25px;
  border-bottom-left-radius: 15px;
  border-bottom-right-radius: 15px;
}
.zhuanye{
  height: 100px;
}
.color{
  background-color:#f7fbff;
  //color: #2283fa;
  color: black;
  font-weight: bold;
  font-family: '幼圆';
}
.color:hover, .color:focus, .color:active{
  color: #0750fa;
  background-color: #f1f0f0;
  box-shadow: 0 10px 10px -10px rgba(0, 0, 0, 0.5);
  -webkit-transform: scale(1.1);
  transform: scale(1.1);
}

.huan{
  border: cornflowerblue;
  background-color: cornflowerblue;
  color: white;
}
.huan :hover{
  color: #666666;
}
</style>
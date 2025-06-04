<script>
export default {

}
</script>

<template>
  <div>
    <el-header class="el-header">
      <div style="position:relative;top: -10px"><p style="font-weight: bold;font-size: 35px;color:dimgray;font-family: '华文新魏';" >校园风光</p></div>
      <div ><el-button type="text" class="huan" ><i class="el-icon-refresh"></i>换一换</el-button></div>
    </el-header>
    <el-row :gutter="20">
      <el-col :span="6">
        <div class="zhuanye">
          <el-card shadow="always">
            <div class="img">
              <img src="https://static-data.eol.cn//upload/school/202116/1618562756_5619_thumb.jpg" alt="">
            </div>
            <div class="text-daxue">北京工业大学</div>
          </el-card>
        </div>
      </el-col>
      <el-col :span="6">
        <div class="zhuanye">
          <el-card shadow="always">
            <div class="img">
              <img src="https://static-data.eol.cn//upload/school/202116/1618565647_6827_thumb.jpg" alt="">
            </div>
            <div class="text-daxue">内蒙古大学</div>          </el-card>
        </div>
      </el-col>
      <el-col :span="6">
      <div class="zhuanye">
        <el-card shadow="always">
          <div class="img">
            <img src="https://static-data.eol.cn//upload/school/202016/1587016155_4926_thumb.jpg" alt="">
          </div>
          <div class="text-daxue">大连海事大学</div>
        </el-card>
      </div>
    </el-col>
      <el-col :span="6">
      <div class="zhuanye">
        <el-card shadow="always">
          <div class="img">
            <img src="https://static-data.eol.cn//upload/school/201904/1559641458_5452_thumb.jpg" alt="">
          </div>
          <div class="text-daxue">哈尔滨工业大学</div>
        </el-card>
      </div>
    </el-col>
    </el-row>
    <el-row :gutter="20" style="margin-top: 20px">
      <el-col :span="6">
        <div class="zhuanye">
          <el-card shadow="always">
            <div class="img">
              <img src="https://static-data.eol.cn//upload/school/202324/1684929895_5266_thumb.jpg" alt="">
            </div>
            <div class="text-daxue">云南大学</div>
          </el-card>
        </div>
      </el-col>
      <el-col :span="6">
        <div class="zhuanye">
          <el-card shadow="always">
            <div class="img">
              <img src="https://static-data.eol.cn//upload/school/202027/1606448683_4338_thumb.jpg" alt="">
            </div>
            <div class="text-daxue">长安大学</div>
          </el-card>
        </div>
      </el-col>
      <el-col :span="6">
        <div class="zhuanye">
          <el-card shadow="always">
            <div class="img">
              <img src="https://static-data.eol.cn//upload/school/202119/1618796914_5078_thumb.jpg" alt="">
            </div>
            <div class="text-daxue">西北大学</div>
          </el-card>
        </div>
      </el-col>
      <el-col :span="6">
        <div class="zhuanye">
          <el-card shadow="always">
            <div class="img">
              <img src="https://static-data.eol.cn//upload/school/20240701/1719797873_1951_thumb.jpg" alt="">
            </div>
            <div class="text-daxue">北京交通大学</div>
          </el-card>
        </div>
      </el-col>
    </el-row>
  </div>
</template>

<style scoped lang="less">
.el-header{
  display: flex;
  justify-content: space-between; //水平上两端显示
  align-items: center; //垂直上垂直居中
}
.img{
  width: 100%;
  padding: 0;

  img{
    width:100%;
    height: auto;

  }
}

.img{
  display: inline-block;
  vertical-align: middle;
  -webkit-transform: perspective(1px) translateZ(0);
  transform: perspective(1px) translateZ(0);
  box-shadow: 0 0 1px rgba(0, 0, 0, 0);
  position: relative;
}
.img:before{
  pointer-events: none;
  position: absolute;
  content: '';
  height: 0;
  width: 0;
  bottom: 0;
  right: 0;
  background: white;
  /* IE9 */
  background: linear-gradient(315deg, white 45%, #aaa 50%, #ccc 56%, white 80%);
  box-shadow: -1px -1px 1px rgba(0, 0, 0, 0.4);
  -webkit-transition-duration: 0.3s;
  transition-duration: 0.3s;
  -webkit-transition-property: width, height;
  transition-property: width, height;
}

.img:hover:before, .img:focus:before, .img:active:before{
  width: 25px;
  height: 25px;
}

.huan{
  border: white;
}
.text-daxue{
  color: black;
  position: relative;
  left: 70px;
  font-family: '幼圆';
  font-weight: bold;
}
.text-daxue:hover{
  color: skyblue;
}
</style>
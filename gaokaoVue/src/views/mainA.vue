<!--主页面框架-->
<script>
import CommonAside from "../components/CommonAside.vue";
import CommonHeader from "../components/CommonHeader.vue";
export default {
  data(){
    return{

    }
  },
  components:{
   CommonAside,
    CommonHeader
  }
}
</script>
<template>
  <div>
    <el-container>
      <el-aside width="auto">
<!--左侧导航-->
      <CommonAside/>
      </el-aside>
      <el-container>
        <el-header>
<!--          顶部导航-->
          <CommonHeader/>
        </el-header>
        <el-main>
          <!-- 子路由出口 -->
          <router-view></router-view>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>

<style lang="less" scoped>
.el-header{
  padding: 0;
}
</style>
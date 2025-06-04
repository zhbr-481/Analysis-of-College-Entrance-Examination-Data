<script>
export default {
  data() {
    return {}
  },
  methods: {
    goToLogin() {
      //跳转到/Login路由
      this.$router.push('/login');
    },
    handleMenu() {
      this.$store.commit('collapseMenu')
    }
  }
}
</script>

<template>
  <div class="header-container">
  
    <div class="l-content">
      <!--这个事件就是在点击的时候进入到store-tap.js里调用collapseMenu方法
          进行修改isCollapse，然后在CommonAside.vue里面对修改isCollapse-->
      <el-button @click="handleMenu" icon="el-icon-menu" size="mini"></el-button>
      <!--      面包屑区域-->
     
    </div>
    <p style="color: wheat">大鹏一日同风起，扶摇直上九万里</p>
    <div class="r-content">
      <el-dropdown>
      <span class="el-dropdown-link">
        <img class="user" src="https://q2.itc.cn/q_70/images03/20240807/9efb7d3e616440c6ab1d7e1d9b9be14f.jpeg" alt="用户头像">
      </span>
        <el-dropdown-menu slot="dropdown">
          <el-dropdown-item>
            <el-button @click="goToLogin" :style="{ border: 'none' }">个人中心</el-button>
          </el-dropdown-item>
          <el-dropdown-item>
            <el-button :style="{ border: 'none' }">退出</el-button>
          </el-dropdown-item>
        </el-dropdown-menu>
      </el-dropdown>
    </div>
  </div>
</template>

<style lang="less" scoped>
.header-container {
  padding: 0 20px; //按钮里边距
  background-color: #245ebb;
  height: 6vh;
  display: flex;
  justify-content: space-between; //水平上两端显示
  align-items: center; //垂直上垂直居中
}

.text {
  color: #fff;
  font-size: 14px;
  margin-left: 10px;
}

.r-content {
  .user {
    width: 40px;
    height: 40px;
    border-radius: 50%;
  }
}
</style>
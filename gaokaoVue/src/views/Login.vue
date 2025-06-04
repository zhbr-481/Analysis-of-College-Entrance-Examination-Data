<style>
.center {
  width: 100%;
  height: 100vh;
  background-image: url('https://img95.699pic.com/xsj/09/ln/s0.jpg%21/fh/300');
  background-size: cover;
  background-repeat: no-repeat;
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
}

h1 {
  font-size: 36px;
  color: #333;
  text-shadow: 1px 1px 2px rgba(0,0,0,0.5);
}

.logon {
  background-color: #fff;
  border-radius: 15px;
  box-shadow: 0 16px 32px rgba(0, 0, 0, 0.3), 0 12px 12px rgba(0, 0, 0, 0.2);
  width: 800px;
  max-width: 100%;
  min-height: 500px;
  margin-top: 20px;
  display: flex;
  background: linear-gradient(to right, #4284db, #29eac4);
}

.overlaylong {
  border-radius: 15px 0 0 15px;
  width: 50%;
  height: 100%;
  background-color: #fff;
  display: flex;
  align-items: center;
  justify-content: center;
}

.overlaylongleft {
  border-radius: 0 15px 15px 0;
  width: 50%;
  height: 100%;
  background-color: #fff;
  transform: translateX(100%);
  transition: transform 0.6s ease-in-out;
  display: flex;
  align-items: center;
  justify-content: center;
}

.overlaylongright {
  border-radius: 15px 0 0 15px;
  width: 50%;
  height: 100%;
  background-color: #fff;
  transform: translateX(0%);
  transition: transform 0.6s ease-in-out;
  display: flex;
  align-items: center;
  justify-content: center;
}

.overlaytitle {
  border-radius: 15px 0 0 15px;
  width: 50%;
  height: 100%;
  background-color: rgba(0, 0, 0, 0);
  display: flex;
  align-items: center;
  justify-content: center;
}

.overlaytitleH2 {
  font-size: 36px;
  color: #fff;
}

.overlaytitleP {
  font-size: 18px;
  color: #fff;
  margin-top: 10px;
}

.overlaytitleleft {
  border-radius: 15px 0 0 15px;
  width: 50%;
  height: 100%;
  background-color: rgba(0, 0, 0, 0);
  display: flex;
  align-items: center;
  justify-content: center;
  transform: translateX(0%);
  transition: transform 0.6s ease-in-out;
}

.overlaytitleright {
  border-radius: 15px 0 0 15px;
  width: 50%;
  height: 100%;
  background-color: rgba(0, 0, 0, 0);
  display: flex;
  align-items: center;
  justify-content: center;
  transform: translateX(-100%);
  transition: transform 0.6s ease-in-out;
}

.overlaytitle-Signin,
.overlaytitle-Signup {
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
}

.buttongohs {
  width: 200px;
  height: 50px;
  border-radius: 25px;
  border: 1px solid #fff;
  color: #fff;
  font-size: 18px;
  text-align: center;
  line-height: 50px;
  margin-top: 30px;
  cursor: pointer;
}

.overlaylongH2 {
  font-size: 30px;
  color: #333;
}

.overlaylong-Signin,
.overlaylong-Signup {
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
}

input {
  background-color: #f0f0f0;
  border: none;
  padding: 15px 20px;
  margin: 15px 0;
  width: 260px;
  border-radius: 5px;
  font-size: 16px;
}

h3 {
  font-size: 14px;
  margin-top: 15px;
  cursor: pointer;
  color: #29eac4;
}

.inupbutton {
  background-color: #29eac4;
  border: none;
  width: 200px;
  height: 50px;
  border-radius: 25px;
  font-size: 18px;
  color: #fff;
  text-align: center;
  line-height: 50px;
  margin-top: 30px;
  cursor: pointer;
}
</style>

<template>
  <div class="center">
    <h1 style="font-family: '华文新魏';font-size: 100px;color: #29eac4">高考数据分析系统</h1>
    <div class="logon">
      <div :class="overlaylong">
        <div class="overlaylong-Signin" v-if="disfiex == 0">
          <h2 class="overlaylongH2">登录</h2>
          <input type="text" placeholder="用户名" v-model="user.username">
          <input type="password" placeholder="密码" v-model="user.password">
          <h3>忘记密码?</h3>
          <button class="inupbutton" @click="login">登录</button>
<!--          <el-button :plain="true" @click="login" class="inupbutton">成功</el-button>-->

        </div>
        <div class="overlaylong-Signup" v-if="disfiex == 1">
          <h2 class="overlaylongH2">注册</h2>
          <input v-model="user.username" type="text" placeholder="用户名" >
          <input type="password" placeholder="密码" v-model="user.password">
          <button class="inupbutton" @click="login2">注册</button>
        </div>
      </div>
      <div :class="overlaytitle">
        <div class="overlaytitle-Signin" v-if="disfiex == 0">
          <h2 class="overlaytitleH2">你好，朋友！</h2>
          <p class="overlaytitleP">输入你的个人信息，开始与我们一起的旅程</p>
          <div class="buttongohs" @click="Signin">注册</div>
        </div>
        <div class="overlaytitle-Signup" v-if="disfiex == 1">
          <h2 class="overlaytitleH2">欢迎回来！</h2>
          <p class="overlaytitleP">为了保持与我们的联系，请使用个人信息登录</p>
          <div class="buttongohs" @click="Signup">去登录</div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import request from '@/utils/request';

export default {
  data() {
    return {
      input1: '',
      input: '',
      overlaylong: 'overlaylong',
      overlaytitle: 'overlaytitle',
      disfiex: 0,
      user:{
        username:'',
        password:''
        
      },
      result:{
      username:'',
      password:''
    }
    }
  },
  methods: {
    async login() {
      const result = await request.get("Login/Login1",{params:{
        username:this.user.username,
        password:this.user.password     

      }})
      this.result=result.data
      console.log(this.result);
      console.log(this.user.username);
      console.log(this.user.password);
      
      if (
  this.user.username === this.result.username &&
  parseInt(this.user.password, 10) === this.result.password
) {
  this.$router.push('/home');
} else {
  this.$message.error('请输入正确的用户名和密码');
}
      
    },
    login2() {
      // 判断输入是否为空
      if (this.input.trim() === '' || this.input1.trim() === '') {
        this.$message.error('请输入用户名和密码');
        return;
      }
      this.$message({
        message: '恭喜你，注册成功',
        type: 'success'
      });
    },
    Signin() {
      this.overlaylong = "overlaylongleft";
      this.overlaytitle = "overlaytitleright";
      setTimeout(() => {
        this.disfiex = 1;
      }, 200);
    },
    Signup() {
      this.overlaylong = "overlaylongright";
      this.overlaytitle = "overlaytitleleft";
      setTimeout(() => {
        this.disfiex = 0;
      }, 200);
    }
  }
}
</script>

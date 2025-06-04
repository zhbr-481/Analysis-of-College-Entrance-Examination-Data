import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from "../views/Home.vue"
import Mail from "../views/Mail.vue"
import Main from "../views/mainA.vue"
import Zhaosheng from "../views/zhaosheng.vue"
import Page1 from "../views/page1.vue"
import Page2 from "../views/page2.vue"
import Page3 from "../views/page3.vue"
import Page4 from "../views/page4.vue"
import Login from "../views/Login.vue"
import table2024 from '../views/table2024.vue'
import table2020 from '../views/table2020.vue'
import table2021 from '../views/table2020.vue'
import table2022 from '../views/table2020.vue'
import table2023 from '../views/table2023.vue'
import Page5 from '@/views/page5.vue'
import dataAnalysis from '@/views/dataAnalysis.vue'
import schoolPk from '@/views/schoolPk.vue'
import bkadvanced from '@/views/bkadvanced.vue'
import nongke from '@/views/nongke.vue'
import second from '@/views/second.vue'
import yixue from '@/views/yixue.vue'
import junshi from '@/views/junshi.vue'
import shifan from '@/views/shifan.vue'
import homeBA from '@/views/homeBA.vue'
import Trend from '../views/trend.vue'
import Trend2 from '../views/trend2.vue'
import tianbao from '../views/tianbao.vue'
import bkDataAnalysis from '@/views/bkDataAnalysis.vue'

// import L2020 from "../gaokao2020.vue"
//1. 创建路由组件
Vue.use(VueRouter)

//2. 将路由与组件映射
const routes = [
  {
    path: '/',
    component: Main,
    redirect: '/Login', // 重定向到 Login 解决点击首页不显示界面问题
    children: [
      { path: 'home', component: Home },
      { path: 'mail', component: Mail },
      { path: 'zhaosheng', component: Zhaosheng },
      { path: 'page1', component: Page1,},
      { path: 'gaokao2024', component: table2024 },
      { path: 'gaokao2020', component: table2020 },
      { path: 'gaokao2023', component: table2023 },
      { path: 'gaokao2021', component: table2021 },
      { path: 'gaokao2022', component: table2022 },
      { path: 'page2', component: Page2 },
      { path: 'page3', component: Page3 },
      { path: 'page4', component: Page4 },
      { path: 'page5', component: Page5 },
      { path: 'dataAnalysis', component: dataAnalysis },
      {path:'schoolPk',component:schoolPk},
      {path:'bkadvanced',component:bkadvanced},
      {path:'nongke',component:nongke},
      {path:'second',component:second},
      {path:'yixue',component:yixue},
      {path:'junshi',component:junshi},
      {path:'shifan',component:shifan},
      {path:'homeBA',component:homeBA},
      {path:'trend',component:Trend},
      {path:'trend2',component:Trend2},
      {path:'zhiyuan',component:tianbao},
      {path:'bkdataAnalysis',component:bkDataAnalysis}

    ]
  },
  {
    path: '/Login',
    name: 'Login',
    component: Login
  }
]

//3. 创建 router 实例
const router = new VueRouter({
  routes // (缩写) 相当于 routes: routes
})

// 公开 router 实例
export default router

//4. 把 router 挂载到根节点上
// 获取原型对象上的 push 函数
const originalPush = VueRouter.prototype.push
// 修改原型对象中的 push 方法
VueRouter.prototype.push = function push(location) {
  return originalPush.call(this, location).catch(err => err)
}
<!--左侧导航栏-->

<template>
  <el-menu
      default-active="1-4-1"
      class="el-menu-vertical-demo"
      @open="handleOpen"
      @close="handleClose"
      background-color="#4a8ff8"
      :collapse="isCollapse"
      text-color="white"
      active-text-color="orange">
  <h3><img class="img" src="../../public/b3ae9fe0ebd3247e4c5c633014272e3.png"><br>{{isCollapse?"高考":"高考数据分析系统"}}</h3>
    <el-menu-item @click="clickMenu(item)" v-for="item in noChildren" :key="item.name" :index="item.name">
      <i :class="`el-icon-${item.icon}`" ></i>
      <span slot="title">{{ item.label }}</span>
    </el-menu-item>
    <el-submenu v-for="item in hasChildren" :key="item.label" :index="item.label">
      <template slot="title">
        <i :class="`el-icon-${item.icon}`"></i>
        <span slot="title">{{ item.label }}</span>
      </template>
      <el-menu-item-group  v-for="subitem in item.children" :key="subitem.path" >
        <el-menu-item @click="clickMenu(subitem)" :index="subitem.path">{{subitem.label}}</el-menu-item>
      </el-menu-item-group>
    </el-submenu>
  </el-menu>

</template>

<style lang="less" scoped>
.img{
  border-radius:50% ;
  width: 70px;
  height: auto;
}
span{
  font-family: '宋体'
}
i{
  color: white;
}
.el-menu-vertical-demo:not(.el-menu--collapse) {
  width: 250px;
  min-height: 100%;
}
.el-menu{
  border-right:none;
  height: 100vh;

  h3{
    color: white;
    text-align: center;
    line-height:48px;
    font-size: 23px;
    font-weight:400;
    margin-bottom: 20px;

  }
}
</style>

<script>
export default {
  data() {
    return {
      menuData:[

        {
          path: '/home',
          name: 'home',
          label: '首页',
          icon: 's-home',
          url: 'Home/Home'
        },  
        {
          path: '/bkdataAnalysis',
          name: 'bkdataAnalysis',
          label: '本科录取大数据分析',
          icon: 'view',
          url: 'bkdataAnalysis/bkdataAnalysis'
        },
        {
          path: '/dataAnalysis',
          name: 'dataAnalysis',
          label: '信息前瞻',
          icon: 'star-on',
          url: 'dataAnalysis/dataAnalysis'
        },
        {
          path: '/trend',
          name: 'trend',
          label: '高考报名变化数据趋势',
          icon: 's-data',
          url: 'Trend/Trend'
        },
        {
          label: '近年一分一段正态分布图 ',
          icon: 'location',
          children: [//childrem 里面的内容是子菜单的内容
            {
              path: '/page1',
              name: 'page1',
              label: '2020',
              icon: 'setting',
              url: 'Other/PageOne'
            },
            {
              path: '/page2',
              name: 'page2',
              label: '2021',
              icon: 'setting',
              url: 'Other/PageTwo'
            },
            {
              path: '/page3',
              name: 'page3',
              label: '2022',
              icon: 'setting',
              url: 'Other/Pagesan'
            },{
              path: '/page4',
              name: 'page4',
              label: '2023',
              icon: 'setting',
              url: 'Other/Pagesi'
            },
            {
              path: '/page5',
              name: 'page5',
              label: '2024',
              icon: 'setting',
              url: 'Other/Pagewu'
            }
          ]
        },
        {
          path: '/zhaosheng',
          name: 'zhaosheng',
          label: '各校信息招生计划变化趋势图',
          icon: 'search',
          url: 'MallManage/MallManage'
        },
        {
          path: '/mail',
          name: 'mail',
          label: '各地学校分布数量图',
          icon: 'user',
          url: 'UserManage/UserManage'
        },
        {
          path: '/trend2',
          name: 'trend2',
          label: '高考难度分布图',
          icon: 'picture-outline-round',
          url: 'Trend2/Trend2'
        },
        
        
        {

          label: '院校专业Pk',
          icon: 'ship',
          url: 'schoolPk/schoolPk',
          children: [//childrem 里面的内容是子菜单的内容
            {
              path: '/nongke',
              name: 'page1',
              label: '农科提前批',
              icon: 'setting',
              url: 'Other/PageOne'
            },
            {
              path: '/second',
              name: 'page2',
              label: '普通二段',
              icon: 'setting',
              url: 'Other/PageTwo'
            },
            {
              path: '/yixue',
              name: 'page1',
              label: '医学提前批',
              icon: 'setting',
              url: 'Other/PageOne'
            },
            {
              path: '/bkadvanced',
              name: 'page1',
              label: '军士提前批',
              icon: 'setting',
              url: 'Other/PageOne'
            },
            {
              path: '/junshi',
              name: 'bk',
              label: '本科提前批',
              icon: 'setting',
              url: 'Other/PageOne'
            },
            {path: '/shifan',
              name: 'shifan',
              label: '师范提前批',
              icon: 'setting',
              url: 'Other/PageOne'
            }]

        },
        
        {
          path: '/zhiyuan',
          name: 'zhiyuan',
          label: '智能志愿填报',
          icon: 'full-screen',
          url: 'tianbao/tianbao'
        },
      

      ]

    };
  },
  methods: {
    handleOpen(key, keyPath) {
      console.log(key, keyPath);
    },
    handleClose(key, keyPath) {
      console.log(key, keyPath);
    },
    //点击跟换路由事件
    clickMenu(item){
      console.log(item)
      //通过给这个事件传递item就是把上面的数组内容传进去
      //只有当要要跳转的位置和当前不一样时跳转
      //  if(this.$routeute.path!==item.path){//this.$route当前页面路由    this.$route.path获取当前路由的path
          //只有满组当前的path和传入的要跳转的不同时才跳转
        //还有一种情况就是当我们传入/时会重定向为/home /！=/home所以还会错，所以有了&&后面的
          this.$router.push(item.path)//this.$router整个router实例
       // }
    },

  },
  computed:{
    //没有子菜单
    noChildren(){
      return this.menuData.filter(item => !item.children)
    },
    //有子菜单
    hasChildren(){
      return this.menuData.filter(item => item.children)
    },
    isCollapse(){
        return this.$store.state.tab.isCollapse
    }
  }
}
</script>

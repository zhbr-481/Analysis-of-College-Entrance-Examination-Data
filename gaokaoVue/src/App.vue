<template>
  <div id="app">
    <router-view></router-view>
  </div>

</template>

<script>


export default {
  name: 'App',
  mounted() {
    document.title = '高考数据分析';
  }

}
</script>

<style lang="less">
html,body,h3,p,h2{
  padding: 0;
  margin: 0;
}
html,body {
  background: rgb(241, 236, 236);
}
</style>

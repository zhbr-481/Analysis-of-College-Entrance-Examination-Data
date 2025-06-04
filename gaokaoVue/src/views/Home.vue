<template>
  <div>
        <homeA/>
        <homeB/>
        <homeC/>
        <homeD/>
        <homeE/>
  </div>
</template>


<script>
import homeA from "@/views/homeA.vue";
import homeB from "@/views/homeB.vue";
import homeC from "@/views/homeC.vue";
import homeD from "@/views/homeD.vue";
import homeE from "@/views/homeE.vue";

export default {
  name:"HomeVue",
  components:{
    homeA,
    homeB,
    homeC,
    homeD,
    homeE,
  }
}
'homeVue'
</script>
<style lang="less">
  .infinite-list{
    position: relative;
    //background-color: aqua;
    left: -40px;
    top: -40px;
    width:100%;
   
  }
</style>
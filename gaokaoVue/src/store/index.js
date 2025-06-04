import Vue from "vue";
import Vuex from 'vuex'
import tab from './tab'

//全局注入
Vue.use(Vuex)

//创建vuex实例
export default new Vuex.Store({
    modules:{//因为这里用的是一个一个的组件所以用这个modules模块化
        tab
    }
})
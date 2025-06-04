//控制菜单展开
export default {
    state:{
        isCollapse:false//定义控制菜单的展开还是收起
    },
    mutations:{
        //修改菜单展开收起的方法
        collapseMenu(state){
            state.isCollapse = !state.isCollapse
        }
    }
}
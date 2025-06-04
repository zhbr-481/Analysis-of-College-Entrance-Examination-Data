import http from "../utils/request";

//请求首页数据
export const getData = () =>{
    return http.get('/home/getData')//看官方文档知道有两个参数
}
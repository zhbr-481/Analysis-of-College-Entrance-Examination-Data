import axios from 'axios'

// 创建一个 axios 对象
const request = axios.create({
  baseURL: 'http://localhost:8080', // 请求头
  timeout: 5000// 设置 500延迟
})

// request 拦截器
// 可以在请求发送前对请求做一些处理
// 比如统一加 token，对请求参数统一加密
request.interceptors.request.use(config => {
  config.headers['Content-Type'] = 'application/json; charset=utf-8'
  // config.headers['token'] = user.token;
  return config
}, error => {
  return Promise.reject(error)
})

// response 拦截器
// 可以在接口响应后统一处理结果
request.interceptors.response.use(response => {
  // response.data 即为后端返回的 Result
  let res = response.data
  // 兼容服务端返回的字符串数据
  if (typeof res === 'string') {
    res = res ? JSON.parse(res) : res
  }
  return res
}, error => {
  console.log('err ' + error) // for debug
  return Promise.reject(error)
})

export default request

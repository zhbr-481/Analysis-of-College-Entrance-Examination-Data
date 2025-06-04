package com.example.gaokaosp.Common;

public class Result {
    private String code;//返回成功的状态码
    private String msg;

    private Object data;
    private static final String SUCCESS="1";
    private static final String ERROR="0";

    public Result() {

    }

    public static Result success(){
        Result result = new Result();
        result.setCode(SUCCESS);
        return result;

    }

    public static Result success(Object data){
        Result result = new Result();
        result.setCode(SUCCESS);
        result.setData(data);
        System.out.println(result);
        return result;

    }

    public static Result error(String msg){
        Result result = new Result();
        result.setCode(ERROR);
        result.setData(msg);
        return result;

    }
    public Result(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}


package com.minishop.common.utils;

import lombok.Data;

public class ResultData {
    private String code;   //返回code码
    private String msg;    //返回信息
    private Integer count;  //数据总条数
    private Integer startIndex; //每页开始的索引
    private Object data;

    public ResultData(int num,int page,int limit){
        this.count = num;
        this.startIndex = (page-1)*limit;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

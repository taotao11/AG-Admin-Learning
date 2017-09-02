package com.github.wxiaoqi.security.common.msg;

/**
 * Created by Ace on 2017/6/11.
 */
public class ObjectRestResponse<T> extends BaseResponse {
    T result;


    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public ObjectRestResponse rel(boolean rel) {
        return this;
    }

    public ObjectRestResponse result(T result) {
        this.setResult(result);
        return this;
    }
}

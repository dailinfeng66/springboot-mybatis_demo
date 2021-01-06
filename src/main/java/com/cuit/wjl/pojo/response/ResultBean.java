package com.cuit.wjl.pojo.response;
import lombok.Data;

@Data
public class ResultBean<T> {

    private static String SUCCESS_CODE = "200";
    private static String ERROR_CODE = "1";
    private static String REFUSED_CODE = "2";

    public ResultBean(T data) {
        this.data = data;
    }

    /**
     * 执行结果：0成功1失败
     */

    private String code;
    /**
     * 描述（错误原因）
     */

    private String message;
    /**
     * 返回对象
     */

    private T data;

    public ResultBean success() {
        this.code = SUCCESS_CODE;
        return this;
    }

    public ResultBean failed(String errorMessage) {
        this.data = null;
        this.code = ERROR_CODE;
        this.message = errorMessage;
        return this;
    }

    public ResultBean refused() {
        this.data = null;
        this.code = REFUSED_CODE;
        return this;
    }

}
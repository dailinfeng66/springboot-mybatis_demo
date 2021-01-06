package com.cuit.wjl.handler;

import com.cuit.wjl.pojo.response.NoneResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public NoneResult exceptionHandler(Exception e) {
        System.out.println("未知异常！原因是:" + e);

        return new NoneResult("操作失败");
    }
}
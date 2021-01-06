package com.cuit.wjl.pojo.response;

import lombok.Data;

@Data
public class NoneResult {
    String result;

    public NoneResult(String result) {
        this.result = result;
    }
}

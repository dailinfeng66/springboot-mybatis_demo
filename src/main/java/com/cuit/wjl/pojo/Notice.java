package com.cuit.wjl.pojo;

import lombok.Data;

@Data
public class Notice {
    String title;
    String time;

    public Notice(String title, String time) {
        this.title = title;
        this.time = time;
    }
}

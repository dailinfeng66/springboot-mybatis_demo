package com.cuit.wjl.service;

import com.cuit.wjl.pojo.Notice;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StaticDatasService {
    //返回新闻信息
    public List<Notice> getAllNotices() {
        List<Notice> list = new ArrayList<>();
        list.add(new Notice("2018届大学生校园招聘", "2018-01-03"));
        list.add(new Notice("万家乐社会招聘", "2018-01-03"));
        list.add(new Notice("关于公开选拔空气能事业部部长的启事", "2019-01-03"));
        return list;
    }
}

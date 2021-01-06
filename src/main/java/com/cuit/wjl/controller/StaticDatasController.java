package com.cuit.wjl.controller;

import com.cuit.wjl.pojo.Notice;
import com.cuit.wjl.pojo.response.ResultBean;
import com.cuit.wjl.service.StaticDatasService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "静态数据 -- 选择框中的数据")
@RequestMapping("/staticData")
@CrossOrigin
@RestController
public class StaticDatasController {
    @Autowired
    StaticDatasService staticDatasService;

    /**
     * 返回新闻信息
     *
     * @return
     */
    @GetMapping("/notice")
    @ApiOperation("查询新闻")
    public ResultBean<List<Notice>> getNotices() {
        return new ResultBean<>(staticDatasService.getAllNotices()).success();
    }


}

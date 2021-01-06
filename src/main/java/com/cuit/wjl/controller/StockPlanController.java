package com.cuit.wjl.controller;

import com.cuit.wjl.pojo.StockInfo;
import com.cuit.wjl.pojo.StockPlan;
import com.cuit.wjl.pojo.response.NoneResult;
import com.cuit.wjl.pojo.response.ResultBean;
import com.cuit.wjl.service.StockPlanService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "StockPlan表的增删查改")
@RequestMapping("/stockplanData")
@CrossOrigin
@RestController
public class StockPlanController {
    @Autowired
    StockPlanService stockPlanService;

    @ApiOperation("StockPlan全部查询")
    @GetMapping("/stockplan")
    public ResultBean<List<StockPlan>> findAll() {
        return new ResultBean<>(stockPlanService.getAll()).success();
    }

    @ApiOperation("StockPlan  -> 根据ID查询一条数据")
    @GetMapping("/stockplan/{stocknum}")
    public ResultBean<List<StockPlan>> findByStockNum(@PathVariable String stocknum) {
        return new ResultBean<>(stockPlanService.findByStocknum(stocknum)).success();
    }

    @ApiOperation("StockPlan  -> 根据stocknum删除StockPlan")
    @DeleteMapping("/stockplan/{string}")
    public ResultBean<NoneResult> deleteByStockNum(@PathVariable String string) {
        return new ResultBean<>(stockPlanService.deleteByStockNum(string)).success();
    }

    @ApiOperation("StockPlan  -> 增加")
    @PostMapping("/stockplan")
    public ResultBean<NoneResult> deleteByStockNum(@RequestBody StockPlan stockPlan) {
        return new ResultBean<>(stockPlanService.insertStockPlan(stockPlan)).success();
    }
    @ApiOperation("StockPlan  -> 修改")
    @PutMapping("/stockplan")
    public ResultBean<NoneResult> updateByStockNum(@RequestBody StockPlan stockPlan) {
        return new ResultBean<>(stockPlanService.updateStockPlan(stockPlan)).success();
    }
}

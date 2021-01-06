package com.cuit.wjl.controller;

import com.cuit.wjl.pojo.StockInfo;
import com.cuit.wjl.pojo.response.NoneResult;
import com.cuit.wjl.pojo.response.ResultBean;
import com.cuit.wjl.service.StockInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "StockInfo对象的CRUD")
@RequestMapping("/stockinfoData")
@CrossOrigin
@RestController
public class StockInfoController {
    @Autowired
    StockInfoService stockInfoService;

    /**
     * 通过get请求得到所有的StockInfo
     * 查
     *
     * @return
     */
    @GetMapping("/stockinfo")
    @ApiOperation("查询StockInfo")
    public ResultBean<List<StockInfo>> getAllStockInfo() {
        return new ResultBean<>(stockInfoService.findAllStockInfo()).success();
    }

    /**
     * 根据taitou(主键)查询StockInfo
     *
     * @param taitou
     * @return
     */
    @GetMapping("/stockinfo/{taitou}")
    @ApiOperation("根据taitou查询StockInfo")
    public ResultBean<StockInfo> findByTaiTou(@PathVariable String taitou) {
        return new ResultBean<>(stockInfoService.findByTaiTou(taitou)).success();
    }

    /**
     * 更新StockInfo
     * 改
     *
     * @param stockInfo
     * @return
     */
    @PutMapping("/stockinfo")
    @ApiOperation("更新StockInfo")
    public ResultBean<NoneResult> updateStockInfo(@RequestBody StockInfo stockInfo) {
        return new ResultBean<>(stockInfoService.updateStockInfo(stockInfo)).success();
    }

    /**
     * 增
     *
     * @param stockInfo
     * @return
     */
    @PostMapping("/stockinfo")
    @ApiOperation("添加StockInfo")
    public ResultBean<NoneResult> insertStockInfo(@RequestBody StockInfo stockInfo) {
        return new ResultBean<>(stockInfoService.insertStockInfo(stockInfo)).success();
    }

    /**
     * 根据主键 taitou删除StockInfo
     *
     * @param taitou
     * @return
     */
    @ApiOperation("删除StockInfo")
    @DeleteMapping("/stockinfo/{taitou}")
    public ResultBean<NoneResult> deleteStockInfo(@PathVariable String taitou) {
        return new ResultBean<>(stockInfoService.deleteStockInfo(taitou)).success();
    }
}

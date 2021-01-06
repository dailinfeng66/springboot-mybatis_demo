package com.cuit.wjl.service;

import com.cuit.wjl.mapping.StockPlanMapper;
import com.cuit.wjl.pojo.StockPlan;
import com.cuit.wjl.pojo.response.NoneResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StockPlanService {
    @Resource
    StockPlanMapper stockPlanMapper;

    public List<StockPlan> getAll() {
        return stockPlanMapper.findAll();
    }

    public StockPlan findByStocknum(String stockNum) {
        return stockPlanMapper.findBystockNum(stockNum);
    }

    public NoneResult deleteByStockNum(String stockNum) {
        stockPlanMapper.deleteBystockNum(stockNum);
        return new NoneResult("操作成功");

    }


    public NoneResult insertStockPlan(StockPlan stockPlan) {
        stockPlanMapper.insertStockPlan(stockPlan);
        return new NoneResult("操作成功");
    }

    public NoneResult updateStockPlan(StockPlan stockPlan) {
        stockPlanMapper.updateStockPlan(stockPlan);
        return new NoneResult("操作成功");
    }
}

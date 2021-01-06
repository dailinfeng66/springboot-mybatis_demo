package com.cuit.wjl.dao;

import com.cuit.wjl.mapping.StockInfoMapper;
import com.cuit.wjl.pojo.StockInfo;

import javax.annotation.Resource;
import java.util.List;

@Resource
public class StockInfoDao {
    @Resource
    StockInfoMapper stockInfoMapper;

    /**
     * 查询所有的StockInfo
     *
     * @return
     */
    public List<StockInfo> findAllStockInfo() {
        return stockInfoMapper.findAll();
    }
}

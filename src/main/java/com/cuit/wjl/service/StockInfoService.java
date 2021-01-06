package com.cuit.wjl.service;

import com.cuit.wjl.mapping.StockInfoMapper;
import com.cuit.wjl.pojo.StockInfo;
import com.cuit.wjl.pojo.response.NoneResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StockInfoService {
    @Resource
    StockInfoMapper stockInfoMapper;

    /**
     * 查询 StockInfo
     *
     * @return
     */
    public List<StockInfo> findAllStockInfo() {
        return stockInfoMapper.findAll();
    }

    /**
     * 更新 stockInfo
     *
     * @param stockInfo
     * @return
     */
    public NoneResult updateStockInfo(StockInfo stockInfo) {
        stockInfoMapper.updateStockInfo(stockInfo);
        return new NoneResult("操作成功");
    }

    /**
     * 增加StockInfo
     *
     * @param stockInfo
     * @return
     */
    public NoneResult insertStockInfo(StockInfo stockInfo) {
        stockInfoMapper.insertStockInfo(stockInfo);
        return new NoneResult("操作成功");
    }

    /**
     * 根据主键 taitou删除StockInfo
     *
     * @param taitou
     * @return
     */
    public NoneResult deleteStockInfo(String taitou) {
        stockInfoMapper.deleteStockInfo(taitou);
        return new NoneResult("操作成功");
    }

    /**
     * 根据taitou(主键)查询StockInfo
     *
     * @param taitou
     * @return
     */
    public StockInfo findByTaiTou(String taitou) {
        return stockInfoMapper.findByTaiTou(taitou);
    }
}

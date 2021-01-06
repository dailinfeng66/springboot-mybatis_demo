package com.cuit.wjl.mapping;

import com.cuit.wjl.pojo.StockPlan;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StockPlanMapper {
    @Select("select * from StockPlan")
    List<StockPlan> findAll();

    @Select("select * from StockPlan where StockNum = #{stockNum}")
    StockPlan findBystockNum(String stockNum);

    @Delete("delete from StockPlan where StockNum = #{stockNum}")
    void deleteBystockNum(String stockNum);

    @Update("update StockPlan set OrderNum = #{orderNum},State = #{state},Auditor=#{auditor},ShopName=#{shopName},ShopCode=#{shopCode},Uploadtime=#{uploadtime},area=#{area},TotalAmount=#{totalAmount},TotalVolume=#{totalVolume},GuaTrue=#{guaTrue},GuaNeed=#{guaNeed},GuaAlready=#{guaAlready},Reason=#{reason},maker=#{maker},Htime=#{htime},Hcode=#{hcode} where StockNum = #{stockNum}")
    void updateStockPlan(StockPlan stockPlan);

    @Insert({"insert into StockPlan (OrderNum,State,StockNum,Auditor,ShopName,ShopCode,Uploadtime,area,TotalAmount,TotalVolume,GuaTrue,GuaNeed,GuaAlready,Reason,maker,Htime,Hcode) values(#{orderNum},#{state},#{stockNum},#{auditor},#{shopName},#{shopCode},#{uploadtime},#{area},#{totalAmount},#{totalVolume},#{guaTrue},#{guaNeed},#{guaAlready},#{reason},#{maker},#{htime},#{hcode})"})
    void insertStockPlan(StockPlan stockPlan);
}

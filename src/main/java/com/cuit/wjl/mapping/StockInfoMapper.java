package com.cuit.wjl.mapping;

import com.cuit.wjl.pojo.Notice;
import com.cuit.wjl.pojo.StockInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import javax.annotation.Resource;
import java.util.List;


public interface StockInfoMapper {
    @Select("select * from StockInfo")
    List<StockInfo> findAll();

    @Update("update StockInfo set output = #{output},input = #{input},way=#{way},Xtime=#{xtime},remarks=#{remarks},NameCus=#{nameCus}," +
            "CodeCus=#{codeCus},area=#{area},ShopName=#{shopName} ,TotalAmount=#{totalAmount},TotalVolume=#{totalVolume},TotalQuantity=#{totalQuantity}," +
            "OrderNum=#{orderNum},State=#{state},contact=#{contact},TellContact=#{tellContact},InCharge=#{InCharge},Reason=#{reason}," +
            "Uploadtime=#{uploadtime},GuaTrue=#{guaTrue},GuaNeed=#{guaNeed},GuaAlready=#{guaAlready} where Taitou = #{taitou}")
    void updateStockInfo(StockInfo stockInfo);

    @Insert({"insert into StockInfo(Taitou,output,input,way,Xtime,remarks,NameCus,CodeCus,area,ShopName,TotalAmount,TotalVolume,TotalQuantity,OrderNum,State,contact,TellContact,InCharge,Reason,Uploadtime,GuaTrue,GuaNeed,GuaAlready)" +
            " values(#{taitou},#{output},#{input},#{way},#{xtime},#{remarks},#{nameCus},#{codeCus},#{area},#{shopName},#{totalAmount},#{totalVolume},#{totalQuantity},#{orderNum},#{state},#{contact},#{tellContact},#{InCharge},#{reason},#{uploadtime},#{guaTrue},#{guaNeed},#{guaAlready})"})
    void insertStockInfo(StockInfo stockInfo);

    /**
     * 本表是以taitou 为主键的  所以根据taitou删除
     *
     * @param taitou
     */
    @Delete("delete from  StockInfo where Taitou = #{taitou}")
    void deleteStockInfo(String taitou);

    @Select("select * from StockInfo where Taitou = #{taitou}")
    public StockInfo findByTaiTou(String taitou);
}

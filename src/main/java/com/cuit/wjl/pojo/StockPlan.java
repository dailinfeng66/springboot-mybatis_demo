package com.cuit.wjl.pojo;

import lombok.Data;

@Data
public class StockPlan {

  private String orderNum;
  private String state;
  private String stockNum;
  private String auditor;
  private String shopName;
  private String shopCode;
  private String uploadtime;
  private String area;
  private double totalAmount;
  private double totalVolume;
  private double guaTrue;
  private double guaNeed;
  private double guaAlready;
  private String reason;
  private String maker;
  private String htime;
  private String hcode;



}

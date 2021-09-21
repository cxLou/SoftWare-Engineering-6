package com.se.vo;

public class Good {
	String GoodName;//商品名称
	float GoodPrice;//商品价格
	String GoodDescribe;//商品描述
	public Good() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Good(String goodName, float goodPrice, String goodDescribe) {
		super();
		GoodName = goodName;
		GoodPrice = goodPrice;
		GoodDescribe = goodDescribe;
	}
	public String getGoodName() {
		return GoodName;
	}
	public void setGoodName(String goodName) {
		GoodName = goodName;
	}
	public float getGoodPrice() {
		return GoodPrice;
	}
	public void setGoodPrice(float goodPrice) {
		GoodPrice = goodPrice;
	}
	public String getGoodDescribe() {
		return GoodDescribe;
	}
	public void setGoodDescribe(String goodDescribe) {
		GoodDescribe = goodDescribe;
	}
	
	
}

package com.test.vo;

public class Goods {

	String GoodName;//商品名称
	Float GoodPrice;//商品价格
	String GoodDescribe;//商品的描述
	/*用二进制来将图片存储进入数据库，因为不知道图片的大小，所以定义一个length来
	 * 定义长度。在读取文件时，将图片转换成二进制后的长度赋值给length*/
	int Length;
	byte[] GoodImage = new byte[Length];//商品的图片
	
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Goods(int length, String goodName, Float goodPrice, String goodDescribe, byte[] goodImage) {
		super();
		Length = length;
		GoodName = goodName;
		GoodPrice = goodPrice;
		GoodDescribe = goodDescribe;
		GoodImage = goodImage;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	public String getGoodName() {
		return GoodName;
	}

	public void setGoodName(String goodName) {
		GoodName = goodName;
	}

	public Float getGoodPrice() {
		return GoodPrice;
	}

	public void setGoodPrice(Float goodPrice) {
		GoodPrice = goodPrice;
	}

	public String getGoodDescribe() {
		return GoodDescribe;
	}

	public void setGoodDescribe(String goodDescribe) {
		GoodDescribe = goodDescribe;
	}

	public byte[] getGoodImage() {
		return GoodImage;
	}

	public void setGoodImage(byte[] goodImage) {
		GoodImage = goodImage;
	}
	
	
	
}

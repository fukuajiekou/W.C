package com.ruicai.javaDemo.entity;

/**
 * @author Administrator
 * 汽油车
 */
public class QiyouCar implements Car{
	String type = "汽油车";

	@Override
	public void productCar() {
		// TODO Auto-generated method stub
		System.out.println("产品是汽油车");
		
	}
	

}

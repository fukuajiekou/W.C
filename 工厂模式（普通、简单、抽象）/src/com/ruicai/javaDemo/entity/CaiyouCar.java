package com.ruicai.javaDemo.entity;

/**
 * @author Administrator
 * 柴油车
 */
public class CaiyouCar implements Car{
	String type = "柴油车";

	@Override
	public void productCar() {
		// TODO Auto-generated method stub
		System.out.println("产品是柴油车");
		
	}
	

}

package com.ruicai.javaDemo.entity;

public class ChangCheng implements InterfaceFactory{

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new CaiyouCar();
	}
	

}

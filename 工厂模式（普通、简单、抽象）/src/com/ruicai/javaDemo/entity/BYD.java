package com.ruicai.javaDemo.entity;

public class BYD implements InterfaceFactory{

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new QiyouCar();
	}
	

}

package com.ruicai.javaDemo.test;

import com.ruicai.javaDemo.entity.CaiyouCar;
import com.ruicai.javaDemo.entity.Car;
import com.ruicai.javaDemo.entity.QiyouCar;

public class Factory1 {
	public static Car createQiyouCar(){
		return new QiyouCar();
	}
	public static Car createCaiyouCar(){
		return new CaiyouCar();
	}
	

}

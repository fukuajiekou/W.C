package com.ruicai.javaDemo.test;

import com.ruicai.javaDemo.entity.CaiyouCar;
import com.ruicai.javaDemo.entity.Car;
import com.ruicai.javaDemo.entity.QiyouCar;

/**
 * @author Administrator
 * 
 * 工厂类
 */
public class Factory {
	
	public Car createCar(String type){
		switch (type) {
		case "汽油车":
			return new QiyouCar();
		case "柴油车":
			return new CaiyouCar();
		default:
			return null;
		}
		 
	}

}

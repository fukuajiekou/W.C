package com.ruicai.javaDemo.test;

import com.ruicai.javaDemo.entity.BYD;
import com.ruicai.javaDemo.entity.Car;
import com.ruicai.javaDemo.entity.InterfaceFactory;

/**
 * @author Administrator
 * 工厂模式---简单工厂模式 普通工厂模式  抽象工厂模式
 * 
 * 接口：产品(product)  producer   生产工厂的工厂
 * 实体类  implement 接口
 * 产品  car(汽油车  电动车 )
 * 工厂  factory (BYD 长城  吉利) 
 * 
 */
public class FactoryTest {
//简单工厂模式
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = new Factory();
		Car car = factory.createCar("汽油车");
		car.productCar();
	}*/
	//多方法工厂模式
	/*public static void main(String[] args) {
		Car car1 = Factory1.createQiyouCar();
		car1.productCar();
		Car car2 = Factory1.createCaiyouCar();
		car2.productCar();
		
	}*/
	//普通工厂模式
	/*public static void main(String[] args) {
		InterfaceFactory byd = new BYD();
		Car car2 = byd.createCar();
		car2.productCar();
	}*/
	//抽象工厂模式
	public static void main(String[] args) {
		Car car3 = new FactoryProducer().producer("BYD").createCar();
		car3.productCar();
	}

}

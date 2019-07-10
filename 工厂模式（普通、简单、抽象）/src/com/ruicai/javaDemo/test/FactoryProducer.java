package com.ruicai.javaDemo.test;

import com.ruicai.javaDemo.entity.BYD;
import com.ruicai.javaDemo.entity.ChangCheng;
import com.ruicai.javaDemo.entity.InterfaceFactory;

public class FactoryProducer {
/*	public String fctorytType;
	
	public FactoryProducer(String fctorytType) {
		super();
		this.fctorytType = fctorytType;
	}
*/
	public InterfaceFactory producer(String fctorytType){
		switch (fctorytType) {
		case "BYD":
			return new BYD(); 
		default:
			return new ChangCheng();
		}
	}

}

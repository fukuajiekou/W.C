package com.ruicai.javaDemo;

public class Danli {
	//单例模式确保类在内存中只有一个对象，自动创建对象，并对外提供使用
	//饿汉模式
	//1.先提供私有的构造方法 2.再提供创建一个私有的静态的对象 3.最后提供一个静态的方法并返回一个对象
	private  Danli() {
		// TODO Auto-generated constructor stub
	};
	
	private static Danli danli = new Danli();
	
	public static Danli getDanli(){
		return danli;
	}
	
	
	
	/*private static Danli d1 = null;
	public static Danli getDanli(){
		if(d1 == null){
			d1 = new Danli();
		}
		return d1;
	}*/
	
}

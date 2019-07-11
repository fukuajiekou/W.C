package com.ruicai.javaDemo;

public class Danli1 {
	//懒汉模式
	//懒汉模式与饿汉模式的区别 ----> 第二步不创建对象 赋予一个空值  第三步判断对象是否为空  再创建对象
	
//	private Danli1(){
//		
//	}
//	
//	private static Danli1 danli1 = null;  //----->这里不能创建对象
//	
//	public static Danli1 getDanli(){
//		
//		if(danli1==null){
//			danli1 = new Danli1();
//		}
//		return danli1;
//	}
/*	//恶寒模式
	private Danli1(){}
	private static Danli1 d1 = null;
	public static Danli1 getDanli1(){
		if(d1 == null){
			d1 = new Danli1();
		}
		return d1;
	}*/
	
	//懒汉模式
	private Danli1(){}
	private static Danli1 d2 = new Danli1();
	public static Danli1 getDanli1(){
		return d2;
	}

}

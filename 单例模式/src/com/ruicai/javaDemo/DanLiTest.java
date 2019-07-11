package com.ruicai.javaDemo;

public class DanLiTest {
	
	public static void main(String[] args) {
		 Danli1 danli1 = Danli1.getDanli1();
		 Danli1 danli2 = Danli1.getDanli1();
		 System.out.println(danli1 == danli2);
		 System.out.println("danli1的hashcode值"+"\n"+danli1);
		 System.out.println("danli2的hashcode值"+"\n"+danli2);
		 
	}

}

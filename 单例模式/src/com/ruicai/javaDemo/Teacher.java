package com.ruicai.javaDemo;

public class Teacher {
	
	private Teacher(){};
	private static Teacher tea = new Teacher();
	public static Teacher gettea(){
		
		return tea;
	}

}

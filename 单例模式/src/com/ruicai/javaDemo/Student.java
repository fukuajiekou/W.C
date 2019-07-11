package com.ruicai.javaDemo;

public class Student {
	
	private Student(){};
	private static Student stu = null;
	public static Student getStudent(){
		if(stu !=null){
		stu = new Student();	
		}
		return stu;
		
	}

}

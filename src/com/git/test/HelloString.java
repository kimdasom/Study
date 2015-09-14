package com.git.test;

class Hello{
	String mor = "Good Morning";
	
	public Hello(){
		this.mor=mor;
	}
}

public class HelloString {
	

	public static void main(String[] args) {
		String str = "안녕하세요";
		System.out.println(str);
		String space = "공간입니다.";
		System.out.println(space);
		String job ="programer";
		System.out.println(job);
		String door = "열자입니다.";
		System.out.println(door);
		
		Hello hello = new Hello();
		hello.mor="bonjure";
		System.out.println(hello.mor);
	}

}

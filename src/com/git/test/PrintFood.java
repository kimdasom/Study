package com.git.test;

public class PrintFood extends varientFood {

	public static void main(String[] args) {
		Food  food = new Food();
		varientFood  vf = new varientFood();
		
		System.out.println(food.toString());//  food클래스 toStrion()재선언출력함
		System.out.println(vf.chnfood); // 상속받은 food 중식이 출력
		
		

	}

}

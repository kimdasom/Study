package com.git.test;

public class PrintFood extends VarientFood {

	public static void main(String[] args) {
		Food  food = new Food();
		VarientFood  vf = new VarientFood();
		
		System.out.println(food.toString());//  food클래스 toStrion()재선언출력함
		System.out.println(vf.chnfood); // 상속받은 food 중식이 출력
		System.out.println(vf.itafood);// 상속받은 food 양식이 출력
		System.out.println(vf.toString()); 
		
		

	}

}

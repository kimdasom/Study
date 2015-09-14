package com.git.test;

public class VarientFood extends Food {

	String krfood = "비빔밥";
	String chfood ="짜장면";
	String itfood = "스파게티";
	
	public VarientFood(){ // 생성자
		this.krfood=krfood;
		this.chfood=chfood;
		this.itafood=itafood;
	}
	
	public VarientFood(String krff, String chff, String itff){ // 메소드 오버로딩
		super(); // 수퍼메소드 호출
		this.krfood=krff;
		this.chfood=chff;
		this.itafood=itff;
	}
	
	public String toString(){
		return  krfood + chfood + itafood;
	}
	

}

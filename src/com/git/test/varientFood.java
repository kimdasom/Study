package com.git.test;

public class varientFood extends Food {

	String krfood = "비빔밥";
	String chfood ="짜장면";
	String itfood = "스파게티";
	
	public varientFood(){
		this.krfood=krfood;
		this.chfood=chfood;
		this.itafood=itafood;
	}
	
	public varientFood(String krff, String chff, String itff){
		this.krfood=krff;
		this.chfood=chff;
		this.itafood=itff;
	}
	
	public String toString(){
		return  krfood + chfood + itafood;
	}
	

}

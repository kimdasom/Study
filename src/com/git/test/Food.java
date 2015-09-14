package com.git.test;

public class Food {
	String korfood= "한식";
	String chnfood ="중식";
	String itafood ="양식";
	
	public Food(){
		this.korfood=korfood;
		this.chnfood=chnfood;
		this.itafood=itafood;
	}
	
	public Food(String korf, String chf, String itf){
		this();
		this.korfood=korf;
		this.chnfood=chf;
		this.itafood=itf;
	}
	
	public String toString(){
		return korfood + chnfood+itafood;
	}
}

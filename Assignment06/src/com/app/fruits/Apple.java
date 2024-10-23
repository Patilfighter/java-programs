package com.app.fruits;
import java.util.*;



public class Apple extends Fruit {
	
	public Apple() {}
	
	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		
	}
	@Override
	public void display() {
		System.out.println(this.toString());
	}
	@Override
	public String taste() {
		return "Sweet and Sour";
	}
	

}

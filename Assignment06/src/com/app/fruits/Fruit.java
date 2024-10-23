package com.app.fruits;
import java.util.*;

public abstract class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	public Fruit() {
		
	}

	public Fruit(String color, double weight, String name, boolean isFresh) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
	
	public abstract void display();
	
	public String taste() {
		return "No Specific Taste";
	}
	
	public void freshOrNot(Scanner input) {
		
		System.out.println("Enter whether the fruit is fresh or not");
		boolean s= input.nextBoolean();
		if(s) {
		this.setFresh(true);}
		else{
			this.setFresh(false);
		}
	}

}

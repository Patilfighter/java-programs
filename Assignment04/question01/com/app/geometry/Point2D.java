package com.app.geometry;
import java.util.Scanner;
public class Point2D {
	
	Scanner input = new Scanner(System.in);
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	
	public Point2D(){
		this.x = 0;
		this.y = 0;
		
	}
	
	public Point2D(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
	public String getDetails() {
		return this.toString();
	}
    
	public boolean isEqualTo(int x, int y) {
		if(this.x == x && this.y == y) {
			return true;
		}
		else {
			return false;
		}
	}
	   
	
	public void accept() {
		System.out.println("Enter the x coordinate");
		this.setX(input.nextInt());
		System.out.println("Enter the y coordinate");
		this.setY(input.nextInt());
	}
	

	
	public double CalculateDistance(int x, int y) {
		double distance;
		distance = Math.sqrt(((this.x - x) * (this.x - x)) + ((this.y - y)*(this.y - y)));
		return distance;
		
	}

	
	
}

package question2;
import question2.exception.*;
import app.geometry.Point2D;
public class Circle  {
	
	private Point2D point = new Point2D();
	private double diameter;
	
	public Circle() {
		this.point.setX(0);
		this.point.setY(0);
		
		this.diameter =0;
	}
	
	public Circle(Point2D point, double diamater) {
		this.point= point;
		this.diameter = diamater;
		
	}
	
	public Point2D getPoint() {
		return point;
	}


	public void setPoint(Point2D point) {
		this.point = point;
	}


	public double getDiameter() {
		return diameter;
	}


	public void setDiameter(double diameter) throws NegativeDiamaterException  {
		   
		if(diameter < 0) {
			throw new NegativeDiamaterException();
			
		}
		this.diameter = diameter;
	}
	
	 public void getCenter() {
		 
		 System.out.println("X: " + this.point.getX() + "  Y: " + this.point.getY());
	 }
	
	public void displayDiamater() {
			
	   System.out.println("Diamater is: " + this.getDiameter());
	
	}
	
}

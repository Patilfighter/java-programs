package driving;
import java.util.Scanner;
public class DrivingCost {
  double totalMilesPerDay;
  double costPerGallon;
  double avgMilesPerGallon;
  double parkingFeePerDay;
  double tollsPerDay;
  double id;
  static Scanner input = new Scanner(System.in);
  
  public DrivingCost() {
  }
  
  
public DrivingCost(double totalMilesPerDay, double parkingFeePerDay, double costPerGallon, double avgMilesPerGallon,
		double tollsPerDay, double id) {
	this.totalMilesPerDay = totalMilesPerDay;
    this.parkingFeePerDay = parkingFeePerDay;
	this.costPerGallon = costPerGallon;
	this.avgMilesPerGallon = avgMilesPerGallon;
	this.tollsPerDay = tollsPerDay;
	this.id = id;
}


public double getId() {
	return id;
}


public void setId(double id) {
	this.id = id;
}


public double getTotalMilesPerDay() {
	return totalMilesPerDay;
}


public void setTotalMilesPerDay(double totalMilesPerDay) {
	this.totalMilesPerDay = totalMilesPerDay;
}


public double getParkingFeePerDay() {
	return parkingFeePerDay;
}


public void setParkingFeePerDay(double parkingFeePerDay) {
	this.parkingFeePerDay = parkingFeePerDay;
}


public double getCostPerGallon() {
	return costPerGallon;
}


public void setCostPerGallon(double costPerGallon) {
	this.costPerGallon = costPerGallon;
}


public double getAvgMilesPerGallon() {
	return avgMilesPerGallon;
}


public void setAvgMilesPerGallon(double avgMilesPerGallon) {
	this.avgMilesPerGallon = avgMilesPerGallon;
}


public double getTollsPerDay() {
	return tollsPerDay;
}


public void setTollsPerDay(double tollsPerDay) {
	this.tollsPerDay = tollsPerDay;
}
  
  public void accept() {
	  System.out.println("Enter the driver's Id");
	    this.setId(input.nextDouble());
	    
	  System.out.println("Enter Total miles driven per day.");
	    this.setTotalMilesPerDay(input.nextDouble());
	    
	  System.out.println("Enter Cost per gallon of gasoline.");
	  this.setCostPerGallon(input.nextDouble());
	  
	  System.out.println("Enter  Average miles per gallon.");
	   this.setAvgMilesPerGallon(input.nextDouble());
	   
	  System.out.println("Enter Parking fees per day");
	  this.setParkingFeePerDay(input.nextDouble());
	  
	  System.out.println("Enter Tolls per day.");
	  this.setTollsPerDay(input.nextDouble());
	  
  }
  
  public void display() {
	  System.out.println("The driver's id is: "+ this.getId());
	  System.out.println("Total miles driven per day: " + this.getTotalMilesPerDay());
	  System.out.println("Cost per gallon: " + this.getCostPerGallon());
	  System.out.println("Average miles per gallon: " + this.getAvgMilesPerGallon());
	  System.out.println("Parking fees per day: " + this.getParkingFeePerDay());
	  System.out.println("Tolls per day: " + this.getTollsPerDay());
	  
  }
  
  public double calculateDrivingCost() {
	  double cost;
	  cost = ((this.totalMilesPerDay * this.costPerGallon * this.avgMilesPerGallon) + this.parkingFeePerDay + this.tollsPerDay);
	  return cost;
	  
  }
   
  
}




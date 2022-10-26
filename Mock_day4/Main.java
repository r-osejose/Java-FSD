package Mock_day4;

abstract interface Loan{
	abstract double issueLoan();
}
	
abstract interface Insurance{
	abstract double takeInsurance();
}

class Vehicle implements Loan, Insurance {
	
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	private double price;
	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Vehicle(String vehicleNumber, String modelName, String vehicleType, double price) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType = vehicleType;
		this.price = price;
	}


public double issueLoan(){
	if(vehicleType == "4 wheeler") {
		return(0.8*price);
	}
	else if(vehicleType == "3 wheeler") {
		return(0.75*price);
	}
	else {
		return(0.5*price);
	}
}

public double takeInsurance() {
	if(price <= 150000) {
		return(3500);
	}
	else if(price>150000 && price<=300000) {
		return(4000);
	}
	else {
		return(5000);
	}
}

public class Main{
	public static void main(String[] args) {
Vehicle v = new Vehicle("KL-07-BR-004" , "Royal Enfield Classic 350", "Bike", 150000);
        
        System.out.println("Vehicle Details ");
        System.out.println("Vehicle Number : " + v.getVehicleNumber());
        System.out.println("Vehicle Type : " + v.getVehicleType());
        System.out.println("Vehicle Price : " + v.getPrice());
        System.out.println("\nLoan Amount : " + v.issueLoan());
        System.out.println("\nInsurance Amount : " + v.takeInsurance());
	}
}
}
	



package ws3.java2.entity;

public class Car extends Vehicle {
	
	private int mileage;
	
	
	public Car(String modelName, int maxSpeed, int numberLimit, int mileage) {
		
		super(modelName, maxSpeed, numberLimit);
		this.mileage = mileage;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}


	public void displayInfo() {
		System.out.println(" ��տ��� : " + this.mileage + "km/l");
	}
}

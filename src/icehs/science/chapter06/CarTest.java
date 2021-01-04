package icehs.science.chapter06;

public class CarTest {

	public static void main(String[] args) {
		Car IceCar = new Car();
		IceCar.distance = 140;
		IceCar.oilAmount = 5;
		
		IceCar.printCarInfo();
		IceCar.addoil(10);
		
		IceCar.printCarInfo();
		
		IceCar.driveCar("IT센터", "인천공항", 10.17);
		IceCar.printCarInfo();
		
		IceCar.driveCar("인천공항", "곤지암리조트", 60.21);
		IceCar.printCarInfo();
		
		IceCar.calcEnableDistance();

	}

}

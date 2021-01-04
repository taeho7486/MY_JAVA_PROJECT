package icehs.science.chapter06;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee ame = new Coffee();
		Coffee latte = new Coffee();
		Coffee maki = new Coffee();
		ame.name = "아메리카노";
		ame.price = 3500;
		ame.printCoffeeInfo();
		
		latte.name = "카페라때";
		latte.price = 4500;
		latte.printCoffeeInfo();
		
		maki.name = "카라멜 마키야또";
		maki.price = 4500;
		maki.printCoffeeInfo();
		
		int priceSum = ame.getprice() + latte.getprice() + maki.getprice();
		System.out.println("합계 : " + priceSum);
		

	}

}

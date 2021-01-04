package icehs.science.chapter06;

public class ChocolateTest {

	public static void main(String[] args) {
		Chocolate choco = new Chocolate();
		choco.name = "아마도리";
		choco.type = "다크";
		choco.price = 2200;
		choco.printChocolateInfo();
		
		String chocolate = choco.getName();
		int totalPrice = choco.calculateTotalPrice(20);
		
		System.out.println(chocolate + "초콜렛 20개" + totalPrice);
		choco.changeChocolateInfo("카페 키리쉬",  2500);

	}

}

package icehs.science.chapter09;

public class ProductTest {

	public static void main(String[] args) {
		Product tong = new Product("통돌이", 450000, 8);
		tong.printProductInfo();
		System.out.println("============================================");

		
		Television Tv = new Television("시네마TV", 3500000, 10, "화면크기 151cm");
		Tv.printProductInfo();
		System.out.println("비고 : " + Tv.getDescription());
		
		System.out.println("[공지] 할인율을 모두 15%로 변경합니다. ");
		tong.setDiscountRate(15);
		Tv.setDiscountRate(15);
		
		System.out.println("콩돌이 판매가 : " + tong.calculateDiscountPrice());
		System.out.println("시네마TV 판매가 : " + Tv.calculateDiscountPrice());
	}

}

package icehs.science.chapter09;

public class ProductTest {

	public static void main(String[] args) {
		Product tong = new Product("�뵹��", 450000, 8);
		tong.printProductInfo();
		System.out.println("============================================");

		
		Television Tv = new Television("�ó׸�TV", 3500000, 10, "ȭ��ũ�� 151cm");
		Tv.printProductInfo();
		System.out.println("��� : " + Tv.getDescription());
		
		System.out.println("[����] �������� ��� 15%�� �����մϴ�. ");
		tong.setDiscountRate(15);
		Tv.setDiscountRate(15);
		
		System.out.println("�ᵹ�� �ǸŰ� : " + tong.calculateDiscountPrice());
		System.out.println("�ó׸�TV �ǸŰ� : " + Tv.calculateDiscountPrice());
	}

}

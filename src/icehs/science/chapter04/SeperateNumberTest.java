package icehs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int number = 456;
		int number100 = number / 100;
		int number10 = number % 100 / 10;
		int number1 = number % 10;
		
		System.out.println("���� : " + number);
		System.out.println("���� �ڸ� �� : " + number100);
		System.out.println("���� �ڸ� �� : " + number10);
		System.out.println("���� �ڸ� �� : "+ number1);

	}

}

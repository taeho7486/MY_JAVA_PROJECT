package icehs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int monthlySal = 1000000;
		int yearlySal = monthlySal * 12;
		int bonus = monthlySal * 2 / 10;
		int yearbonus = bonus * 4;
		int yearSalAfterTax = yearlySal - yearlySal / 10;
		int yearbonusaftertax = yearbonus - yearbonus * 55 / 1000;
		int yearIncome = yearSalAfterTax + yearbonusaftertax;
		
		System.out.println("���� : " + yearlySal + ", ���� ���� : " + yearSalAfterTax);
		System.out.println("���ʽ� : " + yearbonus + ", ���� ���ʽ� : " + yearbonusaftertax);
		System.out.println("���޾� : " + yearIncome);
				
	
		
		

	}

}

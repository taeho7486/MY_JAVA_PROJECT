package icehs.science.chapter02;

public class StringTest {

	public static void main(String[] args) {
		String king = "�������";
		String money = "10000";
		String year = "2017";
		int intyear = Integer.parseInt(year);
		
		
		System.out.println(king + " : " + money);
		System.out.println(year + "��");
		System.out.println(money + year);
		System.out.println(intyear + Integer.parseInt(money));

	}

}

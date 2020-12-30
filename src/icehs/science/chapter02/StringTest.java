package icehs.science.chapter02;

public class StringTest {

	public static void main(String[] args) {
		String king = "¼¼Á¾´ë¿Õ";
		String money = "10000";
		String year = "2017";
		int intyear = Integer.parseInt(year);
		
		
		System.out.println(king + " : " + money);
		System.out.println(year + "³â");
		System.out.println(money + year);
		System.out.println(intyear + Integer.parseInt(money));

	}

}

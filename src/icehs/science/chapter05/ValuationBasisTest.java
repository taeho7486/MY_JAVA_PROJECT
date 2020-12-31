package icehs.science.chapter05;

public class ValuationBasisTest {

	public static void main(String[] args) {
		int firstnum = 10;
		int secondnum = 20;
		int thirdnum = 40;
		int forthnum = 50;
		int fifthnum = 80;
		
		double result = 0;
		result = firstnum * secondnum / 2 * 0.6;
		result = result + (thirdnum + forthnum) / 2 * 0.13;
		result = result + fifthnum * 0.27;
			
		
		System.out.println("평가점수 : " + result);
		
		if (result >=95 && result <= 100) {
			System.out.println("Special Class입니다.");
		}else if (result >= 90 && result < 95) {
			System.out.println("Gold Class입니다.");
		}else if(result >= 85 && result < 90) {
			System.out.println("Silver Class입니다.");
		}else if(result >= 80 && result < 85) {
			System.out.println("Bronze Class입니다.");
		}else if(result < 80) {
			System.out.println("Member입니다.");
		}
		
	}

}

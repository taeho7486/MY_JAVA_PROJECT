package icehs.science.chapter05;

public class WhilePrintTest {

	public static void main(String[] args) {
		int number = 1;
		while(number <= 10) {
			System.out.println(number++ + ". while�ǽ��Դϴ�.");
			//number++;
		}
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + ". while�ǽ��Դϴ�.");
		}
	}

}

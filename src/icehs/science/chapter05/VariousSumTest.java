package icehs.science.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		int sum = 0;
		int evensum = 0;
		int oddsum = 0;
		for( int i = 1;  i <= 1000; i++ ) {
			sum += 1; //sum = sum + 1;
			if( i % 2 ==0) {
				evensum += 1;
			}else {
				oddsum += i;
			}
		}
System.out.println("1���� 100������ �� : " + sum);
System.out.println("1���� 100���� ¦���� �� : " + evensum);
System.out.println("1���� 100������ Ȧ���� �� : " + oddsum );
	}

}

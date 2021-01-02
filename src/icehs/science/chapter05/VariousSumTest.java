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
System.out.println("1부터 100까지의 합 : " + sum);
System.out.println("1부터 100까지 짝수의 합 : " + evensum);
System.out.println("1부터 100까지의 홀수의 합 : " + oddsum );
	}

}

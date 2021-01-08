package icehs.science.chapter09;

public class AccountTest {
FundAccount[] fundArr = new FundAccount[2];
	public static void main(String[] args) {
		FundAccount fund = new FundAccount("111-2222", "È«±æµ¿", 5000000, 4.7);
		fund.openAccount();
		
		System.out.println();
		
		FundAccount fund2 = new FundAccount("666-7777", "È«±æ¼ø", 1000000, 2.9);
		fund2.openAccount();
	}

}

package icehs.science.chapter06;

public class Accout {
	 String name;
	 String accNo;
	 int balance;
	 
	 void deposit(int money) {
		 if(money <0) {
			 "[에러] 금액은 음수를 입력할 수 없습니다."
			 return 0;
		 }else if(balance < money) {
			 System.out.println("[에러] 잔액이 부족합니다.");
			
		 }
		 else {
		 System.out.println(money + "원을 입금합니다.");
		 balance += money;
		 return money;
	 }	
		 
int withdraw(int money) {
	System.out.println(money + "원을 출금합니다.");
	balance  -= money;
	return money;
}

void printAccoutInfo() {
	
	System.out.println("계좌 : " + accNo + "(예금주 : " +name + );
	System.out.println("잔액 : " + balance + "원");
}
}

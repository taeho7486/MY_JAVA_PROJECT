package icehs.science.chapter06;

public class Accout {
	 String name;
	 String accNo;
	 int balance;
	 
	 void deposit(int money) {
		 if(money <0) {
			 "[����] �ݾ��� ������ �Է��� �� �����ϴ�."
			 return 0;
		 }else if(balance < money) {
			 System.out.println("[����] �ܾ��� �����մϴ�.");
			
		 }
		 else {
		 System.out.println(money + "���� �Ա��մϴ�.");
		 balance += money;
		 return money;
	 }	
		 
int withdraw(int money) {
	System.out.println(money + "���� ����մϴ�.");
	balance  -= money;
	return money;
}

void printAccoutInfo() {
	
	System.out.println("���� : " + accNo + "(������ : " +name + );
	System.out.println("�ܾ� : " + balance + "��");
}
}

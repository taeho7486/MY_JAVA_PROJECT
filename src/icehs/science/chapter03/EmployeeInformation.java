package icehs.science.chapter03;

public class EmployeeInformation {

	public static void main(String[] args) {
		
		String name = "홍길동";
		int enteryear = 2002;
		int thisyear = 2020;
		
		System.out.println("이름 :" + name);
		System.out.println("입사년도 :" + enteryear);
		System.out.println("근무년수 :" + (thisyear - enteryear));
				

	}

}

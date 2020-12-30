package icehs.science.chapter03;

public class StringEx {

	public static void main(String[] args) {
		String name = "홍길동";
		String school = "동인천고등학교";
		String fullName = name + school;
		String stryear = "2020";
		String ndYear = 1 + stryear;
		int nextyear = Integer.parseInt(stryear) + 1;
		
				
		System.out.println("성명 : " + name);
		System.out.println("소속학교명 : "+ school);
		System.out.println("전체이름 : " + fullName);
		System.out.println("올해 : " + stryear);
		System.out.println("내년 : " + nextyear);
		System.out.println("이상한 년도 : " + ndYear);

		
	}

}

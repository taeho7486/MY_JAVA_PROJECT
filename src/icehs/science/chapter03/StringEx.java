package icehs.science.chapter03;

public class StringEx {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		String school = "����õ����б�";
		String fullName = name + school;
		String stryear = "2020";
		String ndYear = 1 + stryear;
		int nextyear = Integer.parseInt(stryear) + 1;
		
				
		System.out.println("���� : " + name);
		System.out.println("�Ҽ��б��� : "+ school);
		System.out.println("��ü�̸� : " + fullName);
		System.out.println("���� : " + stryear);
		System.out.println("���� : " + nextyear);
		System.out.println("�̻��� �⵵ : " + ndYear);

		
	}

}

package icehs.science.chapter06;

public class StudentTest {

	public static void main(String[] args) {
		Student gildong = new Student();
		
		gildong.name = "ȫ�浿";
		gildong.id = "S001";
		gildong.korean = 94;
		gildong.english = 80;
		gildong.math = 89;
		
		System.out.println("�̸� : " + gildong.name);
		System.out.println("�й� : " + gildong.id);
		System.out.println("���� ���� : " + gildong.korean);
		System.out.println("���� ���� : " + gildong.english);
		System.out.println("���� ���� : " + gildong.math);
		System.out.println("��� : " + gildong.caculateAverage());
		
		System.out.println("* �й��� �����մϴ�!!");
		
		gildong.chageStudentId("STU0001");
		
		gildong.printStudentInfo();

	}

}

package icehs.science.chapter09;

public class AnimalTest {

	public static void main(String[] args) {
		Cat c1 = new Cat(3, "�и��þ�", "�߿���");
		System.out.println("�̸� : " + c1.getName());
		System.out.println("���� : " + c1.getAge());
		System.out.println("���� : " + c1.getKind());
		c1.run();
		c1.hunt();
		c1.play();
		
		
		System.out.println();
		
		dog d1 = new Dog(2, "�ú������㽺Ű", "�۸���");
		System.out.println("�̸� : " + c1.getName());
		System.out.println("���� : " + c1.getAge());
		System.out.println("���� : " + c1.getKind());
		d1.run();
		d1.hunt();

	}

}

package icehs.science.chapter06;

public class BuildingTest {

	public static void main(String[] args) {
		Building building = new Building();
		
		building.name = "������Ÿ��" ;
		building.address = "������" ;
		building.totalFloor = "5";
		
		System.out.println("�ǹ��� : " +building.name);
		System.out.println("�ּ� : " + building.address);
		System.out.println("��ü �� �� : " + building.totalFloor);
		
		building.moveElevator();
		building.changeAddress( "�����");
		
		System.out.println("�� �ּ� : " + building.address);
				
		

	}

}

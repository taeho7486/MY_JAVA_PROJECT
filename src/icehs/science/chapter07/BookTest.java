package icehs.science.chapter07;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.setTitle("����ī���� �˼�");
		book1.setPrice(15000);
		Book book2 = new Book("�ظ�����", 20000);
		book2.printBookInfo();
		
		Book book3 = new Book("Office 365 in school", "������", 26000);
		book3.printBookInfo();

	}

}

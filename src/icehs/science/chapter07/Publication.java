package icehs.science.chapter07;

public class Publication {
private String title;
private int price;
private int page;

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	if(price < 0) {
		System.out.println("[����] ���� ������ ������ �Է��� �� �����ϴ�!!");
	}else {
		this.price = price;
	}
	this.price = price;
}
public int getPage() {
	return page;
}
public void setPage(int page) {
	if(page < 0) {
		System.out.println("[����] ������ ������ ������ �Է��� �� �����ϴ�.");
	}else {
		this.page = page;
	}
	
}

}

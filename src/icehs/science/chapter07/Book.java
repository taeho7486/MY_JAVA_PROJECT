package icehs.science.chapter07;

public class Book {
private String title;
private int price;
private String author;

public String getTitle() {
	return this.title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getPrice() {
	return this.price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getAuthor() {
	return this.author;
}
public Book () {
}

public Book(String title, int price) {
	this.title = title;
	price = price;
}
public Book(String title, String author, int price) {
	this.title = title;
	this.author = author;
	this.price = price;
}
void printBookInfo() {
	System.out.println(this.title);
	System.out.println(this.price);
}
}
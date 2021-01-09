package icehs.science.chapter10;

public class IPhone extends Mobile{
private String color;
public IPhone() {
	super("IPhone");
}
public void charge(int time) {
	@Override
	System.out.println("IPhone : " + time + "분 충전했더니 Full!!"); 
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
	System.out.println("IPhone : " + color);
}

}

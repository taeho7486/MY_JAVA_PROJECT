package icehs.science.chapter10;

public class Galaxy extends Mobile{
private String osVersion;
public Galaxy() {
	super("Galaxy");
}
@Override
public void charge(int time) {
	System.out.println("Galaxy : �������͸�" + time + "�� ����");
}
public String getOsVersion() {
	return osVersion;
}
public void setOsVersion(String osVersion) {
	this.osVersion = osVersion;
	System.out.println("Galaxy : " + osVersion);
}

}

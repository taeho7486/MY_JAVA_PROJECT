package icehs.science.chapter06;

public class Student {
	String name;
	String id;
	int korean;
	int english;
	int math;
	
	int caculateAverage() {
int result = (korean + english + math) / 3;
return result;
}
	
	void printStudentInfo() {
		System.out.println("학생성명 : " + name);
		System.out.println("학번 : " + id);
		System.out.println("국어 성적 : " + korean);
		System.out.println("영어 성적 : " + english);
		System.out.println("수학 성적 : " + math);
	}
		
	void chageStudentId(String newId) {	
		id = newId;
	}
}
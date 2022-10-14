package javaproject;

public class S_a {
	// 인스턴스 변수  - 독립적이다
	String color;
	String gearType;
	int door;
	int a;
	int b;
	
	// 클래스 변수 - 공유가능하며, 객체생성없이 사용 가능.
//	static int x; // 인원수
	
	// 생성자 - 인스턴스변수 초기화 시킴 , 객체가 생성될 때 한 번만 호출됨
	S_a(String color, String gearType, int door, int a, int b){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		this.a = a;
		this.b = b;
	}
	
	// 메서드
	int max() {
		
		return a + b;
	}
	
	
	
	
	
	
	

}

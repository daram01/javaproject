package javaproject;

public class S_a {
	// �ν��Ͻ� ����  - �������̴�
	String color;
	String gearType;
	int door;
	int a;
	int b;
	
	// Ŭ���� ���� - ���������ϸ�, ��ü�������� ��� ����.
//	static int x; // �ο���
	
	// ������ - �ν��Ͻ����� �ʱ�ȭ ��Ŵ , ��ü�� ������ �� �� ���� ȣ���
	S_a(String color, String gearType, int door, int a, int b){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		this.a = a;
		this.b = b;
	}
	
	// �޼���
	int max() {
		
		return a + b;
	}
	
	
	
	
	
	
	

}

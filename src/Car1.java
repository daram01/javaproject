
public class Car1 {
	// �Ӽ�(����) - �ν��Ͻ�����, Ŭ��������
	String color;
	String gearType; // �⺻�� null
	int door; // �⺻�� 0
	
	// ������ - Ư���� ������ ����ϱ� ���� �ʿ���
	// �������(�Ӽ��� �ִ� ��) �� �ϳ��� �ν��Ͻ� ������ �ʱ�ȭ�Ѵ�.(static������ �ȵ�)
	// ������ Ŭ������ �̸��� �����ϰ� �ۼ��Ѵ�. (Ŭ���� �̸��� Car1�̸� Car1����)
	// Car1({
	//	  (���๮)  -> ��������� �ʱ�ȭ �ϱ� ���� �ۼ�
	// })
	// ��ü�� �����ϴ� ������ �ѹ��� ȣ��Ǿ�����.
	// �⺻�����ڴ� ���� ���� (�ٸ� �����ڰ� ���� ����)
	// ������ �����ε� ���� - ��, �Ű������� �����ؾ���
	// ��� Ŭ������ �����ڸ� �����ϰ� �ִ�.
	// �����ڸ� ����� �� this / this() �� Ȱ���Ѵ�.
	
	// �⺻������ - ������ ����. �⺻�����ڰ� �����Ǿ� �ִ�. ��� ǥ����
	//Car1(){
		
	//}
	
//	Car1(){
//		color = "blue";
//		gearType = "stick";
//		door = 4;
//	}
	
	// �������� �����ε�
	Car1(String color){
		this(color, "Auto",4); // �ٸ� �������� ȣ�� 
		// this.color = color;
		// this.color �� ��������. this�� Car1�� ����ؼ� ����ϴ°�
	}
	
	Car1(String color, String gearType){
		this(color, gearType, 4);
		//this.color = color;
		//this.gearType = gearType;
	}
	
	Car1(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	// ���(�޼ҵ�) - �ν��Ͻ��޼ҵ�, Ŭ�����޼ҵ�
	
	// �Ӽ��� �޼ҵ�� Ŭ������ ������ �� �ʼ���

}


public class DataTest {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		Data d2= copy(d);
		
		System.out.println(d.x); // 10
		System.out.println(d2.x); // 10
		// ���� 10������ ���� ������ �����°� �ƴ�
		
//		d.x = 10;
//		System.out.println(d.x);
//		
//		//���� Ŭ���� ���� �ִ� �޼��� ȣ��
//		change(d.x);
//		System.out.println(d.x);
		
//		d.x = 10;
//		System.out.println(d.x);
//		
//		change(d);
//		
//		System.out.println(d.x);
	}
	
	static Data copy(Data d) { 
		
		Data tmp = new Data();
		tmp.x = d.x;
		
		return tmp; // void�� �ƴ� ��� ������ return�� ����� �Ѵ�.
	}
	
	
//	//�޼��� ����
//	static void change(int x) { 
//		x = 1000; // ���⼭�� x�� ���������̱� ������ �����Լ��� ������ ���� �ʴ´�.
//		System.out.println("change() : " + x);
//	}
	
//	static void change(Data d) { // �Ű����� Data d�� �������̴ϱ� �ּҰ��� �޴´�.
//		d.x = 1000;
//		System.out.println("change() : " + d.x);
//	}
}

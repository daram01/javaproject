
public class FuncStatic {
	int iv;
	static int cv;
	
	// ����޼ҵ� : �ν��Ͻ� �޼ҵ� 
	//			  Ŭ����(static) �޼ҵ� : ��ü �������� ��� ���� (�޸𸮰� �Ҵ��)
	
	
	void instanceMethod() {
		System.out.println("instanceMethod() call");
		iv = 10;
		cv = 20; // �ν��Ͻ��޼ҵ庸�� ���� �޸𸮰� �Ҵ�Ǳ� ������ ��� ����
		
		System.out.println("iv = " + iv);
		System.out.println("cv = " + cv);
		
		sataticMethod();
		
	}
	
	// ���� Ŭ���� ������ �޼ҵ忡�� ������� ��� ������
	
	static void sataticMethod() {
		System.out.println("sataticMethod() call");
		// iv = 30; 
		// static�޼ҵ忡���� �ν��Ͻ� ���� ��� �Ұ�
		// �޸� �Ҵ� ���� ������ ������ ��
		// ��ü�� �����Ǳ� ������ iv��� ���� �������� �ʱ� �����̴�.
		cv = 40;
		
		System.out.println("cv = " + cv);
		
		// instanceMethod(); // ����. ��� �Ұ���.
	}

}


public class FuncStaticTest {

	public static void main(String[] args) {
		
		//FuncStatic.cv = 20;
		//FuncStatic.sataticMethod();
		// static����, �޼ҵ�� ������ ���� ���̵� ��� �����ϴ�.
		
		FuncStatic fs = new FuncStatic(); // ��ü ����
		
		//fs.iv = 10;
		//fs.cv = 20;

		
		//fs.instanceMethod();
		//fs.sataticMethod();

		fs.instanceMethod();
		FuncStatic.sataticMethod();
		

	}

}

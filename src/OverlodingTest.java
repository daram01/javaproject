
public class OverlodingTest {

	public static void main(String[] args) {
		
		Overloding ol = new Overloding();
		
		ol.add();
		ol.add(3);
		ol.add(3L); // L�̶�� ���̻縦 �ٿ������
		ol.add(2, 3);
		ol.add(2, 3L);
		ol.add(2L, 3);
		// �ϳ��� �޼ҵ带 ������ �������� �Ű����� ��� ���� (������)
	
		System.out.println(3); // �Ű�����  int
		System.out.println('C'); // �Ű����� char
		System.out.println("ABC"); // �Ű����� String
		
	}

}

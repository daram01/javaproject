
public class StudentTest {

	public static void main(String[] args) {
//		Student sd = new Student("seodan", 10, 3);
//		System.out.println(sd.name);
//		System.out.println(sd.age);
//		System.out.println(sd.grade);
//		
//		Student sd2 = new Student("yuri", 10, 3);
//		System.out.println(sd2.name);
//		System.out.println(sd2.age);
//		System.out.println(sd2.grade);		
//		
//		Student sd3 = new Student("moran", 10, 3);
//		System.out.println(sd3.name);
//		System.out.println(sd3.age);
//		System.out.println(sd3.grade);	
		
		// �������� : 100
		// �������� : 60
		// �������� : 76
		// ������ 
		// �̸� : ȫ�浿 
		// ���� : 236
		// ��� : �Ҽ��� ��°�ڸ����� �ݿø� 78.7 
		
		Student sd = new Student("ȫ�浿", 1, 1, 100, 60, 76);

		
		System.out.println("�̸� : " + sd.name);
		System.out.println("���� : " + sd.getTotal());
		System.out.println("��� : " + sd.getAverage());

	}

}


public class Student {
//	String name; //�̸�
//	int age; //����
//	int grade; //�г�
//	
//	Student(String name, int age, int grade){
//		this.name = name;
//		this.age = age;
//		this.grade = grade;
//	}
	
// ============================================
	
//	String name; // �л� �̸�
//	int ban; // ��
//	int no; // ��ȣ
//	int kor; // ��������
//	int eng; // ��������
//	int math; // ��������
	
	// �ν��Ͻ�����
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	// ������
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	} 
	
	// ������ ���ϴ� ���
	int getTotal() {
		return kor + eng + math;
	}
	
	// ����� ���ϴ� ���
	double getAverage() {
		return (int)(getTotal() / 3.0 * 10 + 0.5) / 10.0;
	}
	
//	78.666667 * 10 // 786.666667
//	786.666667 + 0.5 // 787.166667
//	(int)787.166667 // 787
//	787 / 10.0 // 78.7
}


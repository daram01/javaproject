
public class MemberInit {

	// �������
	// 1.�ڵ� �ʱ�ȭ
	int x;
	int y;
	// 2.��� �ʱ�ȭ
	static int cv = 100;
	static int count;
	
	{ // �ν��Ͻ� �ʱ�ȭ �� - ��ü�� ������ �� ���� ȣ��
		System.out.println("�ν��Ͻ� �ʱ�ȭ ��");
		x = 10;
		y = 20;
	}
	
	static { // static �ʱ�ȭ �� - ��ü ������ �� �� ���� ȣ��
		System.out.println("static �ʱ�ȭ ��");
		count = 1000;
	}
	
	// 3. �����ڿ� ���� �ʱ�ȭ - �ַ� �� ������� �ʱ�ȭ�� �Ѵ�.
	MemberInit(int x, int y){ 
		System.out.println("�������� ȣ��");
		this.x = x;
		this.y = y;
	}
}

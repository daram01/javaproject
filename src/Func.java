
public class Func {
	
	//�޼ҵ�(�Լ�) = ��ü�� ����� �����Ѵ�.
	
//	����Ÿ�� �޼ҵ��([�Ű�����1,�Ű�����2,...]) {
//		// [] ->�ʿ����� ������ ������� �ʾƵ� �ȴ�.
//		���๮��
//		[return ��]
//	}
	
	// �ڸ���Ÿ�� -> 1. void 2.�⺻�ڷ��� 3.������
	// �޼ҵ�� -> ��Ÿǥ��� (���� ���鶧�� ������)
	// �ڸŰ����� -> int x, double d, Tv t -> 1. �⺻�� 2. ������
	// return -> ����Ÿ���� void�� �ƴ� ��쿡 ����Ѵ�.
	
	void add() { // �޼ҵ��� �����(�ñ״�ó)
		System.out.println(2 + 3); // �޼����� ������
	}
	
	
	void add2(int x, int y) {
		System.out.println(x + y);
	}
	
	int add3(int x, int y) {
		int sum = x + y;
		return sum; //  �츮�� ������ �˰���� ���� �����ش�.
	}
	
	// -, *, /�� �����
	
	//sub()
	//mul()
	//div()
	
	int add4(int x, int y) {
		int sub = x - y;
		return sub;
	}
	
	int add5(int x, int y) {
		int mul = x * y;
		return mul;
	}
	
	double add6(double x, double y) {
		double div = x / y;
		return div;
	}
	
	
	void test(int x, int y) {
		// ���ǹ��� ����ϸ� void������ return ����
		if(x < y) {
			System.out.println("�Լ��� ��� ����");
			return; // void������  return�� �Լ��� ��� ���Ḧ �ǹ��Ѵ�.
		}
		int result = x + y;
		System.out.println(result);
	}
	
	int test2(int x, int y) {	
		
		int result;
		
		if(x > y) {
			result = x; // ���ǹ��� ����� �� else�� ����Ͽ� �ݴ����ǵ� �������Ѵ�.
		}else {
			result = y;
		}
		return result; // ������ �ѹ��� ����ϴ� ���� ����.
	}
	
	// ���� Ŭ�� �������� �Լ����� ȣ�� ������.
	void call1() {
		System.out.println("call1");
		call2(); // call2�� ȣ����
	}
	
	void call2() {
		System.out.println("call2");
		call3(); // call3�� ȣ����
	}
	
	void call3() {
		System.out.println("call3");
	} // call3����� �ϰ� ���� �ڽ��� ������ ������ ������ call2�� ���ư�
	
	
	
	
}

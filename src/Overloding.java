
public class Overloding {
	// �����ε��� Ư¡
	// 1. �޼ҵ��� �̸��� �����ϰ� �Ѵ�.
	// 2. �� �Ű������� Ÿ�� �Ǵ� ������ �޶�� �Ѵ�.
	// 3. ����Ÿ�԰��� �����ϴ�.
	// 4. ��ü�� ������ ������ ���� (������)
	
	void add() {}
	
	void add(int x) {}
	
	void add(long x) {}
	
	void add(int x, int y) {}
	
	void add(int x, long y) {}
	
	void add(long x, int y) {}
	
	// void add() {} = int add() {} // �ΰ��� ����.
}


public class Overloding {
	// 오버로딩의 특징
	// 1. 메소드의 이름을 동일하게 한다.
	// 2. 단 매개변수의 타입 또는 갯수는 달라야 한다.
	// 3. 리턴타입과는 무관하다.
	// 4. 객체의 다형을 구현한 형식 (다형성)
	
	void add() {}
	
	void add(int x) {}
	
	void add(long x) {}
	
	void add(int x, int y) {}
	
	void add(int x, long y) {}
	
	void add(long x, int y) {}
	
	// void add() {} = int add() {} // 두개는 에러.
}

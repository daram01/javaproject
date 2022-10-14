
public class MemberInit {

	// 멤버변수
	// 1.자동 초기화
	int x;
	int y;
	// 2.명시 초기화
	static int cv = 100;
	static int count;
	
	{ // 인스턴스 초기화 블럭 - 객체가 생성될 때 마다 호출
		System.out.println("인스턴스 초기화 블럭");
		x = 10;
		y = 20;
	}
	
	static { // static 초기화 블럭 - 객체 생성시 딱 한 번만 호출
		System.out.println("static 초기화 블럭");
		count = 1000;
	}
	
	// 3. 생성자에 의한 초기화 - 주로 이 방법으로 초기화를 한다.
	MemberInit(int x, int y){ 
		System.out.println("생성자의 호출");
		this.x = x;
		this.y = y;
	}
}


public class Card {
	//속성
	//변수 : 인스턴스 변수 - int age - 독립적
	//	클래스(스테틱) 변수 - static(제어자) int size ★
	// 	특징 : 필요에 따라 선언과 동시에 초기화를 한다.
	//		  생성없이 사용 가능
	//		  공유 되어진다.★
	
	int iv;
	static int cv = 100; // 필요에 따라 직접 값을 초기화해서 사용 
//	
//	void channel() {
//		int x;		// 지역변수 (강제 초기화)
//	}
	
	// Card의 속성 : 숫자, 모양, 크기(높이, 넓이), 등 ..
	
	int number;
	String kind;
	static int heigth = 100; 
	static int width = 80;
	
}


public class FuncStatic {
	int iv;
	static int cv;
	
	// 멤버메소드 : 인스턴스 메소드 
	//			  클래스(static) 메소드 : 객체 생성없이 사용 가능 (메모리가 할당됨)
	
	
	void instanceMethod() {
		System.out.println("instanceMethod() call");
		iv = 10;
		cv = 20; // 인스턴스메소드보다 먼저 메모리가 할당되기 때문에 사용 가능
		
		System.out.println("iv = " + iv);
		System.out.println("cv = " + cv);
		
		sataticMethod();
		
	}
	
	// 같은 클래스 내에서 메소드에서 멤버변수 사용 가능함
	
	static void sataticMethod() {
		System.out.println("sataticMethod() call");
		// iv = 30; 
		// static메소드에서는 인스턴스 변수 사용 불가
		// 메모리 할당 시점 때문에 에러가 남
		// 객체가 생성되기 전에는 iv라는 것은 존재하지 않기 때문이다.
		cv = 40;
		
		System.out.println("cv = " + cv);
		
		// instanceMethod(); // 에러. 사용 불가임.
	}

}

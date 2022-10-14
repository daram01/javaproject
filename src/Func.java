
public class Func {
	
	//메소드(함수) = 객체의 기능을 구현한다.
	
//	리턴타입 메소드명([매개변수1,매개변수2,...]) {
//		// [] ->필요하지 않으면 사용하지 않아도 된다.
//		실행문장
//		[return 값]
//	}
	
	// ★리턴타입 -> 1. void 2.기본자료형 3.참조형
	// 메소드명 -> 낙타표기법 (변수 만들때와 동일함)
	// ★매개변수 -> int x, double d, Tv t -> 1. 기본형 2. 참조형
	// return -> 리턴타입이 void가 아닌 경우에 사용한다.
	
	void add() { // 메소드의 선언부(시그니처)
		System.out.println(2 + 3); // 메서드의 구현부
	}
	
	
	void add2(int x, int y) {
		System.out.println(x + y);
	}
	
	int add3(int x, int y) {
		int sum = x + y;
		return sum; //  우리가 실제로 알고싶은 값을 돌려준다.
	}
	
	// -, *, /로 만들기
	
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
		// 조건문을 사용하면 void에서도 return 가능
		if(x < y) {
			System.out.println("함수의 즉시 종료");
			return; // void에서의  return은 함수의 즉시 종료를 의미한다.
		}
		int result = x + y;
		System.out.println(result);
	}
	
	int test2(int x, int y) {	
		
		int result;
		
		if(x > y) {
			result = x; // 조건문을 사용할 때 else를 사용하여 반대조건도 만들어야한다.
		}else {
			result = y;
		}
		return result; // 리턴은 한번만 사용하는 것이 좋다.
	}
	
	// 같은 클라스 내에서도 함수끼리 호출 가능함.
	void call1() {
		System.out.println("call1");
		call2(); // call2를 호출함
	}
	
	void call2() {
		System.out.println("call2");
		call3(); // call3를 호출함
	}
	
	void call3() {
		System.out.println("call3");
	} // call3출력을 하고 나면 자신의 역할이 끝났기 때문에 call2로 돌아감
	
	
	
	
}

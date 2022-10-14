
public class DataTest {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		Data d2= copy(d);
		
		System.out.println(d.x); // 10
		System.out.println(d2.x); // 10
		// 같은 10이지만 같은 곳에서 가져온게 아님
		
//		d.x = 10;
//		System.out.println(d.x);
//		
//		//같은 클래스 내에 있는 메서드 호출
//		change(d.x);
//		System.out.println(d.x);
		
//		d.x = 10;
//		System.out.println(d.x);
//		
//		change(d);
//		
//		System.out.println(d.x);
	}
	
	static Data copy(Data d) { 
		
		Data tmp = new Data();
		tmp.x = d.x;
		
		return tmp; // void가 아닐 경우 무조건 return을 적어야 한다.
	}
	
	
//	//메서드 선언
//	static void change(int x) { 
//		x = 1000; // 여기서의 x는 지역변수이기 때문에 메인함수의 영향을 받지 않는다.
//		System.out.println("change() : " + x);
//	}
	
//	static void change(Data d) { // 매개변수 Data d는 참조형이니까 주소값을 받는다.
//		d.x = 1000;
//		System.out.println("change() : " + d.x);
//	}
}

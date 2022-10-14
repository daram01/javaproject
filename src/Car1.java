
public class Car1 {
	// 속성(변수) - 인스턴스변수, 클래스변수
	String color;
	String gearType; // 기본값 null
	int door; // 기본값 0
	
	// 생성자 - 특정한 역할을 사용하기 위해 필요함
	// 멤버변수(속성에 있는 것) 중 하나인 인스턴스 변수를 초기화한다.(static변수는 안됨)
	// 형식은 클래스와 이름과 동일하게 작성한다. (클래스 이름이 Car1이면 Car1으로)
	// Car1({
	//	  (실행문)  -> 멤버변수를 초기화 하기 위해 작성
	// })
	// 객체를 생성하는 시점에 한번만 호출되어진다.
	// 기본생성자는 생략 가능 (다른 생성자가 없을 때만)
	// 생성자 오버로딩 가능 - 단, 매개변수를 정의해야함
	// 모든 클래스는 생성자를 포함하고 있다.
	// 생성자를 사용할 때 this / this() 를 활용한다.
	
	// 기본생성자 - 역할이 없음. 기본생성자가 생략되어 있다. 라고 표현함
	//Car1(){
		
	//}
	
//	Car1(){
//		color = "blue";
//		gearType = "stick";
//		door = 4;
//	}
	
	// 생성자의 오버로딩
	Car1(String color){
		this(color, "Auto",4); // 다른 생성자의 호출 
		// this.color = color;
		// this.color 는 지역변수. this는 Car1을 대신해서 사용하는것
	}
	
	Car1(String color, String gearType){
		this(color, gearType, 4);
		//this.color = color;
		//this.gearType = gearType;
	}
	
	Car1(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	// 기능(메소드) - 인스턴스메소드, 클래스메소드
	
	// 속성과 메소드는 클래스를 구성할 때 필수임

}

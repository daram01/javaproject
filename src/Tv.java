
public class Tv { //부모클래스
	
//	상속
//	부모클래스 의 특징 
//	1. 여러 자식클래스를 갖는다.
//	2. 단일 상속만 가능하다.(자식 입장에서 여러 부모 사용 하는 건 불가능함)
	
	
//	속성
//	크기, 전원 버튼, 채널, 볼륨, 색상, 인터넷 등 ... 모델, 제조년도, 제조사, 
//	
//	기능(행위)
//	전원 ON/OFF, 채널 UP/DOWN, 볼륨 UP/DOWN 등 ...
	
	// 멤버 변수
	// 변수를 선언하는 순간 자동으로 초기화가 됨
	boolean power; // 전원버튼 false
	int channel; // 채널 0
	int volume; // 볼륨 0
	String color; // 색상 null
	String model; // 모델 null
	int year; // 제조년도 0
	String company; //제조사 null
	
	// 메서드
	void Power() {		// 전원 ON/OFF 
		power = !power; // ! - true면 false, false면 true
	}
	void channelUp() {		// 채널 UP 
		channel++;
	}
	void channelDown() {		// 채널 DOWN 
		channel--;
	}
	void volumeUp() {		// 볼륨 UP
		volume++;
	}
	void volumeDown() {		// 볼륨 DOWN
		volume--;
	}
	
	void showInfo() {		// 제품을 소개하는 기능
		System.out.println(model);
		System.out.println(year);
		System.out.println(company);
	}
}

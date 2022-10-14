
public class CaptionTv extends Tv{
	//Tv라는 클래스로부터 변수 7개와 메소드 6개를 상속받는다.
	boolean caption; // false가 기본값.
	
	void displayCaption(String test) { //자막기능
		if(caption) { //true
			System.out.println(test);
		}
	}
}

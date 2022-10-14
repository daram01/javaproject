
public class OverlodingTest {

	public static void main(String[] args) {
		
		Overloding ol = new Overloding();
		
		ol.add();
		ol.add(3);
		ol.add(3L); // L이라는 접미사를 붙여줘야함
		ol.add(2, 3);
		ol.add(2, 3L);
		ol.add(2L, 3);
		// 하나의 메소드를 가지고 여러가지 매개변수 사용 가능 (다형성)
	
		System.out.println(3); // 매개변수  int
		System.out.println('C'); // 매개변수 char
		System.out.println("ABC"); // 매개변수 String
		
	}

}

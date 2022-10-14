
public class TvTest {
	
	public static void main(String[] args) {
		
//		int sum; // 지역 변수
//		sum += 10; // 지역 변수 같은 경우 오류 발생 ( 값을 초기화하지 않았기 때문 )
		
		// TODO Auto-generated method stub
		// System.out.println(new Tv()); // 생성과 동시에 메모리에 할당되었으며, 메모리들의 주소가 됨
		// Tv@15db9742  생성된 Tv객체의 첫번째 멤버의 주소값
		
//		new Tv().power = true;
//		new Tv().channel = 10;
//		
//		위의 형식으로는 생성하지 않음.
//		System.out.println(new Tv()); Tv@15db9742
//		System.out.println(new Tv()); Tv@6d06d69c
//		객체가 각각 할당 되기 때문이다.
		
		Tv t = new Tv(); // Tv t -> 참조변수 == 주소값 
		//System.out.println(t);
		t.power = true;
		t.channel = 10;
		System.out.println(t.channel); // 10
		t.channelDown();
		System.out.println(t.channel); // 9
		
		Tv t2 = new Tv();
		t2.channel = 20;
		System.out.println(t2.channel); // 20
		t2.channelDown();
		System.out.println(t.channel); // 9
		System.out.println(t2.channel); // 19
		
		t2 = t; // t2를 t로 만드는 과정 (치환) - 두 참조 변수의 타입이 동일한 경우만 가능
		System.out.println(t.channel); // 9
		System.out.println(t2.channel); // 9
		t.channelDown();
		System.out.println(t.channel); // 8
		System.out.println(t2.channel); // 8
		
		
	}

}

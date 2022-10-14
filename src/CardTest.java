
public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		System.out.println("Card.cv = " + Card.cv);
//		
//		
//		Card c1 = new Card(); // 객체 생성
//		c1.iv = 10;
//		
//		Card c2 = new Card();
//		c2.iv = 20;
//		
//		System.out.println("c1.iv = " + c1.iv);
//		System.out.println("c2.iv = " + c2.iv);
//		
//		System.out.println("c1.cv = " + c1.cv);
//		System.out.println("c2.cv = " + c2.cv);
//		
//		c1.cv = 80;
//		System.out.println("c1.cv = " + c1.cv);
//		System.out.println("c2.cv = " + c2.cv);
//		
//		Card.cv = 200; // 클래스 이름을 포함하여 주로 사용한다.★
//		System.out.println("c1.cv = " + c1.cv);
//		System.out.println("c2.cv = " + c2.cv);
		
//		Card c1 = new Card();
//		c1.number = 1;
//		c1.kind = "hart";
//		
//		Card c2 = new Card();
//		c2.number = 3;
//		c2.kind = "spade";		
//		
//		System.out.println(c1.number);
//		System.out.println(c1.kind);
//		System.out.println(c2.number);
//		System.out.println(c2.kind);
//		System.out.println(Card.heigth);
//		System.out.println(Card.width);
		
		Card c1 = new Card();
		c1.iv = 10;
		c1.number = 7;
		c1.kind = "spade";
		Card.heigth = 50;
		Card.width = 20;
		
		System.out.println(Card.heigth + Card.width);
		
		Card c2 = new Card();
		c2.iv = 20;
		c2.number = 10;
		c2.kind = "Heart";
		
		
		
		
		
		
	}

}

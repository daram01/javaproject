
public class FuncStaticTest {

	public static void main(String[] args) {
		
		//FuncStatic.cv = 20;
		//FuncStatic.sataticMethod();
		// static변수, 메소드는 별도의 생성 없이도 사용 가능하다.
		
		FuncStatic fs = new FuncStatic(); // 객체 생성
		
		//fs.iv = 10;
		//fs.cv = 20;

		
		//fs.instanceMethod();
		//fs.sataticMethod();

		fs.instanceMethod();
		FuncStatic.sataticMethod();
		

	}

}


public class MyMathTest {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		
		int sum1 = mm.add(2, 5);
		System.out.println(sum1);
		
		long sum2 = mm.add(2L, 6L);
		System.out.println(sum2);
		
		int[] arr = {1,2,3,4,5};
		int sum3 = mm.add(arr);
		System.out.println(sum3);
	}

}

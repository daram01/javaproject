
public class ArrayMaxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. ArrayMax 객체를 생성한다.
		// 2. 생성된 객체의 배열에 1 ~ 100 사이의 값을 랜덤하게 저장한다.
		// 3. 메소드를 정의한다. (배열의 최대값을 구해서 반환하도록 한다.)
		// 4. 반환된 최대값을 출력한다.
		
		ArrayMax am = new ArrayMax(); // 객체 생성
		
		for(int i = 0; i <am.arr.length; i++) {
			for(int j = 0; j <am.arr.length; j++) {
				am.arr[i] = (int)(Math.random() * 100) + 1;
			}
		}
		
		for(int i : am.arr) {
			System.out.println(i);
		}
		
		int max = arrayMax(am.arr);
		System.out.println("max = " + max);
		
		
	}
				
	static int arrayMax(int[] arr) {
		
		int max = arr[0];
		for(int i = 0; i <arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

}




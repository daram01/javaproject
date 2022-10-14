
public class Deqwdskk {

	public static void main(String[] args) {
		// 1. ArrayMax 객체를 생성한다.
		// 2. 생성된 객체의 배열에 1 ~ 100 사이의 값을 랜덤하게 저장한다.
		// 3. 메소드를 정의한다. (배열의 최대값을 구해서 반환하도록 한다.)
		// 4. 반환된 최대값을 출력한다.
		
		
		ArrayMax am = new ArrayMax();
		
		for(int i = 0; i < am.arr.length; i++) {
			for(int j = 0; j < am.arr.length; j++) {
				am.arr[i] = (int)(Math.random() * 100) + 1;
			}
		}
		
		for(int i : am.arr) {
			System.out.println(i);
		}
		
		int max = arr(am.arr);
		System.out.println("max = " + max);

	}
	
	static int arr(int[] arr) {
		
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i);
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

}

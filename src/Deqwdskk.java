
public class Deqwdskk {

	public static void main(String[] args) {
		// 1. ArrayMax ��ü�� �����Ѵ�.
		// 2. ������ ��ü�� �迭�� 1 ~ 100 ������ ���� �����ϰ� �����Ѵ�.
		// 3. �޼ҵ带 �����Ѵ�. (�迭�� �ִ밪�� ���ؼ� ��ȯ�ϵ��� �Ѵ�.)
		// 4. ��ȯ�� �ִ밪�� ����Ѵ�.
		
		
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
import java.util.Arrays;
import java.util.Scanner;

public class Nam {

	public static void main(String[] args) {
		 //  국어 영어 수학
	int[][] score = {
			{10,10,10},
			{20,20,20},
			{30,30,30},
			{40,40,40},
			{50,50,50},
		     };
//	실행결과
//	번호   국어   영어  수학      총점      평균
//	 1  10  10  10   30  10.0
//	 2  20  20  20   60  20.0
//	 3  30  30  30   90  30.0
//	 4  40  40  40  120  40.0
//	 5  50  50  50  150  50.0
//	합계  150 150 150  450  30.0	
	
	
//	System.out.print("   번호    국어     영어     수학        총점      평균");
//	System.out.println();
//	System.out.println("================================");
//	
//	int kortot = 0;
//	int engtot = 0;
//	int mathtot = 0;
//
//
//	
//	for(int i = 0; i < score.length; i++) {
//		int sum = 0;
//		kortot += score[i][0];
//		engtot += score[i][1];
//		mathtot += score[i][2];
//
//		double x = 0;
//		System.out.print("  "+(i + 1));
//		for(int j = 0; j <score[i].length; j++) {
//			sum += score[i][j];
//			System.out.print("   " + score[i][j]);
//			x = sum / score[i].length;
//
//			
//		}
//		System.out.print("   " + sum);
//		System.out.print("   " + x);
//		System.out.println();
//	}
//	
//		
//	int ftot = kortot + engtot + mathtot ;
//	System.out.print("   합계");
//	System.out.print("  " + kortot + "  " + engtot + "  " + mathtot + "   " + ftot + "   ");
	
	
//		char[][] arr = new char[5][5];
//		
////		*
////		**
////		***
////		****
////		*****
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				if(j + i >= 4) {
//					System.out.print('*');
//				}	
//			}
//			System.out.println();			
//		}
	
	//아래는 변수 의 값에 따라 num은  ‘0’ 양수 음수 을 출력하는 코드이다 삼항 연산
	//자를 이용해서 에 알맞은 코드를 넣으시오

//	int num = 10;
//	System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "0"));
	
	// 3-4
//	int num = 456;
//	System.out.println(num / 100 * 100);
	
	// 3-5
//	int num = 777;
//	System.out.println(num / 10 * 10 + 1);
	
	// 3-6
//	int num = 24;
//	System.out.println(10 - num % 10 );
	
//	int k=1;
//	for(int i=0; i<5; i++) {
//		System.out.println("i = " + i);
//		for(int j=0; j<5; j++) {
//			System.out.println("k = " + k++);
//			if(k % 3 == 0) {
//				break;
//			}
//		}
//	}
	
//	int k = 1;
//	for(int i = 0; i<5; i++) {
//		System.out.println("i = " + i);
//		for(int j = 0; j<5; j++	) {
//			System.out.println("k = " + k++);;
//			if(k % 3 == 0) {
//				break;
//			}
//		}
//	}
	
	
//	int k = 1;
//	for(int i = 0; i<5; i++) {
//		System.out.println("i = " + i);
//		for(int j = 0; j<5; j++) {
//			System.out.println("k = " + k++);
//			if(k % 3 == 0 || 2 == 0) {
//				break;
//			}
//		}
//	}
	
	//12345 -> 1+2+3+4+5 -> 15
//	Scanner sc = new Scanner(System.in);
//	System.out.println("정수를 입력하세요.");
//	int num = sc.nextInt();
//	
//	int sum = 0;
//	for(int i = 1; i<=5; i++) {
//		for(int j = 1; j<=5; j++) {
//			sum += i++;
//		}
//		System.out.println(sum);
//	}
	
	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("정수를 입력하세요.");
//	int num = sc.nextInt();
//	System.out.println(num);
//	
//	int sum = 0;
//	while(num > 0) {
//		sum += num % 10;
//		num /= 10;
//	}
//	System.out.println(sum);
	
	// 방정식 2x4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<10 이다
	
	
//	for(int x = 0;x <=10; x++) {
//	for(int y = 0;y <=10; y++){
//		if(2*x+ 4*y == 10) {
//			System.out.println(x + ", " + y);
//			
//		}
//	}
//}
//	for(int x =0; x <=10; x++) {
//		for(int y = 0; y <= 10; y++) {
//			if(2*x + 4*y == 10) {
//				System.out.println("x = " + x + "y = " + y);
//			}
//		}
//	}
	
	// 1+(-2)+3(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총 합이 100이상이 되는지 출력하세요.
	
//	int sum = 0;
//	int s = 1;
//	int num = 0;
//	int i;
//	for(i = 1; true; i++,s=-s) {
//		num = s * i;
//		sum += num;
//		if(sum >= 100) {
//			break;
//		}
//	}
//	
//	System.out.println(sum +", " + i); 
//	
//	int sum = 0;
//	int s = 1;
//	int num = 0;
//	int i;
//	for(i = 1; true; i++, s=-s) {
//		num = s * i;
//		sum += num;
//		if(sum >= 100) {
//			break;
//		}
//	}
//	
//	System.out.println(sum +", " + i);

	

	}

}

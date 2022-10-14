

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
// 배열 : 동일한 타입의 변수를 여러개 정의 하는 것
		
//		int a,b,c,d,e;
//		a = 10;
//		b = 20;
//		c = 30;
//		d = 40;
//		e = 50;
		
		
//		int[] arr; // 배열의 선언 
//		arr = new int[5]; // 배열의 생성
		
//		int[] arr = new int[5];
		
//		int[] arr = {10,20,30,40,50};
		
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;

		
//		char[] cArr = new char[4];
		
//		char[] cArr = {'G','o','o','d'};
		
//		cArr[0] = 'G';
//		cArr[1] = 'o';
//		cArr[2] = 'o';
//		cArr[3] = 'd';
		
//		System.out.println(cArr[0]);
		
//		String[] strArr = {"java","jsp","DB"};
//		System.out.println(strArr[1]);
//		strArr[2] = "html";
//		System.out.println(strArr[2]);
		
//		int x = 10;
//		int y;
//		y = x;
		
		
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2;
		
//		arr2 = arr1; // 배열 변수는 주소값이다.
//		
//		System.out.println(arr1[0]);
//		System.out.println(arr2[0]);
//		
//		arr2[3] = 10;
//		
//		System.out.println(arr1[3]);
//		System.out.println(arr2[3]);
		
		
		// 배열의 활용
		// 순차처리
		// 반복문
		
		
		// 쓰기 작업
//		int[] arr = new int[5];
//		
//		for(int i = 0;i < arr.length; i++) {
//			arr[i] = 1;
//		}
//		
//		// 읽기 작업
//		for(int i = 0; i < 5; i++) {
//			System.out.println(arr[i]);
//		}
		
//		int[] arr = new int[10];
//		
//		for(int i = 0; i < arr.length; i++) { //i = 0,1,2,3,4,5,6,7,8,9
//			arr[i] = i + 1;
//			System.out.println(arr[i]);
//		}
//		
//		int sum = 0;
//		
//		for(int i=0;i<arr.length;i++) {
//			sum += arr[i];
//		}
//		System.out.println(sum);		
//		
//		int odd = 0;
//		int even = 0;
//		
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i] % 2 == 1) {
//				odd += arr[i];
//			}else {
//				even += arr[i];
//			}
//		}
//		System.out.println("홀수 : " + odd);
//		System.out.println("짝수 : " + even);
		
//		for(변수 : 배열변수명) {
//			실행문
//		}
		
//		int[] arr = {1,2,3,4,5};
//		
//		for(int i : arr) {
//			System.out.println(i);
//		}
//		
//		int sum = 0;
//		for(int i : arr) {
//			sum += i;
//		}
//		
//		String[] str = {"사과", "딸기", "포도"};
//		
//		for(String s : str) {
//			System.out.println(s);
//		}
//		
//		int[] arr = new int[10];
//		
//		// 난수 1 ~ 100 사이값 중에 10개를 배열 값으로 초기화 한다.
//		// 배열의 값을 출력한다.
//		
//		
//		for(int i=0;i<arr.length;i++) {
//			int ran = (int)(Math.random() * 100) + 1;
//			arr[i] = ran;
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
//		System.out.println("============");
//		
//		int max = arr[0];
//		int min = arr[0];
//		
//		for(int i = 0;i < arr.length; i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//			if(min > arr[i]) {
//				min = arr[i];
//			}
//			}
//		System.out.println("max = " + max);
//		System.out.println("min = " + min);
		
		
//		int[] arr = new int[10];
		// 난수를 사용하여  0 ~ 9 값으로 초기화 한다.
		
//		실행결과 
//		0 - 2개
//		1 - 0개
//		3 - 1개
//		...
//		9 - 3개
		
//		for(int i = 0; i<arr.length;i++) {
//			int ran = (int)(Math.random() * 10);
//			arr[i] = ran; // 여기까지 난수로 초기화
//		}
//		
//		for(int i = 0; i<arr.length;i++) {
//			System.out.print(arr[i] + ",");
//		}
		
//		int n0=0,n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0;
		
//		int[] cntArr = new int[10]; // 기본값(인트의 기본값인 0)으로 자동 초기화 한다.
//		
//		for(int i = 0; i<arr.length;i++) {
//			cntArr[arr[i]]++;
//			}
//			
//		System.out.println();	
//		
//		for(int i=0;i<cntArr.length;i++) {
//			System.out.println(i + " - " + cntArr[i]);
//		}
//			if(arr[i] == 0) {
//				n0++;
//			}else if(arr[i] == 1) {
//				n1++;
//			}else if(arr[i] == 2) {
//				n2++;
//			}else if(arr[i] == 3) {
//				n3++;
//			}else if(arr[i] == 4) {
//				n4++;
//			}else if(arr[i] == 5) {
//				n5++;
//			}else if(arr[i] == 6) {
//				n6++;
//			}else if(arr[i] == 7) {
//				n7++;
//			}else if(arr[i] == 8) {
//				n8++;
//			}else if(arr[i] == 9) {
//				n9++;
//	}
//		}
//		System.out.println();
//		
//		System.out.println(0 + "=" + n0);
//		System.out.println(1 + "=" + n1);
//		System.out.println(2 + "=" + n2);
//		System.out.println(3 + "=" + n3);
//		System.out.println(4 + "=" + n4);

		
//		int[] arr = {2,4,1,5,3};
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i + 1;j<arr.length;j++) {
//				if(arr[i] > arr[j]) {
//					int tmp;
//					tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;						
//				}
//			}
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i] + ", "); // 1,2,3,4,5
//		}
		
		
//		int tmp;
//		
//		tmp = arr[1];
//		arr[1] = arr[3];
//		arr[3] = tmp;
		
//		for(int i=0;i<arr.length * 5;i++) {
//			int x = (int)(Math.random() * 5);
//			int y = (int)(Math.random() * 5);
//			
//			int tmp;
//			tmp = arr[x];
//			arr[x] = arr[y];
//			arr[y] = tmp;
//			
//		}
//		
//		for(int i= 0;1>arr.length;i++) {
//		System.out.println(arr[i] + ", ");
//		}
		
		
		// 연습문제 

//		김연아  메달 10개
//		홍길동 메달 3개
//		손흥민 메달 2개
//		
//	      String[] name = {"홍길동","손흥민","김연아"};
//	      int[] medal = {3,2,10};
//	      
//	      for(int i=0;i<medal.length;i++) {       
//	         for(int j=i+1;j<medal.length;j++) {        //최솟값부터 비교하기 위해 하나씩 더 뒤에거를 비교하므로 i+1이된다.
//	            if(medal[i]<medal[j]) {                //부등호 방향만 변경 해주면 오름차순 내림차순 정렬 가능하다.
//	               int tmp;
//	               tmp = medal[i];
//	               medal[i] = medal[j];
//	               medal[j] = tmp;
//	                 
//	               String nTmp;
//	               nTmp = name[i];
//	               name[i] = name[j];
//	               name[j] = nTmp;
//	           }
//	         }
//	      }
//	      for(int i=0;i<medal.length;i++) {
//	         System.out.println(name[i] + " 메달 " + medal[i] +"개 "+ (i+1) + "등 입니다.");   //(i+1) ->메달 가장 많은순으로 정렬이 되어있고, 차례대로 i+1로 출력해준다.
//	            }		

//----------------------------------------------------------------------------		
		
//		배열 - 1차원
//		   - 다차원(2차원) - 정방향(열의 크기가 동일), 비정방향(열의 크기가 다른 경우-잘 쓰이진 않음)
		
//		int[][] score; // 선언			
//		score = new int[5][3]; // 생성
		
//		int[][] score = new int[5][3]; // 선언과 생성을 동시에 함
		
//		int[][] score = {
//				{1,2,3}, // {} ->행
//				{4,5,6},
//				{7,8,9},
//				{10,11,12},
//				{13,14,15}
//		};
		
//		score[0][0] = 1;
//		score[0][1] = 2;
//		score[0][2] = 3;
//		
//		score[1][0] = 4;
//		score[1][1] = 5;
//		score[1][2] = 6;
//		
//		score[4][2] = 15;
//		   
//		
//		System.out.println(score[0][0]);
//		System.out.println(score[0][1]);
//		System.out.println(score[0][2]);
//		
//		System.out.println(score[4][2]);
		
//		int[][] arr = new int[0][0];
//		arr[0]; // 이런식으로 하나의 인덱스 번호만 있을 경우엔 행의 위치를 뜻함
//		arr[1];
		
		
//		for(int i = 0; i<score.length; i++) { // 행의 크기
//			for(int j = 0; j<score[i].length; j++) { // 열의 크기
//				System.out.print(score[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//			System.out.println("==========");
//		// 밑에는 향상된 형태의  for문
//		for(int[] i : score) { // score - 전체 행
//			for(int j : i) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
//----------------------------------------------------------------------------
		
		// 크기가 10인 2차원 배열 만들기
		
		//int num = 1;
//		int[][] arr = new int[2][5];
//	
//		for(int i = 0; i < arr.length; i++) { // i = 0, 1
//			for(int j = 0; j <arr[i].length; j++) { // j = 0, 1, 2, 3, 4
//				arr[i][j] = (i*5) + j + 1; // num++도 가능 // 1,2,3,4,5
//			}										  	// 6,7,8,9,10
//		}
//		
//		for(int[] i : arr) {
//			for(int j : i) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}

//----------------------------------------------------------------------------	
	
//		// (연습문제) 1부터 15까지 숫자를 넣은 후 향상된 for문으로 출력하기
//		//int num = 1;
//		int[][] arr = new int[5][3]; // 15칸짜리 
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = (i*3) + j + 1; // num++;도 가능함
//			}
//		}
//		
//		for(int[] i : arr) {
//			for(int j : i) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
//----------------------------------------------------------------------------		
		
		// (연습문제1) 별찍기 
		// *
		// **
		// ***
		// ****
		// *****
		
//		char[][] star = new char[5][5]; // 25칸
//		
//		for(int i = 0; i < star.length; i++) {
//			for(int j = 0; j < star[i].length; j++) {
//				if(i >= j)
//				star[i][j] = '*';
//			}
//		}
//		
//		for(char[]i : star) {
//			for(char j : i) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		// *****
		// ****
		// ***
		// **
		// *

//		char[][] star = new char[5][5]; 
//		
//		for(int i = 0; i < star.length; i++) {
//			for(int j = 0; j < star[i].length; j++) {
//				if(i + j <= 4) {
//				star[i][j] = '*';
//				}
//			}
//		}
//		
//		for(char[]i : star) {
//			for(char j : i) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}		
		
		
//		char[][] star = new char[5][5]; 
//		
//		//     *
//		//    **
//		//   ***
//		//  ****
//		// *****
//		
//		for(int i = 0; i < star.length; i++) {
//			for(int j = 0; j < star[i].length; j++) {
//				if(i + j >= 4) {
//				star[i][j] = '*';
//				}
//			}
//		}
//	
//		for(char[]i : star) {
//			for(char j : i) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}	
		
//			*
//		   ***
//		  *****
//		 *******
//		*********
		
//		char[][] star = new char[5][9];
//		
//		for(int i = 0; i < star.length; i++) {
//			for(int j = 0; j < star[i].length; j++) {
//				if(i + j >= 4 && j - i <= 4) {
//					star[i][j] = '*';
//				}
//			}
//		}
//		for(char[]i : star) {
//			for(char j : i) {
//				System.out.print(" " +j);
//			}
//			System.out.println();
//		}	
		
		// 강사님 해석
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("행의 크기를 입력하세요 : ");
//		int row = sc.nextInt();
//		int col = row * 2 - 1;
//		
//		char[][] star = new char[row][col];
//		
//		for(int i = 0; i < star.length; i++) {
//			int starCnt = 2 * i + 1;
//			int starStart = star.length - (i + 1);
//			
//			for(int j = starStart; j < starStart + starCnt; j++){
//				star[i][j] = '*';				
//			}
//
//		}
//
//		for(char[]i : star) {
//			for(char j : i) {
//			System.out.print(" " +j);
//			}
//			System.out.println();
//		}	

//----------------------------------------------------------------------------	
		
//		char[][] star = {
//				{'*','*',' ',' ',' '}, 			// ㄴ 자의 형태로 *이 들어가있음       ****
//				{'*','*',' ',' ',' '},			// 4행 5열				 ****
//				{'*','*','*','*','*'},			// ┌ 형태로 만들기			 **
//				{'*','*','*','*','*'},			//						 **
//		};										//						 **
		
//		for(int i = 0; i < star.length; i++) {
//			for(int j = 0; j < star[i].length; j++) {
//					System.out.print(star[i][j]);
//			}
//			System.out.println();
//		}
		
//		char[][] result = new char[star[0].length][star.length]; // 5행 4열 
//		
//		for(int i = 0; i < star.length; i++) {
//			for(int j = 0; j < star[i].length; j++) {
//				int x = j;
//				int y = 3 - i;
//				
//				result[x][y] = star[i][j]; 		
//			}
//		}
//		
//		for(char[]i : result) {
//			for(char j : i) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}		
		
//----------------------------------------------------------------------------	
			 // 국어 영어 수학
//		int[][] score = {
//				{10,10,10},
//				{20,20,20},
//				{30,30,30},
//				{40,40,40},
//				{50,50,50},
//		};
//		
//		
//		실행결과
//		번호   국어   영어  수학      총점      평균
//		 1  10  10  10   30  10.0
//		 2  20  20  20   60  20.0
//		 3  30  30  30   90  30.0
//		 4  40  40  40  120  40.0
//		 5  50  50  50  150  50.0
//		합계  150 150 150  450  30.0
//		
//		System.out.println("번호   국어   영어   수학    총점    평균");
//		
//		int sum;
//		int korTot = 0;
//		int engTot = 0;
//		int mathTot = 0;
//		
//		for(int i = 0; i <score.length; i++) {
//
//			korTot += score[i][0]; // 국어의 합계점수
//			engTot += score[i][1]; // 영어의 합계점수
//			mathTot += score[i][2];   // 수학의 합계점수
//			
//			sum = 0;
//			System.out.print(" " + (i + 1));
//			for(int j = 0; j<score[i].length; j++) {
//				sum += score[i][j];
//				System.out.print("  " + score[i][j] + "");
//			}
//			System.out.print("  " + sum); // 총점
//			double avg = sum / (double)score[i].length; // 평균
//			System.out.print("  " + avg); // 평균
//			System.out.println();
//		}
//		int TotScore = korTot + engTot + mathTot;
//		System.out.println("합계 " + " " + korTot+ " " + engTot+ " " + mathTot + " "+ TotScore);
		
//----------------------------------------------------------------------------	
		
		// 25칸짜리 2차원 배열
		// 배열에 값은 1 - 50 까지의 정수값 중 난수 25개만 사용 
		// 값을 입력하고 배열에 같은 값이 있으면 O로 변경한다.
		// 배열의 모든 값이 0으로 바뀌면 게임을 종료한다.
		
//		int[][] bingo =  new int[5][5];
//
//		for(int i = 0; i <bingo.length; i++) {
//			for(int j = 0; j<bingo[i].length; j++) {
//				bingo[i][j] = (int)(Math.random()*50) + 1;
//			}
//		}
//
//		for(int i = 0; i <bingo.length; i++) {
//			for(int j = 0; j<bingo[i].length; j++) {
//				System.out.print(bingo[i][j] + " ");
//			}	
//			System.out.println();
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		boolean flage = true;
//		int num;
//		int sum = 0;
//
//		while(flage) {
//			System.out.println("숫자를 입력하세요.");
//			num = sc.nextInt();
//			
//			sum = 0;
//			for(int i = 0; i <bingo.length; i++) {
//				for(int j = 0; j<bingo[i].length; j++) {
//					if(bingo[i][j] == num) {
//						bingo[i][j] = 0;				
//					}
//					sum += bingo[i][j];
//					System.out.print(bingo[i][j] + " ");
//					}	
//				System.out.println();
//				}
//			
//			if(sum == 0) {
//				flage = false;
//			}
//		}//		System.out.println("GAME OVER");
		
		
		
		
	}

}

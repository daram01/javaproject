

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
// �迭 : ������ Ÿ���� ������ ������ ���� �ϴ� ��
		
//		int a,b,c,d,e;
//		a = 10;
//		b = 20;
//		c = 30;
//		d = 40;
//		e = 50;
		
		
//		int[] arr; // �迭�� ���� 
//		arr = new int[5]; // �迭�� ����
		
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
		
//		arr2 = arr1; // �迭 ������ �ּҰ��̴�.
//		
//		System.out.println(arr1[0]);
//		System.out.println(arr2[0]);
//		
//		arr2[3] = 10;
//		
//		System.out.println(arr1[3]);
//		System.out.println(arr2[3]);
		
		
		// �迭�� Ȱ��
		// ����ó��
		// �ݺ���
		
		
		// ���� �۾�
//		int[] arr = new int[5];
//		
//		for(int i = 0;i < arr.length; i++) {
//			arr[i] = 1;
//		}
//		
//		// �б� �۾�
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
//		System.out.println("Ȧ�� : " + odd);
//		System.out.println("¦�� : " + even);
		
//		for(���� : �迭������) {
//			���๮
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
//		String[] str = {"���", "����", "����"};
//		
//		for(String s : str) {
//			System.out.println(s);
//		}
//		
//		int[] arr = new int[10];
//		
//		// ���� 1 ~ 100 ���̰� �߿� 10���� �迭 ������ �ʱ�ȭ �Ѵ�.
//		// �迭�� ���� ����Ѵ�.
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
		// ������ ����Ͽ�  0 ~ 9 ������ �ʱ�ȭ �Ѵ�.
		
//		������ 
//		0 - 2��
//		1 - 0��
//		3 - 1��
//		...
//		9 - 3��
		
//		for(int i = 0; i<arr.length;i++) {
//			int ran = (int)(Math.random() * 10);
//			arr[i] = ran; // ������� ������ �ʱ�ȭ
//		}
//		
//		for(int i = 0; i<arr.length;i++) {
//			System.out.print(arr[i] + ",");
//		}
		
//		int n0=0,n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0;
		
//		int[] cntArr = new int[10]; // �⺻��(��Ʈ�� �⺻���� 0)���� �ڵ� �ʱ�ȭ �Ѵ�.
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
		
		
		// �������� 

//		�迬��  �޴� 10��
//		ȫ�浿 �޴� 3��
//		����� �޴� 2��
//		
//	      String[] name = {"ȫ�浿","�����","�迬��"};
//	      int[] medal = {3,2,10};
//	      
//	      for(int i=0;i<medal.length;i++) {       
//	         for(int j=i+1;j<medal.length;j++) {        //�ּڰ����� ���ϱ� ���� �ϳ��� �� �ڿ��Ÿ� ���ϹǷ� i+1�̵ȴ�.
//	            if(medal[i]<medal[j]) {                //�ε�ȣ ���⸸ ���� ���ָ� �������� �������� ���� �����ϴ�.
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
//	         System.out.println(name[i] + " �޴� " + medal[i] +"�� "+ (i+1) + "�� �Դϴ�.");   //(i+1) ->�޴� ���� ���������� ������ �Ǿ��ְ�, ���ʴ�� i+1�� ������ش�.
//	            }		

//----------------------------------------------------------------------------		
		
//		�迭 - 1����
//		   - ������(2����) - ������(���� ũ�Ⱑ ����), ��������(���� ũ�Ⱑ �ٸ� ���-�� ������ ����)
		
//		int[][] score; // ����			
//		score = new int[5][3]; // ����
		
//		int[][] score = new int[5][3]; // ����� ������ ���ÿ� ��
		
//		int[][] score = {
//				{1,2,3}, // {} ->��
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
//		arr[0]; // �̷������� �ϳ��� �ε��� ��ȣ�� ���� ��쿣 ���� ��ġ�� ����
//		arr[1];
		
		
//		for(int i = 0; i<score.length; i++) { // ���� ũ��
//			for(int j = 0; j<score[i].length; j++) { // ���� ũ��
//				System.out.print(score[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//			System.out.println("==========");
//		// �ؿ��� ���� ������  for��
//		for(int[] i : score) { // score - ��ü ��
//			for(int j : i) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
//----------------------------------------------------------------------------
		
		// ũ�Ⱑ 10�� 2���� �迭 �����
		
		//int num = 1;
//		int[][] arr = new int[2][5];
//	
//		for(int i = 0; i < arr.length; i++) { // i = 0, 1
//			for(int j = 0; j <arr[i].length; j++) { // j = 0, 1, 2, 3, 4
//				arr[i][j] = (i*5) + j + 1; // num++�� ���� // 1,2,3,4,5
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
	
//		// (��������) 1���� 15���� ���ڸ� ���� �� ���� for������ ����ϱ�
//		//int num = 1;
//		int[][] arr = new int[5][3]; // 15ĭ¥�� 
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = (i*3) + j + 1; // num++;�� ������
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
		
		// (��������1) ����� 
		// *
		// **
		// ***
		// ****
		// *****
		
//		char[][] star = new char[5][5]; // 25ĭ
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
		
		// ����� �ؼ�
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���� ũ�⸦ �Է��ϼ��� : ");
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
//				{'*','*',' ',' ',' '}, 			// �� ���� ���·� *�� ������       ****
//				{'*','*',' ',' ',' '},			// 4�� 5��				 ****
//				{'*','*','*','*','*'},			// �� ���·� �����			 **
//				{'*','*','*','*','*'},			//						 **
//		};										//						 **
		
//		for(int i = 0; i < star.length; i++) {
//			for(int j = 0; j < star[i].length; j++) {
//					System.out.print(star[i][j]);
//			}
//			System.out.println();
//		}
		
//		char[][] result = new char[star[0].length][star.length]; // 5�� 4�� 
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
			 // ���� ���� ����
//		int[][] score = {
//				{10,10,10},
//				{20,20,20},
//				{30,30,30},
//				{40,40,40},
//				{50,50,50},
//		};
//		
//		
//		������
//		��ȣ   ����   ����  ����      ����      ���
//		 1  10  10  10   30  10.0
//		 2  20  20  20   60  20.0
//		 3  30  30  30   90  30.0
//		 4  40  40  40  120  40.0
//		 5  50  50  50  150  50.0
//		�հ�  150 150 150  450  30.0
//		
//		System.out.println("��ȣ   ����   ����   ����    ����    ���");
//		
//		int sum;
//		int korTot = 0;
//		int engTot = 0;
//		int mathTot = 0;
//		
//		for(int i = 0; i <score.length; i++) {
//
//			korTot += score[i][0]; // ������ �հ�����
//			engTot += score[i][1]; // ������ �հ�����
//			mathTot += score[i][2];   // ������ �հ�����
//			
//			sum = 0;
//			System.out.print(" " + (i + 1));
//			for(int j = 0; j<score[i].length; j++) {
//				sum += score[i][j];
//				System.out.print("  " + score[i][j] + "");
//			}
//			System.out.print("  " + sum); // ����
//			double avg = sum / (double)score[i].length; // ���
//			System.out.print("  " + avg); // ���
//			System.out.println();
//		}
//		int TotScore = korTot + engTot + mathTot;
//		System.out.println("�հ� " + " " + korTot+ " " + engTot+ " " + mathTot + " "+ TotScore);
		
//----------------------------------------------------------------------------	
		
		// 25ĭ¥�� 2���� �迭
		// �迭�� ���� 1 - 50 ������ ������ �� ���� 25���� ��� 
		// ���� �Է��ϰ� �迭�� ���� ���� ������ O�� �����Ѵ�.
		// �迭�� ��� ���� 0���� �ٲ�� ������ �����Ѵ�.
		
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
//			System.out.println("���ڸ� �Է��ϼ���.");
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


public class StudentTest {

	public static void main(String[] args) {
//		Student sd = new Student("seodan", 10, 3);
//		System.out.println(sd.name);
//		System.out.println(sd.age);
//		System.out.println(sd.grade);
//		
//		Student sd2 = new Student("yuri", 10, 3);
//		System.out.println(sd2.name);
//		System.out.println(sd2.age);
//		System.out.println(sd2.grade);		
//		
//		Student sd3 = new Student("moran", 10, 3);
//		System.out.println(sd3.name);
//		System.out.println(sd3.age);
//		System.out.println(sd3.grade);	
		
		// 국어점수 : 100
		// 영어점수 : 60
		// 수학점수 : 76
		// 실행결과 
		// 이름 : 홍길동 
		// 총점 : 236
		// 평균 : 소수점 둘째자리에서 반올림 78.7 
		
		Student sd = new Student("홍길동", 1, 1, 100, 60, 76);

		
		System.out.println("이름 : " + sd.name);
		System.out.println("총점 : " + sd.getTotal());
		System.out.println("평균 : " + sd.getAverage());

	}

}

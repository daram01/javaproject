
public class Student {
//	String name; //이름
//	int age; //나이
//	int grade; //학년
//	
//	Student(String name, int age, int grade){
//		this.name = name;
//		this.age = age;
//		this.grade = grade;
//	}
	
// ============================================
	
//	String name; // 학생 이름
//	int ban; // 반
//	int no; // 번호
//	int kor; // 국어점수
//	int eng; // 영어점수
//	int math; // 수학점수
	
	// 인스턴스변수
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	// 생성자
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	} 
	
	// 총점을 구하는 기능
	int getTotal() {
		return kor + eng + math;
	}
	
	// 평균을 구하는 기능
	double getAverage() {
		return (int)(getTotal() / 3.0 * 10 + 0.5) / 10.0;
	}
	
//	78.666667 * 10 // 786.666667
//	786.666667 + 0.5 // 787.166667
//	(int)787.166667 // 787
//	787 / 10.0 // 78.7
}


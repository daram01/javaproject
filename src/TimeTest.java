
public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Time t1,t2,t3; // 변수 선언
		Time[] time = new Time[3]; //참조형 변수로 배열을 만드는 것
		
		for(int i = 0; i<time.length; i++) {
			time[i] = new Time();
		}
		
		//time[0] = new Time();
		time[0].hour = 10;
		time[0].minute = 29;
		time[0].second = 33;
		
		//time[1] = new Time();
		time[1].hour = 3;
		time[1].minute = 45;
		time[1].second = 11;
		
		//time[2] = new Time();
		time[2].hour = 5;
		time[2].minute = 15;
		time[2].second = 53;
		
		System.out.println(time[0].hour + "시" + time[0].minute + "분" + time[0].second + "초");
		System.out.println(time[1].hour + "시" + time[1].minute + "분" + time[1].second + "초");
		System.out.println(time[2].hour + "시" + time[2].minute + "분" + time[2].second + "초");
		
		// 향상된 for문 활용
		for(Time t: time) {
			System.out.println(t.hour + "시 " + t.minute + "분 " + t.second + "초");
		}
		
		
		

	}

}

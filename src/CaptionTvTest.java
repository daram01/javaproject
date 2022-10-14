
public class CaptionTvTest {

	public static void main(String[] args) {
//		CaptionTv ctv = new CaptionTv(); //CaptionTv의 객체 생성
//		ctv.channel = 10;
//		System.out.println(ctv.channel); //10
//		
//		ctv.channelDown();
//		System.out.println(ctv.channel);//9
//		// Tv라는 부모의 데이터를 그대로 가져다 쓸 수 있음
//		
//		ctv.caption = true;
//		ctv.displayCaption("오늘의 날씨를 알려 드립니다.");	
//		// CaptionTv에서만 가지고 있는 고유기능 사용
//		
//		i3dTv idd = new i3dTv();
//		idd.i3d = true;
//		idd.i3dPower();
//		
//		internetTv itn = new internetTv();
//		itn.internetTv = true;
//		itn.internetpower();
		
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		System.out.println(ctv.channel);
		
		ctv.channelDown();
		System.out.println(ctv.channel);
		
		ctv.caption = true;
		System.out.println("오늘의 날씨를 알려 드립니다.");
		
		i3dTv idd = new i3dTv();
		idd.i3d = true;
		idd.i3dPower();
		
		
	}

}

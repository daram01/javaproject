
public class CaptionTvTest {

	public static void main(String[] args) {
//		CaptionTv ctv = new CaptionTv(); //CaptionTv�� ��ü ����
//		ctv.channel = 10;
//		System.out.println(ctv.channel); //10
//		
//		ctv.channelDown();
//		System.out.println(ctv.channel);//9
//		// Tv��� �θ��� �����͸� �״�� ������ �� �� ����
//		
//		ctv.caption = true;
//		ctv.displayCaption("������ ������ �˷� �帳�ϴ�.");	
//		// CaptionTv������ ������ �ִ� ������� ���
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
		System.out.println("������ ������ �˷� �帳�ϴ�.");
		
		i3dTv idd = new i3dTv();
		idd.i3d = true;
		idd.i3dPower();
		
		
	}

}


public class CaptionTv extends Tv{
	//Tv��� Ŭ�����κ��� ���� 7���� �޼ҵ� 6���� ��ӹ޴´�.
	boolean caption; // false�� �⺻��.
	
	void displayCaption(String test) { //�ڸ����
		if(caption) { //true
			System.out.println(test);
		}
	}
}


public class TvTest {
	
	public static void main(String[] args) {
		
//		int sum; // ���� ����
//		sum += 10; // ���� ���� ���� ��� ���� �߻� ( ���� �ʱ�ȭ���� �ʾұ� ���� )
		
		// TODO Auto-generated method stub
		// System.out.println(new Tv()); // ������ ���ÿ� �޸𸮿� �Ҵ�Ǿ�����, �޸𸮵��� �ּҰ� ��
		// Tv@15db9742  ������ Tv��ü�� ù��° ����� �ּҰ�
		
//		new Tv().power = true;
//		new Tv().channel = 10;
//		
//		���� �������δ� �������� ����.
//		System.out.println(new Tv()); Tv@15db9742
//		System.out.println(new Tv()); Tv@6d06d69c
//		��ü�� ���� �Ҵ� �Ǳ� �����̴�.
		
		Tv t = new Tv(); // Tv t -> �������� == �ּҰ� 
		//System.out.println(t);
		t.power = true;
		t.channel = 10;
		System.out.println(t.channel); // 10
		t.channelDown();
		System.out.println(t.channel); // 9
		
		Tv t2 = new Tv();
		t2.channel = 20;
		System.out.println(t2.channel); // 20
		t2.channelDown();
		System.out.println(t.channel); // 9
		System.out.println(t2.channel); // 19
		
		t2 = t; // t2�� t�� ����� ���� (ġȯ) - �� ���� ������ Ÿ���� ������ ��츸 ����
		System.out.println(t.channel); // 9
		System.out.println(t2.channel); // 9
		t.channelDown();
		System.out.println(t.channel); // 8
		System.out.println(t2.channel); // 8
		
		
	}

}

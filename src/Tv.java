
public class Tv { //�θ�Ŭ����
	
//	���
//	�θ�Ŭ���� �� Ư¡ 
//	1. ���� �ڽ�Ŭ������ ���´�.
//	2. ���� ��Ӹ� �����ϴ�.(�ڽ� ���忡�� ���� �θ� ��� �ϴ� �� �Ұ�����)
	
	
//	�Ӽ�
//	ũ��, ���� ��ư, ä��, ����, ����, ���ͳ� �� ... ��, �����⵵, ������, 
//	
//	���(����)
//	���� ON/OFF, ä�� UP/DOWN, ���� UP/DOWN �� ...
	
	// ��� ����
	// ������ �����ϴ� ���� �ڵ����� �ʱ�ȭ�� ��
	boolean power; // ������ư false
	int channel; // ä�� 0
	int volume; // ���� 0
	String color; // ���� null
	String model; // �� null
	int year; // �����⵵ 0
	String company; //������ null
	
	// �޼���
	void Power() {		// ���� ON/OFF 
		power = !power; // ! - true�� false, false�� true
	}
	void channelUp() {		// ä�� UP 
		channel++;
	}
	void channelDown() {		// ä�� DOWN 
		channel--;
	}
	void volumeUp() {		// ���� UP
		volume++;
	}
	void volumeDown() {		// ���� DOWN
		volume--;
	}
	
	void showInfo() {		// ��ǰ�� �Ұ��ϴ� ���
		System.out.println(model);
		System.out.println(year);
		System.out.println(company);
	}
}

package edu;

public class TVTest {
	public static void main(String[] args) {
//		SamsungTV tv = new SamsungTV();
//		tv.turnOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.turnOff();
		// ���� ������ ���ܼ� �Ｚ tv���� lg tv�� �ٲٷ��� �ڵ带 ���� ������.
		// ���� �ٽ� �ۼ��ؾ� �Ѵ�.
		//LgTV tv = new LgTV();
		SamsungTV tv = new SamsungTV();

		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
		// �̷��� �� �ٲٴ� ������ �ʹ� ���� �ɸ��� ������, ���� ������ �ؼ� �ϳ��� �������̽��� �����.
	}
}

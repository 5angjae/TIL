package edu;

public class SamsungTV implements TV {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Samsung TV ������ �Ѵ�.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Samsung TV ������ ����.");
	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("Samsung TV �Ҹ��� ���̴�.");
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("Samsung TV �Ҹ��� ���ߴ�.");
	}
	
//	void turnOn() {
//		System.out.println("Samsung TV ������ �Ѵ�.");
//	}
//	
//	void turnOff() {
//		System.out.println("Samsung TV ������ ����.");
//	}
//	
//	void volumeUp() {
//		System.out.println("Samsung TV �Ҹ��� ���̴�.");
//	}
//	
//	void volumeDown() {
//		System.out.println("Samsung TV �Ҹ��� ���ߴ�.");
//	}
}

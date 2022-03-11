package edu;

public class SamsungTV implements TV {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Samsung TV 전원을 켜다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Samsung TV 전원을 끄다.");
	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("Samsung TV 소리를 높이다.");
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("Samsung TV 소리를 낮추다.");
	}
	
//	void turnOn() {
//		System.out.println("Samsung TV 전원을 켜다.");
//	}
//	
//	void turnOff() {
//		System.out.println("Samsung TV 전원을 끄다.");
//	}
//	
//	void volumeUp() {
//		System.out.println("Samsung TV 소리를 높이다.");
//	}
//	
//	void volumeDown() {
//		System.out.println("Samsung TV 소리를 낮추다.");
//	}
}

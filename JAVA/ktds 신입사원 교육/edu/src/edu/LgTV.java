package edu;

public class LgTV implements TV {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("LG TV 전원을 켜다.");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("LG TV 전원을 끄다.");

	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("LG TV 소리를 높이다.");

	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("LG TV 소리를 낮추다.");

	}
	
//	void powerOn() {
//		System.out.println("LG TV 전원을 켜다.");
//	}
//	
//	void powerOff() {
//		System.out.println("LG TV 전원을 끄다.");
//	}
//	
//	void soundUp() {
//		System.out.println("LG TV 소리를 높이다.");
//	}
//	
//	void soundDown() {
//		System.out.println("LG TV 소리를 낮추다.");
//	}
}

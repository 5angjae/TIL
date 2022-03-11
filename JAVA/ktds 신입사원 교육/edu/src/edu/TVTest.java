package edu;

public class TVTest {
	public static void main(String[] args) {
//		SamsungTV tv = new SamsungTV();
//		tv.turnOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.turnOff();
		// 변경 사항이 생겨서 삼성 tv에서 lg tv로 바꾸려면 코드를 전부 못쓴다.
		// 전부 다시 작성해야 한다.
		//LgTV tv = new LgTV();
		SamsungTV tv = new SamsungTV();

		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
		// 이렇게 다 바꾸는 과정이 너무 오래 걸리기 때문에, 서로 협약을 해서 하나의 인터페이스를 만든다.
	}
}

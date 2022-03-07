package edu;

public class CellPhone {
	private String model;
	private double battery;
	
	public CellPhone(String model) {
	}
	
	public void call(int time) {
		if(time >= 0) {
			this.battery -= time * 0.5;
			if(this.battery <0)
				this.battery =0;
			System.out.println("통화 시간 : "+ time+"분");
		}
		else
			System.out.println("통화시간입력오류");
	}
	
	public void charge(int time) {
		if(time >= 0) {
			this.battery += time * 3;
			if(this.battery >100)
				this.battery = 100;
			System.out.println("충전 시간 : "+ time+"분");
		}
		else
			System.out.println("충전시간입력오류");
	}
	
	public void printBattery() {
		System.out.println("남은 배터리 양 : "+ this.battery);
	}
	public Boolean isEqual(CellPhone c) {
		return this.model == c.model ? true:false;
	}
}

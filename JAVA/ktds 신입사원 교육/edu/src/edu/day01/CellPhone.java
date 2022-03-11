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
			System.out.println("��ȭ �ð� : "+ time+"��");
		}
		else
			System.out.println("��ȭ�ð��Է¿���");
	}
	
	public void charge(int time) {
		if(time >= 0) {
			this.battery += time * 3;
			if(this.battery >100)
				this.battery = 100;
			System.out.println("���� �ð� : "+ time+"��");
		}
		else
			System.out.println("�����ð��Է¿���");
	}
	
	public void printBattery() {
		System.out.println("���� ���͸� �� : "+ this.battery);
	}
	public Boolean isEqual(CellPhone c) {
		return this.model == c.model ? true:false;
	}
}

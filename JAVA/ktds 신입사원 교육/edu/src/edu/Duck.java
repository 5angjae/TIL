package edu;

public class Duck {
	private String name;
	private int legs;
	private int length;
	
	public Duck() {
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void fly() {
		System.out.println("����("+this.name+")�� ���� �ʽ��ϴ�.");
	}
	
	public void sing() {
		System.out.println("����("+this.name+")�� �Ҹ����� ��ϴ�.");
	}
	
	public String toString() {
		return "������ �̸��� "+this.name+" �Դϴ�.";
	}
}

package edu;

public class Sparrow {
	private String name;
	private int legs;
	private int length;
	
	public Sparrow() {
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void fly() {
		System.out.println("����("+this.name+")�� ���ƴٴմϴ�.");
	}
	
	public void sing() {
		System.out.println("����("+this.name+")�� �Ҹ����� ��ϴ�.");
	}
	
	public String toString() {
		return "������ �̸��� "+this.name+" �Դϴ�.";
	}
}

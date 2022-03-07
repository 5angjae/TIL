package edu;
public class FlowerTest {
	public static void main(String[] args) {
		Flower flower = new Flower("���", "������", false);
		printInfo(flower);

		flower = new Flower("�عٶ��", "�����");
		printInfo(flower);

		flower = new Flower("�з��̲�");
		printInfo(flower);
	}

	static public void printInfo(Flower flower) {
		System.out.println("�̸� : " + flower.getName());
		System.out.println("���� : " + flower.getColor());
		System.out.println("�߻� : " + flower.isWild() + "\n");
	}
}

package homework;

import java.util.HashMap;
import java.util.Scanner;

public class ContactTest {

	public static void main(String[] args) {
		HashMap<String, String[]> phone = new HashMap<String, String[]>();
		System.out.println("============= ����ó ���α׷�===================");
		Scanner keyboard = new Scanner(System.in);
		int idx = 0;
		while (true) {
			System.out.println("�޴��� ������ �ּ���");
			System.out.println("1.���   2.�˻�  3.����  4.����   9.����");
			System.out.print("�޴�����:");
			int menu = keyboard.nextInt();

			if (menu == 1) {
				System.out.println("===>����ó ���");
				System.out.print("��   ��:");
				String name = keyboard.next();
				System.out.print("��ȭ��ȣ:");
				String tel = keyboard.next();
				
				// ����ó�� ����ϴ� �ڵ带 �����ϼ���
				
				String idx_s = Integer.toString(idx);
				String[] phone_num = {name, tel};
				phone.put(idx_s, phone_num);
				idx += 1;
				
			} else if (menu == 2) {
				System.out.println("===>����ó �˻�");
				// ����ó�� �˻��ϴ� �ڵ带 �����ϼ���
				int cnt2 = 0;
				System.out.print("�˻��� �̸��� �Է��ϼ���.");
				String find_name = keyboard.next();
				for (int i = 0; i < phone.size(); i++) {
					String[] temp = phone.get(Integer.toString(i));
					if(temp[0].equals(find_name)) {
						cnt2 += 1;
						System.out.println(temp[0] + " : " + temp[1]);
					}
				}
				if (cnt2 == 0) {
					System.out.println("�ش�Ǵ� �̸��� ��ȭ��ȣ�� �����ϴ�.");
				}
			} else if (menu == 3) {
				System.out.println("===>����ó ����");
				// ����ó�� �����ϴ� �ڵ带 �����ϼ���
				System.out.print("������ �̸��� �Է��ϼ���.");
				String find_name = keyboard.next();
				System.out.println("�Ʒ� ��Ͽ��� ������ ����ó�� �ε����� �Է����ּ���.");
				int cnt3 = 0;
				for (int i = 0; i < phone.size(); i++) {
					String[] temp = phone.get(Integer.toString(i));
					if(temp[0].equals(find_name)) {
						cnt3 += 1;
						System.out.println("�ε��� : " + i + " / �̸� :" + temp[0] + " / ��ȭ��ȣ : " + temp[1]);
					}
				}
				if(cnt3 == 0) {
					System.out.println("�ش�Ǵ� �̸��� ��ȭ��ȣ�� �����ϴ�.");
				} else {
					System.out.print("�ε��� �Է� : ");
					int index = keyboard.nextInt();
					String index_s = Integer.toString(index);
					System.out.print("������ ��ȭ��ȣ �Է� : ");
					String new_phone = keyboard.next();
					String[] new_phone_list = {phone.get(index_s)[0], new_phone};
					phone.replace(index_s, new_phone_list);
				}
				
				
			} else if (menu == 4) {
				System.out.println("===>����ó ����");
				// ����ó�� �����ϴ� �ڵ带 �����ϼ���
				System.out.print("������ �̸��� �Է��ϼ���.");
				String find_name = keyboard.next();
				System.out.println("�Ʒ� ��Ͽ��� ������ ����ó�� �ε����� �Է����ּ���.");
				int cnt4 = 0;
				for (int i = 0; i < phone.size(); i++) {
					String[] temp = phone.get(Integer.toString(i));
					if(temp[0].equals(find_name)) {
						cnt4 += 1;
						System.out.println("�ε��� : " + i + " / �̸� :" + temp[0] + " / ��ȭ��ȣ : " + temp[1]);
					}
				}
				if(cnt4 == 0) {
					System.out.println("�ش�Ǵ� �̸��� ��ȭ��ȣ�� �����ϴ�.");
				} else {
					System.out.print("�ε��� �Է� : ");
					int index = keyboard.nextInt();
					String index_s = Integer.toString(index);
					String[] delete_phone = {"�����ȹ�ȣ", "0"};
					phone.replace(index_s, delete_phone);
					// ��� ������� ���ڷ� key���� �ο��؇J���µ� ������ �����, ���� for������ ������ �� �� ���Ƽ� ����°� �ƴ϶� �����͸� �ٲٱ����
				}
			} else if (menu == 9) {
				System.out.println("���α׷��� �����մϴ�....");
				System.exit(0);
			} else {
				System.out.println("�߸��� �޴��Դϴ�! �޴��� �ٽ� ������ �ּ���");
			}
		}
	}

}

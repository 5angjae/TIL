package edu2;

import java.util.HashMap;

public class hashMapExample {
	public static void main(String[] args) {
		HashMap<String, Object> dic = new HashMap<String,Object>();
		
		dic.put("����", "31��");
		dic.put("�̸�", "�����");
		String[] friends = {"����", "����", "����"};
		dic.put("ģ��", friends);

		System.out.println(dic);
		
	}
	
}

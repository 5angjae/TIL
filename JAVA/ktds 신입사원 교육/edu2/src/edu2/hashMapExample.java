package edu2;

import java.util.HashMap;

public class hashMapExample {
	public static void main(String[] args) {
		HashMap<String, Object> dic = new HashMap<String,Object>();
		
		dic.put("나이", "31살");
		dic.put("이름", "김상재");
		String[] friends = {"성원", "희윤", "정택"};
		dic.put("친구", friends);

		System.out.println(dic);
		
	}
	
}

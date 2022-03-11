package edu2;

import java.util.StringTokenizer;

public class Exam04 {
	public static void main(String[] args) {
		String s = "aaa    bbb    ccc    ddd";
		String[] r = s.split(" ");
		System.out.println(r.length);
//		for (int i = 0; i < r.length; i++) {
//			System.out.println(r[i]);
//		}
		
		StringTokenizer st = new StringTokenizer(s);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		// nextElement{) -> Object로 리턴
		// nextToken() -> String 으로 리턴
		// 
	}
}

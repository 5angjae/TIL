package edu;

import java.util.HashSet;
import java.util.Random;

public class Exam05 {
	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<>();
		Random r = new Random();
		for(int i = 0; i < 6; i++) {
			lotto.add(r.nextInt(45) + 1);
		}
		
	}	
}

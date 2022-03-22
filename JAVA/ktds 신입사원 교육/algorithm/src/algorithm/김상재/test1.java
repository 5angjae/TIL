package algorithm;

import java.io.BufferedReader;
import java.io.FileReader;

public class test1 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("input1.txt"));
			int T = 10;
			
			for(int tc=1; tc<=T;tc++) {
				int[] arr = new int[101];
				String point[] = br.readLine().split(" ");
				for(String p:point) {
					int p_idx = Integer.parseInt(p);
					arr[p_idx]++;
				}
				int max = 0;
				int index = 0;
				for(int i=0;i<arr.length;i++) {
					if(arr[i]>=max) {
						max = arr[i];
						index = i;
					}
				}
				System.out.println("#" + tc + " " + index);
			}
		} catch (Exception e){
		}
	}
}

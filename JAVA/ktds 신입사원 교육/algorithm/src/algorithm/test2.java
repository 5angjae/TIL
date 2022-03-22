package algorithm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class test2 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("input2.txt"));
			int T = 10;
			
			for(int tc=1; tc<=T;tc++) {
				String input[] = br.readLine().split(" ");
				int N = Integer.parseInt(input[0]);
				String[] input_pw = input[1].split("");
				
				ArrayList<String> base_pw = new ArrayList<>();
				
				for(String pw: input_pw) {
					base_pw.add(pw);
				}
				int cnt = 0;
				
				while(true){
					if(cnt == base_pw.size() - 1) {
						break;
					}
					if(base_pw.get(cnt).equals(base_pw.get(cnt+1))) {
						base_pw.remove(cnt);
						base_pw.remove(cnt);
						cnt = 0;
					} else
						cnt++;
				}

				System.out.print("#" + tc + " ");
				for(String p: base_pw) {
					System.out.print(p);
				}
				System.out.println();
			}
		} catch (Exception e){
		}
	}
}

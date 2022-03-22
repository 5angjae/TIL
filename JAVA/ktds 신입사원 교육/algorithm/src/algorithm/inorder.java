package algorithm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class inorder {
	static char[] tree;
	static int n;
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("input.txt"));
			
			int T = 10;
			
			for(int tc=1; tc<=T; tc++) {
				n = Integer.parseInt(br.readLine());
				tree = new char[n+1];
				
				for (int i=1; i<=n; i++) {
					StringTokenizer st = new StringTokenizer(br.readLine());
					st.nextToken();
					tree[i] = st.nextToken().charAt(0);
				}
				
				System.out.print("#"+ tc + " ");
				inOrder(1);
				System.out.println();
			}
			
		} catch (Exception e) {
		}
	}
	static void inOrder(int i) {
		if(i > n) return;
		inOrder(2*i);
		System.out.print(tree[i]);
		inOrder(2*i + 1);
	}
}

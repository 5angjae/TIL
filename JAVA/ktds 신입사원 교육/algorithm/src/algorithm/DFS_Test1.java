package algorithm;

import java.util.Stack;

public class DFS_Test1 {
	public static void main(String[] args) {
		int INPUT_NODE_SIZE = 7;
		int[] visited = new int[7];
		
		int[][] input = {
				{ 0, 1, 1, 0, 0, 0, 0 },
				{ 1, 0, 0, 1, 1, 0, 0 },
				{ 1, 0, 0, 0, 0, 0, 1 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 1, 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 1, 1, 0, 1 },
				{ 0, 0, 1, 0, 0, 1, 0 }
			};
		
		// DFS 알고리즘을 사용하여 코드를 구현하세요
		Stack<Integer> stack = new Stack<>();
		
		stack.push(0);
		
		while(!stack.isEmpty()) {
			int n = stack.pop();
			if(visited[n] != 0) {
				continue;
			}
			else {
				visited[n] = 1;
				System.out.print(n+1 + " ");
				for(int i = 6; i>-1; i--) {
					if(input[n][i] == 1) {
						stack.push(i);
					}
				}
			}
		}
		System.out.println();
	}
}

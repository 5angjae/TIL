package algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_Test {

	
	public static void main(String[] args) {
		int input[]={1,2,1,3,2,4,2,5,4,6,5,6,6,7,3,7};
		int n = 8;
		int a[][]= new int[n][n];
		int visited[] = new int[n];
		
	    for(int i=0;i<16;i=i+2)
	    {
	        a[input[i]][input[i+1]] = 1;
	        a[input[i+1]][input[i]] = 1;
	    }

	    bfs(1,a,visited);
	}
	
	public static void bfs(int i, int [][] a, int [] visited) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.offer(i);
		visited[i] = 1;
		
		while(!queue.isEmpty()) {
			int point = queue.poll();
			System.out.print(point+" ");
			
			for(int j=0;j<a[point].length;j++) {
				if(a[point][j]==1 && visited[j]==0) {
					visited[j] = 1;
					queue.offer(j);
				}
			}
		}
	}

}

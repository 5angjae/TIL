package algorithm;

import java.util.Stack;

class DfsGraph {
	private int s;
	private int[][] graph;
	private int[] visited;
	private int size;
	
	public DfsGraph(int s, int[][] graph, int[] visited, int size) {
		this.graph = graph;
		this.s = s;
		this.visited = visited;
		this.size = size;
	}
	
	public void dfs(int s) {
		this.visited[s] = 1;
		System.out.print(s + " ");
		for(int i=1;i<=size;i++) {
			if(graph[s][i] == 1 && visited[i] == 0) {
				dfs(i);
			}
		}
	}
}
public class DFS_Test {
	
	public static void main(String[] args) {
		int INPUT_NODE_SIZE = 7;
		
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
		// DFS 경로 출력. 시작 정점 = 1
		int start_node = 1;
		int[] visited = {0, 0, 0, 0, 0, 0, 0};
		visited[start_node] = 1;
		
		DfsGraph dfsGraph = new DfsGraph(start_node, input, visited, INPUT_NODE_SIZE);
		
		dfsGraph.dfs(start_node);

		
	}
}

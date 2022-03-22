import java.util.Stack;

public class Maze_Test {
	
	public static void main(String[] args) {
		int map[][] = 
			{ { 0, 0, 1, 1, 1, 1, 1, 1 }, 
				{ 1, 0, 0, 0, 0, 0, 0, 1 }, 
				{ 1, 1, 1, 0, 1, 1, 1, 1 },
				{ 1, 1, 1, 0, 1, 1, 1, 1 },
				{ 1, 0, 0, 0, 0, 0, 0, 1 }, 
				{ 1, 0, 1, 1, 1, 1, 1, 1 },
				{ 1, 0, 0, 0, 0, 0, 0, 0 },
	            { 1, 1, 1, 1, 1, 1, 1, 0 } };
		
		boolean found = false;
		Stack<int[]> stack = new Stack<int[]>();
		boolean[][] vi = new boolean[map.length][map[0].length];
		int[] dy = {-1,0,1,0};
		int[] dx = {0,-1,0,1};
		int[] start = {0,0};
		stack.push(start);
		while(!stack.isEmpty()){
			int[] now = stack.pop();
			if(vi[now[0]][now[1]]) continue;
			System.out.println(now[0]+ "," +now[1]);
			if(now[0] == map.length-1 && now[1] == map[map.length-1].length-1) {
				found = true;
				break;
			}
			vi[now[0]][now[1]] = true;
			for(int d = 0; d < 4 ; d++) {
				int ny = dy[d] + now[0];
				int nx = dx[d] + now[1];
				
				if(ny < map.length && nx < map[0].length && ny > -1 && nx > -1 && !vi[ny][nx] && map[ny][nx] == 0) {
					int[] next = {ny, nx};
					stack.push(next);
				}
			}
		}
		if(found) System.out.println("출구 찾음");
	}
}

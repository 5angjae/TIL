package algorithm;

import java.util.ArrayList;
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
		
		int start_x = 0;
		int start_y = 0;
		int end_x = 7;
		int end_y = 7;
		
		Stack<int[]> stack = new Stack<>();
		int[] start = {start_x, start_y};
		stack.push(start);
		
		int map_len = map.length;

		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		
		ArrayList<int[]> result = new ArrayList<>();
		while(!stack.isEmpty()){
			int[] temp = stack.peek();
			
			int temp_x = temp[0];
			int temp_y = temp[1];
			map[temp_y][temp_x] = 1;
			
			if(temp_x == end_x && temp_y == end_y) {
				result.add(temp);
				break;
			}
			int possible = 0;
			for(int i=0; i < 4; i++) {
				int nx = temp_x + dx[i];
				int ny = temp_y + dy[i];
				int[] n_position = {nx, ny};
				if(nx>=0 && nx<map_len && ny>=0 && ny<map_len && map[ny][nx] == 0) {
					result.add(temp);
					stack.push(n_position);
				}
				else {
					possible += 1;
				}
			}
			if(possible == 4) {
				stack.pop();
				result.remove(result.size()-1);
			}
			
		}
		for(int[] x: result) {
			System.out.println(x[0] + ":" + x[1]);
		}
	}

	
}

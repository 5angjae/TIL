package algorithm;
import java.util.*;

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int Max = 0;
			int[] input = new int[N];
			int[][] arr = new int[N][N];
			int[][] result = new int[N][N];
			for(int i=0;i<N;i++) input[i] = sc.nextInt();
			for(int i=0;i<N;i++) {
				for(int j=0;j<input[i];j++) {
					arr[i][j] = 1;
				}
			}
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(arr[i][j] == 1) {
						int count = 0;
						for(int k=i+1; k<N; k++) {
							if(arr[k][j] == 0) count++;
						}
						result[i][j] = count;
						Max = Math.max(count, Max);
					}
				}
			}
			System.out.println("높이만큼 입력");
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					System.out.println(arr[i][j]);
				}
				System.out.println();
			}
			
		}
	}
}

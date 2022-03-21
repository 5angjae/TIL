package algorithm;

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

	    //Queue를 사용하여 BFS 알고리즘을 구현하세요
	}

}

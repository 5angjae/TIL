package algorithm;

public class Exam02 {
	public static void main(String[] args) {
		int arr [] = new int[10];
		String number = "054060";
		
		for(int i=0; i<number.length();i++) {
			int temp = number.charAt(i) - '0';
			arr[temp]++;
		}
		int cnt = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=3) {
				cnt++;
				arr[i]-=3;
			}
			if(range(i,arr)) {
				if(arr[i-1]>0 && arr[i]>0 && arr[i+1]>0) {
					cnt++;
					arr[i-1] -=1;
					arr[i] -=1;
					arr[i+1] -=1;
				}
			}
		}
		System.out.println(cnt==2? "this is babygin": "this is not babygin");
	}
	
	public static boolean range(int i, int arr[]) {
		return i-1>=0 && i+1<arr.length;
	}
}

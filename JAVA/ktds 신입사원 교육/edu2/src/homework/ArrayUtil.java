package homework;

public class ArrayUtil {
	public static void main(String[] args) {
		char[] s = {'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm'}; 
		System.out.println(reverseString(s, 0, 3));
		System.out.println(reverseString(s, 4, 7));
		System.out.println(reverseString(s, 8, 10));
		System.out.println(reverseString(s, 0, 10));
	}
	
	public static char[] reverseString(char[] s, int start, int end) {
		
		//reverseString 메소드 구현
		char[] reverse = new char[s.length];
		char[] result = new char[s.length];
		
		for (int i = start; i <= end; i++) {
			reverse[start+end-i] = s[i];
		}
		for (int i = 0; i < result.length; i++) {
			if(i>=start && i<=end) {
				result[i] = reverse[i];
			}else {
				result[i] = s[i];
			}
		}
		return result;
		
	}
}

package homework;

public class StringUtil {
	
	public static void main(String[] args) {
		
		String[] arr = {"java program","array","java program area","append"};
        String result = replaceString(arr);
        System.out.println("����� ���ڿ� : "+result);
         
	}
	
	
	/*  �̰��� replaceString �޼ҵ带 �ۼ��Ͻʽÿ�. */
	public static String replaceString(String[] arr) {
		int max_a = 0;
		String max_str = "";
		for (int i = 0; i < arr.length; i++) {
			int cnt_a = countChar(arr[i],'a');
			if (max_a < cnt_a) {
				max_str = arr[i];
				max_a = cnt_a;
			}
		}
		String new_str = "";
		
		for (int i = 0; i < max_str.length(); i++) {
			char ch = max_str.charAt(i);
			if(ch=='a') {
				new_str += 'A';
			}else{
				new_str += ch;
			}
		}
		
		return new_str;
	}

	public static int countChar(String str, char c) {
		// Method�� �ϼ��ϼ���...		
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == c) {
				cnt += 1;
			}
		}
		return cnt;
	}
	
	
}

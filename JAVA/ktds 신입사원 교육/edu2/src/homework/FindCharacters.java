package homework;

public class FindCharacters {

	
	public static void main(String[] args) {
		FindCharacters fc=new FindCharacters();
		int count=fc.countChar("Boys, be ambitious", 'b');
		System.out.println(count);

	}
	public int countChar(String str, char c) {
		// Method를 완성하세요...		
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

package homework;

public class FindNumbers {
	public static void main(String[] args) {
		FindNumbers fn=new FindNumbers();
		System.out.println(fn.countNumber(228754462, 2));//3을 리턴
		System.out.println(fn.countNumber(228754462, 4));//2를 리턴
	}
	public int countNumber(long number, int i) {
		String num = Long.toString(number);
		char ii = (char)(i+'0');
		int cnt = 0;
		for (int j = 0; j < num.length(); j++) {
			char ch = num.charAt(j);
			if(ch == ii) {
				cnt += 1;
			}
		}
		return cnt;
	}
}

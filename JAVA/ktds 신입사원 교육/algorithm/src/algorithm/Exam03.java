package algorithm;
import java.util.Stack;

public class Exam03 {

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<>();
		String s = "{([{<>}])}>";
		int i;
		for(i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			boolean isIncorrect = false;
			
			switch(c) {
			case '(': case '{': case'[': case '<':
				stack.push(c);
				break;
				
			case ')':
				if(stack.empty() || (c=stack.pop())!= '(') {
					isIncorrect = true;
				}
				break;
				
			case '}':
				if(stack.empty() || (c=stack.pop())!= '{') {
					isIncorrect = true;
				}
				break;
				
			case ']':
				if(stack.empty() || (c=stack.pop())!= '[') {
					isIncorrect = true;
				}
				break;
				
			case '>':
				if(stack.empty() || (c=stack.pop())!= '<') {
					isIncorrect = true;
				}
				break;
			}
			
			if(isIncorrect) {
				break;
			}
		}
		
		if(stack.empty() && i == s.length()) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
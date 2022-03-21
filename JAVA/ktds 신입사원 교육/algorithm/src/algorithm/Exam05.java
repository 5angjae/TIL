package algorithm;

import java.util.Stack;

public class Exam05 {
	public static int getPriority(char ch) {
		switch(ch) {
		case '*' :
		case '/' :
			return 2;
		case '+' :
		case '-' :
			return 1;
		default :
			return 0;
		}
	}

	public static void main(String[] args) {
	    String input = "(6+5*(2-8)/2)";
	    Stack<Character> stack = new Stack<>();
	    String answer = "";
	    
	    for(int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			int priority = getPriority(c);
			switch(c) {
			case '+': case '-': case '*': case '/':
				while(!stack.isEmpty() && getPriority(stack.peek()) >= priority) {
					answer += stack.pop();
				}
				stack.push(c);
				break;
			case '(':
				stack.push(c);
				break;
			case ')':
				while(!stack.isEmpty() && stack.peek() != '(') {
					answer += stack.pop();
				}
				stack.pop();
				break;
			default:
				answer += c;
			}
	    }
	    
	    while(!stack.isEmpty()) {
	    	answer += stack.pop();
	    }
	    System.out.println(answer);
	    
	    
	    Stack<Integer> stack_num = new Stack<Integer>();
	    
	    for(int i=0; i<answer.length();i++) {
	    	int num1;
	    	int num2;
	    	char c = answer.charAt(i);
	    	switch(c) {
	    	case '*':
	    		num1 = stack_num.pop();
	    		num2 = stack_num.pop();
	    		stack_num.push(num1 * num2);
	    		break;
	    	case '/':
	    		num1 = stack_num.pop();
	    		num2 = stack_num.pop();
	    		stack_num.push(num2/num1);
	    		break;
	    	case '+':
	    		num1 = stack_num.pop();
	    		num2 = stack_num.pop();
	    		stack_num.push(num2+num1);
	    		break;
	    	case '-':
	    		num1 = stack_num.pop();
	    		num2 = stack_num.pop();
	    		stack_num.push(num2-num1);
	    		break;
	    	default:
	    		stack_num.push(Integer.valueOf(c));
	    		break;
	    	}
	    }
	    System.out.println(stack_num.pop());
	}
}

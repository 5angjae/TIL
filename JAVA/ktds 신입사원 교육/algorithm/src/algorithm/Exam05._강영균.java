package test;

import java.util.Stack;

public class Exam05 {

	public static void main(String[] args) {
		String input = "( 6 + 5 * ( 2 - 8 ) / 2 )";

		String[] token = input.split(" ");
		Stack<String> stack = new Stack<String>();
		String answer_s = "";

		for (int i = 0; i < token.length; i++) {
			switch (token[i]) {
			case "(":
				stack.add(token[i]);
				break;
			case ")":
				while (!stack.peek().equals("(")) {
					answer_s = answer_s + " " + stack.pop();
				}
				stack.pop();
				break;
			case "+":
			case "-":
				while (stack.size() != 0 && !stack.peek().equals("(")) {
					answer_s = answer_s + " " + stack.pop();
				}
				stack.add(token[i]);
				break;
			case "*":
			case "/":
				stack.add(token[i]);
				break;
			default:
				if (answer_s.equals(""))
					answer_s = token[i];
				else
					answer_s = answer_s + " " + token[i];
				break;
			}
		}
		System.out.println("후위 표기법" + answer_s);

		Stack<Integer> stack_num = new Stack<Integer>();
		token = answer_s.split(" ");

		for (int i = 0; i < token.length; i++) {
			int num1;
			int num2;
			switch (token[i]) {
			case "*":
				num1 = stack_num.pop();
				num2 = stack_num.pop();
				stack_num.add(num2 * num1);
				break;
			case "/":
				num1 = stack_num.pop();
				num2 = stack_num.pop();
				stack_num.add(num2 / num1);
				break;
			case "+":
				num1 = stack_num.pop();
				num2 = stack_num.pop();
				stack_num.add(num2 + num1);
				break;
			case "-":
				num1 = stack_num.pop();
				num2 = stack_num.pop();
				stack_num.add(num2 - num1);
				break;
			default:
				stack_num.add(Integer.valueOf(token[i]));
				break;
			}
		}
		System.out.println("결과 값 : " + stack_num.pop());
	}

}

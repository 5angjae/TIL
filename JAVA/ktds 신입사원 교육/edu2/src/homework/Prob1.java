package homework;

public class Prob1 {

	public static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";
		
		// ���α׷��� ������ ����.	
		// ���� : ���� 'a'�� �������� 97�̸�, 'z'�� 122�Դϴ�. 
		for (int i = 0; i < sourceString.length(); i++) {
			char ch = sourceString.charAt(i);
			if(ch==' ') {
				encodedString += ch;
				continue;
			}
			if(ch>='a' && ch<='z') {
				if(ch+3 > 'z') {
					encodedString += (char)(ch-26+3);
				} else {
					encodedString += (char)(ch+3);
				}
			}
		}
		// ���α׷� ������ ��.
		
		System.out.println("��ȣȭ�� ���ڿ� : " + sourceString);
		System.out.println("��ȣȭ�� ���ڿ� : " + encodedString);
		
	}

}

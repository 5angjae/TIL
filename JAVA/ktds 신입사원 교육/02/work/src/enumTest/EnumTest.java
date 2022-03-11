package enumTest;

public class EnumTest {
	public static void main(String[] args) {
		Status work = null;
		int n = 2;
		
		switch(n) {
		case 1:
			work = Status.READY;
			break;
		case 2:
			work = Status.SEND;
			break;
		
		}
	}
}

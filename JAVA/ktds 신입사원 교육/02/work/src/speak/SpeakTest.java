package speak;

public class SpeakTest {
	public static void main(String[] args) {
		Object[] obj = {new Reader("�浿"),
				new Worker("�Ѹ�"),
				new Student("������")};
		for (int i = 0; i < obj.length; i++) {
			if(obj[i] instanceof Speakable){
				Speakable speaker = (Speakable)obj[i];
				System.out.println(speaker.speak());
			}
		}
	}
}

class Man {
   String name;
   
   public Man(String name) {
      this.name = name;
   }
  
   public String getName() {
	   return name;
   }
}

class Student extends Man {
	public Student(String name) {
		super(name);
	}
   
}

class Reader extends Man implements Speakable {
	public Reader(String name) {
		super(name);
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return name+" ���ڴ� �ڹٸ� �� �ϰ� �ʹ�!!";
	}
	
}

class Worker extends Man implements Speakable {
	public Worker(String name) {
		super(name);
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return name+" �ϲ��� �ڱⰡ ���� ���� ������ �Ѵ�!!";
	}
	
}
   

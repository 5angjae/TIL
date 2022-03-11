package speak;

public class SpeakTest {
	public static void main(String[] args) {
		Object[] obj = {new Reader("길동"),
				new Worker("둘리"),
				new Student("마이콜")};
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
		return name+" 독자는 자바를 잘 하고 싶다!!";
	}
	
}

class Worker extends Man implements Speakable {
	public Worker(String name) {
		super(name);
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return name+" 일꾼은 자기가 맡은 일을 열심히 한다!!";
	}
	
}
   

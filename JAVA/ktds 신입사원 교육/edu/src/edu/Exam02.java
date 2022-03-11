package edu;

public class Exam02 {
	
	public static void calcTax(Person e) { //다형성
		//직원들의 세금계산
		
	}
	public static void main(String[] args) {
		new Employee();
		Student s = new Student("홍길동", 23, "컴공");
		Employee e = new Employee("이순신", 50, "행정실");
		Professor p = new Professor("강감찬", 53, "자바");
		s.print();
		e.print();
		p.print();
		calcTax(e);
		calcTax(p);
	}
   
}

class Person {
   String name;
   int age;
   
   public Person() {
      System.out.println("Person() 호출됨!");
   }
   
   public Person(String name, int age) {
      this.name = name;
      this.age = age;
      System.out.println("Person(name, age) 호출됨!");
   }

   public void print() {
      System.out.print(name + " : " + age);
   }
}

class Student extends Person {
   String major;
   
   public Student(String name, int age, String major) {
      super(name, age);
      this.major = major;
   }
   
   public void print() {
      super.print();
      System.out.println(" : " + major);
   }
}

class Employee extends Person {
   String dept;
   
   public Employee() {
      super(); // Person()
      System.out.println("Employee() 호출됨!");
   }
   
   
   
   public Employee(String name, int age, String dept) {
      super(name, age);
      this.dept = dept;
   }



   public void print() {
      super.print();
      System.out.println(" : " + dept);
   }
}

class Professor extends Person {
   String subject;

   public Professor(String name, int age, String subject) {
      super(name, age);
      this.subject = subject;
   }



   public void print() {
      super.print();
      System.out.println(" : " + subject);
   }
}

//package edu;
//
//public class Exam02 {
//	public static void main(String[] args) {
//		new Employee();
//	}
//}
//
//class Person {
//	String name;
//	int age;
//	public Person() {
//		// TODO Auto-generated constructor stub
//		System.out.println("Person() 호출됨!");
//	}
//	public void print() {
//		//System.out.println(name+":"+age);
//		System.out.print(name+":"+age);
//	}
//}
//
//class Student extends Person {
//	String major;
//	public void print() {
//		//System.out.println(name+":"+age+":"+major); //메서드오버라이딩. 코드의 중복이 일어나는 부분이 불편하다?
//		super.print();
//		System.out.println(":"+major);
//	}
//}
//
//class Employee extends Person {
//	String dept;
//	public Employee() {
//		// TODO Auto-generated constructor stub
//		super();
//		System.out.println("Employee() 호출됨!");
//	}
//	public void print() {
//		System.out.println(name+":"+age+":"+dept); //메서드오버라이딩. 코드의 중복이 일어나는 부분이 불편하다?
//	}
//}
//
//class Professor extends Person {
//	String subject;
//	public void print() {
//		System.out.println(name+":"+age+":"+subject); //메서드오버라이딩. 코드의 중복이 일어나는 부분이 불편하다?
//	}
//}
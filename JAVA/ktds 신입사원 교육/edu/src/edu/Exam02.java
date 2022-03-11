package edu;

public class Exam02 {
	
	public static void calcTax(Person e) { //������
		//�������� ���ݰ��
		
	}
	public static void main(String[] args) {
		new Employee();
		Student s = new Student("ȫ�浿", 23, "�İ�");
		Employee e = new Employee("�̼���", 50, "������");
		Professor p = new Professor("������", 53, "�ڹ�");
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
      System.out.println("Person() ȣ���!");
   }
   
   public Person(String name, int age) {
      this.name = name;
      this.age = age;
      System.out.println("Person(name, age) ȣ���!");
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
      System.out.println("Employee() ȣ���!");
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
//		System.out.println("Person() ȣ���!");
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
//		//System.out.println(name+":"+age+":"+major); //�޼���������̵�. �ڵ��� �ߺ��� �Ͼ�� �κ��� �����ϴ�?
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
//		System.out.println("Employee() ȣ���!");
//	}
//	public void print() {
//		System.out.println(name+":"+age+":"+dept); //�޼���������̵�. �ڵ��� �ߺ��� �Ͼ�� �κ��� �����ϴ�?
//	}
//}
//
//class Professor extends Person {
//	String subject;
//	public void print() {
//		System.out.println(name+":"+age+":"+subject); //�޼���������̵�. �ڵ��� �ߺ��� �Ͼ�� �κ��� �����ϴ�?
//	}
//}
package work;

public class SchoolTest {
	public static void main(String[] args) {
		Student s =new Student("ȫ�浿",20,2008123);
		Teacher t =new Teacher("�̼���",50,"Java");
		Employee e=new Employee("������",40,"������");
		
		s.print();
		t.print();
		e.print();
	}
}

class Person {
   String name;
   int age;
   
   public Person(String name, int age) {
      this.name = name;
      this.age = age;
   }
   public void setName(String name) {
	   this.name = name;
   }
   public String getName() {
	   return name;
   }
   public void setAge(int age) {
	   this.age = age;
   }
   public int getAge() {
	   return age;
   }
   public void print() {
      System.out.print("�̸�: "+ name + "     ����: " + age);
   }
}

class Student extends Person {
   int id;
   
   public Student(String name, int age, int id) {
      super(name, age);
      this.id = id;
   }
   public void SetId(int id) {
	   this.id = id;
   }
   public int getId() {
	   return id;
   }
   
   public void print() {
      super.print();
      System.out.println(" ID : " + id);
   }
}

class Employee extends Person {
   String dept;
   
   public Employee(String name, int age, String dept) {
      super(name, age);
      this.dept = dept;
   }
   
   public void setDept(String dept) {
	   this.dept = dept;
   }
   
   public String getDept() {
	   return dept;
   }

   public void print() {
      super.print();
      System.out.println(" ���� : " + dept);
   }
}

class Teacher extends Person {
	   String subject;
	   
	   public Teacher(String name, int age, String subject) {
	      super(name, age);
	      this.subject = subject;
	   }
	   
	   public void setSubject(String subject) {
		   this.subject = subject;
	   }
	   
	   public String getSubject() {
		   return subject;
	   }

	   public void print() {
	      super.print();
	      System.out.println(" �μ� : " + subject);
	   }
	}
package animal;

public class TestAnimals {
  public static void main(String[] args) {
    Fish f = new Fish();
    Cat c = new Cat("Fluffy");
    Animal a = new Fish();
    Animal e = new Spider();
    Pet p = new Cat();

    // Demonstrate different implementations of an interface
    f.play();
    c.play();

    // Demonstrate virtual method invocation
    e.eat();
    e.walk();

    // Demonstrate calling super methods
    a.walk();
  }
}
abstract class Animal {
	int legs;
   
	public Animal(int legs) {
		this.legs = legs;
	}
	
	public void walk() {
		System.out.println("This animal walks on " + legs + " legs.");
	}
	public abstract void eat();
}

class Spider extends Animal{
	public Spider() {
		super(8);
	}
	public void eat() {
		System.out.println("Spiders catch flies in their webs to eat.");
	}
}
class Cat extends Animal implements Pet{
	String name;
	
	public Cat(){
        this("");
    }
    public Cat(String name){
        super(4);
        this.name = name;
    }
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(name + " likes to play with string.");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cats like to eat spiders and mice.");
	}
}

class Fish extends Animal implements Pet{
	String name;
	
	public Fish(){
        this("");
    }
	public Fish(String name) {
		super(0);
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(name+"Fish swim in their tanks all day.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Fish eat pond scum.");
	}
	
	public void walk() {
		super.walk();
		System.out.println("Fish, of course, can't walk; they swim.");		
	}
	
}
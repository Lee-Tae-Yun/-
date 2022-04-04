package week4;

class Animal<T>{
	T a;
	void eat() {
		System.out.println("냠냠");
	}
}
class Cat extends Animal{
	int b;
	void meow() {
		System.out.println("냐옹");
	}
}

public class ClassCast {

	public static void main(String[] args) {
		Animal<Integer> an= new Animal();
		an.eat();
		Cat cat = new Cat();
		cat.meow();
		cat.eat();
	}

}

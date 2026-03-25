package ex04;

class Pet {
	String name;
	void eat() {
		System.out.println(name + "(이)가 먹는다");
	}
}

class Dog extends Pet { // Dog = Pet + Dog
	void   bark() {
		System.out.println(name + "(이)가 멍멍");
	}
}

// extends 뒤에는 하나만 올 수 있음 : **다중 상속 불가능**
class Cat extends Pet {
	void meow() {
		System.out.println(name + "(이)가 야옹");
	}
}
class Tiger extends Pet {
	void cry() {
		System.out.println(name + "(이)가 어흥");
	}
}

public class TestAnimalInherit {

	// 상속 : Inherit -> Java 에서는 extends 로 처리
	// 상속은 한개만 가능 -> java, c#
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		work(dog, "츄"); // work 는 static 이라서 이탤릭체로 되어있음 - 왜 static 이냐? : new 안붙였으니까
		// dog.name = "츄";
		// dog.eat();
		// dog.bark();
		System.out.println("===================================");
		
		
		Cat cat = new Cat();
		work(cat, "네로");
		// nero.name = "네로";
		// nero.eat();
		// nero.meow();
		
		System.out.println("===================================");
		
		Tiger tiger = new Tiger();
		work(tiger, "큰냥이");
		
		System.out.println("===================================");
		
		Pet pet = new Pet();
		pet.name = "뻐금이";
		pet.eat();
		// pet.bark(); // error
		// pet.meow(); // error
		

}
	// 한개의 work() 함수로 업무처리

	private static void work(Pet pet, String name) {
		pet.name = name;
		System.out.println("Work: ");
		pet.eat();
		
		if(pet instanceof Dog)
		((Dog) pet).bark();
		if(pet instanceof Cat)
		((Cat) pet).meow();
		if(pet instanceof Tiger)
			((Tiger) pet).cry();
		
	}

	/*
	private static void work(Cat cat, String name) {
		cat.name = name;
		System.out.println("work: ");
		cat.eat();
		cat.meow();
		
	}

	private static void work(Dog dog, String name) {
		dog.name = name;
		System.out.println("work: ");
		dog.eat();
		dog.bark();
	}
	*/
}


















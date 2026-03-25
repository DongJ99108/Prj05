package ex03;

class Dog {
	String name;
	void   eat() {
		System.out.println(name + "(이)가 먹는다");
	}
	void   bark() {
		System.out.println(name + "(이)가 멍멍");
	}
}

class Cat {
	String name;
	void eat() {
		System.out.println(name + "(이)가 먹는다");
	}
	void meow() {
		System.out.println(name + "(이)가 야옹");
	}
}

public class TestAnimal {

	public static void main(String[] args) {
		Dog chu = new Dog(); 
		// new Dog() 생성자 호출 문장인데 문제는 생성자가 없음 : 자바가 기본생성자를 생성해준다.(그만큼 필수적인 요소라는 뜻)
		chu.name = "츄";
		chu.eat();
		chu.bark();
		
		Cat nero = new Cat();
		nero.name = "네로";
		nero.eat();
		nero.meow();
		

	}

}

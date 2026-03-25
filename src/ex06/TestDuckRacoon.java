package ex06;

// 오리
class Duck {
	void swim() {
		System.out.println("헤엄을 칩니다.");
	}
}

// 너구리 - 코드없는 함수로 구현
// 모든 항목이 abstract 인 abstract class 는 interface 문법으로 변경가능 
// extends 클래스 implements 인터페이스 1, 인터페이스 2, 인터페이스 3, ....
/*
abstract class Racoon { // -> interface 함수로 바꾼다
	abstract void dig(); 
}
*/
interface Racoon { 
	void dig(); // interface 니까 abstract 안써도 됨
}


// 오리너구리
// class DuckRacoon extends Duck, Racoon {} // 다중상속 불가능 : 에러
class DuckRacoon extends Duck implements Racoon {

	@Override
	public void dig() {
		System.out.println("땅을 판다.");
		
	}
	
}



class TestDuckRacoon {

	public static void main(String[] args) {
		
		DuckRacoon dr = new DuckRacoon();
		dr.swim();
	    dr.dig();

	}

}

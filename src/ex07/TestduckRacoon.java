package ex07;

interface Duck {
	void swim();
	
}
interface Racoon {
	void dig();
}

class DuckRacoon implements Duck, Racoon {

	@Override
	public void dig() {
		System.out.println("땅을 판다.");
		
	}

	@Override
	public void swim() {
		System.out.println("헤엄을 친다.");
		
	}
	
}

class TestduckRacoon {

	public static void main(String[] args) {
		
		DuckRacoon dr = new DuckRacoon();
		dr.swim();
		dr.dig();
		
		System.out.println(dr.toString()); // dr 의 정보를 문자열(@ 뒤는 16진수)로 바꿔서 보여줘
		System.out.println(dr.hashCode()); // heap 메모리 위치
		System.out.println(dr.getClass()); // class ex07.DuckRacoon

		// 모든 자바의 class 는 Object class 를 상속받아서 만들어졌다. 
		Object obj = new Object();
		System.out.println(obj.toString()); // java.lang.Object@14dad5dc
		System.out.println(obj.hashCode()); // 1984697014
		System.out.println(obj.getClass()); // class java.lang.Object
		
	}

}

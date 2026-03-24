package ex01;

public class TestCalc {

	public static void main(String[] args) {
		int n1 = 7;
		int n2 = 2;
		int result;
		result = add(7, 2);
		System.out.println( result );
		
		result = add(n1, n2, 5);
		System.out.println( result );

	}

	// 객체 지향프로그램의 overloading 이라고 한다.
	// add 를 보면 알겠지만 java 는 같은 이름의 함수를 여러개 만들 수 있다 하지만 '인자'가 달라야한다.(위에건 3개 밑에건 2개)
	private static int add(int v1, int v2, int v3) {
		return v1 + v2 + v3;
	}

	private static int add(int v1, int v2) {
		return v1 + v2;
	} 

}

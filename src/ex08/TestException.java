package ex08;

class TestException {

	public static void main(String[] args) {
		
		/*
		int n1 = 7;
		// int n2 = 2;
		int n2 = 0;
		int n = n1 / n2; // 정수/정수 = 정수3
		// Exception in thread "main" java.lang.ArithmeticException: / by zero
	// at ex08.TestException.main(TestException.java:9)  // 자바스크립트에서는 0을 0.0 으로 해석해서 infinity 가 나옴 하지만 여기선 정수로 봄
		// 9 라인에서 프로그램 강제종료, 이후 코드는 실행되지 않음
		System.out.println( n );
		System.out.println("프로그램 종료");
		*/
		
		// 예외처리( Exception Handling )
		// 예외 - 실행중에 발생하는 오류
		try {
			int n1 = 7;
			int n2 = 0;
			int n = n1 / n2;
			System.out.println( n );
		} catch(ArithmeticException e) { // 오류 발생시 처리방법
			System.out.println("계산오류" + e);
		} catch(Exception e) {
			System.out.println("오류 발생:" + e);
		} finally { // 오류에 상관없이 무조건 실행
			System.out.println("프로그램 종료");
		}

	}

}

package ex02;

class Member {
	// 어떤 정보들이 필요한가? = 이름, 닉네임, 이메일, 데뷔년도
	// Field : Data
	String name;
	String uid;
	String email;
	int    regYear;
	
	// 기본 생성자
    public Member() {}
    
    // 인자 있는 생성자
    public Member(String n, String u, String e, int r) {
    	name    = n;
    	uid     = u;
    	email   = e;
    	regYear = r;
    }
	
	//Method : 기능
	void info() {
		
		String fmt = "이름:%s\n아이디:%s\n이메일:%s\n연도:%d\n";
			 	           
		String msg = String.format(fmt, name, uid, email, regYear);
		System.out.println( msg );
	}
}

public class TestMember {

	public static void main(String[] args) {
		Member m1  = new Member();
		m1.name    = "사나";
		m1.uid     = "sana";
		m1.email   = "sana@jyp.com";
		m1.regYear = 2012;
		m1.info();

		Member m2  = new Member();
		m2.name    = "정연";
		m2.uid     = "jungyeon";
		m2.email   = "jungyeon@jyp.com";
		m2.regYear = 2011;
		m2.info();
		
		Member m3  = new Member();
		m3.name    = "채영";
		m3.uid     = "chaeyeong";
		m3.email   = "chaeyeong@jyp.com";
		m3.regYear = 2013;
		m3.info();
		
		System.out.println("==========================================");
		
		/*
		// member 배열에 저장
		Member [] mList = new Member[3]; // 배열 생성
		mList[0] = new Member();         // 배열안에 저장할 Member 생성
		mList[0].name = "사나";
		mList[0].uid = "sana";
		mList[0].email = "sana@jyp.com";
		mList[0].regYear = 2012;
		*/
		
		Member[] mList = new Member[3]; // 배열 생성
		mList[0]       = new Member("사나", "sana", "sana@jyp.com", 2012);
		mList[1]       = new Member("정연", "jungyeon", "jungyeon@jyp.com", 2011);
		mList[2]       = new Member("채영", "chaeyeong", "chaeyeong@jyp.com", 2013);
		
		mList[0].info();
		mList[1].info();
		mList[2].info();
		
		
	}

}



















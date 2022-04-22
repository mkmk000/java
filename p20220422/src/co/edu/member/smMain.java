package co.edu.member;

public class smMain {

	public static void main(String[] args) {
		
		//정적 필드 메인
		double pi = StaticMember.PI;
		System.out.println(pi);
		
		int sum = StaticMember.plus(5, 10);
		System.out.println(sum);
		
		int minus = StaticMember.minus(10, 5);
		System.out.println(minus);
		

		
	}

}

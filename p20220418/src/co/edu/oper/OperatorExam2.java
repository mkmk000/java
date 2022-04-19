package co.edu.oper;

public class OperatorExam2 {

	public static void main(String[] args) {
	
	
		//논리 부정 연산자
		boolean flag = true;  //boolean 참, 거짓
		System.out.println(flag);
		System.out.println(!flag); // ! 가 붙으면 연산자의 논리값을 바꿈
		
		// if() //if 괄호 안에는 조건
		int i =101;
		if(i == 100) {
			System.out.println("참입니다.");
	    } else {
		    System.out.println("거짓입니다.");
	    }
		
		String str = "서브웨이";
		String str2 = "서브웨이";
		if(str.equals(str2)) {
			System.out.println("맛있다.");
		} else {
			System.out.println("별로다.");
		}
		
		int var = 6;
		if(var % 2 == 0 && var % 3 == 0) {   //&&, & 의 차이
			System.out.println("2의 배수이면서, 3의 배수입니다.");
		} else {
			System.out.println("2 그리고 3의 배수가 아닙니다.");
		}
		
		var = 9;
		if(var % 2 == 0 || var % 3 == 0) {  
			System.out.println("2의 배수이면서, 3의 배수입니다.");
		} else {
			System.out.println("2 그리고 3의 배수가 아닙니다.");
		}
		
		boolean flag1 = true;
		if(!flag1) {   // ! 가 붙으면 연산자의 논리값을 바꿈
			System.out.println("참");
	    } else {
		    System.out.println("거짓");
	    }
		
		
		//삼항 연산자
		int score = 99;
		char grade = (score > 90) ? 'A' : 'B';  // A = True, B = False
		System.out.println("학점은 " + grade + " 입니다.");
		
		
		
		
		
		
	}
}
		
		    
		    
       	

	
	


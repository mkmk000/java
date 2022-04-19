package co.edu.oper;

public class OperatorExam {

	public static void main(String[] args) {

		/*
		// +, -, *, /, %(/=몫, %=몫을 제외한 나머지)
		
		//10000초 -> 10000/(60*60) = 시간
		//10000초 -> 10000/60 = 분
		//        -> 10000%60 = 초
		int hour = 10000/(60*60); //10000초를 시간으로 변환
		int min = 10000/60; //10000초를 분으로 변환
		int sec = 10000%60; //남는 초 계산

		System.out.println(hour);
		System.out.println(min);
		System.out.println(sec);
		*/
		
		
		
		/*
		//증감 연산자(++, --), 앞에 붙는 ++는 계산하기 전에 포함됨
		int i = 0;
		int j = 0;
		i++; // i = i + 1; 같은 의미
		++i; // i++; 와는 다른 의미
		
		//대입 연산자(=, +=, -=, *=, /=, %=)
		i = i + 1; 
		i += 1; // i = i + 1; 같은 의미
		*/
		
		
		//i = i + ++j;
		int i = 0;
		int j = 0;
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		
		System.out.println(++i);
		
		System.out.println(i++); //실행문이 다 끝난 후에 +1
		System.out.println(i);
		
		
		
		
		
	}

}

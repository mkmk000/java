package Question2;

public class Result {

	private static final int Obesity = 0;
	private static char[] getObesity;

	public static void main(String[] args) {

//	4) 아래와 같은 출력결과가 나오도록 실행코드를 구현하다.
//	- 출력결과
//	홍길동님의 신장 168, 몸무게 45, 표준체중 61.2 입니다.
//	박둘이님의 신장 168, 몸무게 90, 비만입니다.
//	- 조건
//	변수는 Human 클래스 타입으로 선언하여 하나만 사용한다.
		
		StandardWeightInfo swi = new StandardWeightInfo("홍길동", 168, 45);
		swi.getInformation();
		
		ObesityInfo oi = new ObesityInfo("박둘이", 168, 90);
		oi.info();
		
		
		
		
//		if(fatnessWeight < 90) { //저체중
//			System.out.println("비만도 판단 : "+ "저체중입니다");	
//		}
//		else if(fatnessWeight >= 90 && fatnessWeight < 110) { //정상체중
//			System.out.println("비만도 판단 : "+ "정상 체중입니다");
//		}
//		else if(fatnessWeight >= 110 && fatnessWeight < 120) { //과체중
//			System.out.println("비만도 판단 : "+ "과체중입니다");
//		}
//		else if(fatnessWeight >= 120) { //비만
//			System.out.println("비만도 판단 : "+ "비만입니다");
//		}
		
		
		
		
		
		
		
	}

}

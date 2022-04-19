package co.edu.array;

public class ArrayExam {

	public static void main(String[] args) {
		
		//배열 : 데이터를 같은 공간에 넣을 수 있음
		
		/*
		int score = 1;
		int score1 = 2;
		int score2 = 3;
		int score3 = 4;
		int score4 = 5;
		*/
		
//		int[] ary = new int[10]; //10개의 공간을 만들겠다는 뜻(1~10이 아닌 0~9까지의 공간 사용)
//		ary[0] = 1;
//		ary[1] = 2;
		
		/*
		int[] ary1 = {1,2,3,4,5}; //인덱스 값 0,1,2,3,4
		System.out.println(ary1.length); //ary1.length = 몇개의 공간이 있는지 확인
		int sum = 0;		
		for(int i=0; i<ary1.length; i++) { //length = 배열의 크기
			sum += ary1[i];
		}
		System.out.println("총합 : " + sum);
		*/
		
		
		
		//3칸짜리 int 타입 배열
		int[] scores = {83, 90, 87};
		
		//scores 배열 첫번째 데이터
		System.out.println(scores[0]);
		//scores 배열 두번째 데이터
		System.out.println(scores[1]);
		//scores 배열 세번째 데이터
		System.out.println(scores[2]);
		
		int sum = 0;
		for(int i = 0; i<scores.length; i++) { //scores.length = 3
			sum += scores[i]; //0,1,2
		}
		
		System.out.println("총합 : " + sum);
		double avg = (double) sum /3;
		System.out.println("평균 : " + avg);
		
		
		
		//최대, 최소값 구하기
		int[] ary2 = {5,3,2,8,1};
		int max = 0;
		int min = ary2[0];
		for(int i=0; i<ary2.length; i++) {
			//최대값
			if(max < ary2[i]) {
				max = ary2[i];
			}
			//최소값
			if(min > ary2[i]) {
				min = ary2[i];
			}
		}
		System.out.println(max);		
		
	}

}

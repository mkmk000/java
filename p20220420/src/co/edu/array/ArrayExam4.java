package co.edu.array;

public class ArrayExam4 {

	public static void main(String[] args) {

		int[][] ary = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 } };

		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				System.out.print(ary[i][j] + "\t"); // ln은 없음 있으면 줄바꿈으로 나타남, \t 탭띄움은 없어도 됨 보기 편하게 하기위해서 씀
			}
			System.out.println();
		}

		// 2차원 배열 = 배열 안에 배열이 존재
		int[][] ary1 = new int[5][5];
		int num = 1;

		// 2차원 배열 데이터 입력 1~25
		for (int i = 0; i < ary1.length; i++) { // ary1 첫 배열의 공간(5개)
			for (int j = 0; j < ary1[i].length; j++) { // ary1[i] 첫 배열 안에 또 다른 배열 존재
				ary1[i][j] += num;
				num++;
			}
		}
		System.out.println();

		// 2차원 배열 데이터 출력
		for (int i = 0; i < ary1.length; i++) {
			for (int j = 0; j < ary1[i].length; j++) {
				System.out.print(ary1[i][j] + " "); // ln은 없음 있으면 줄바꿈으로 나타남
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < ary1.length; i++) {
			for (int j = 0; j < ary1[i].length; j++) {
				System.out.print(ary1[j][i] + " "); // ln은 없음 있으면 줄바꿈으로 나타남
			}
			System.out.println();
		}
		
		
		

	}

}

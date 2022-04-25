package Question3;

public abstract class Movie extends Culture {


//	2) Movie 클래스를 정의한다.
//	- 추가로 장르를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//	- 메소드는 다음과 같이 정의한다.
//	(1) public abstract void getInformation() : 제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능

	// 필드
	public String title; //영화제목
	public int director; //감독
	public int actor; //배우
	public int audience; //관객
	public int score; //총점
	public String movie; //영화제목

	// 생성자
	public Movie(String title, int director, int actor, int audience, int score) {
		super(title, director, actor, audience, score);
	}
	

	// 메소드
	public void getInformation("영화제목 : " + movieTitle + "\n감독 : " + director + "\n배우" + actor + "\n영화총점 : " + getGrade + "\n영화평점 : " + score);
}

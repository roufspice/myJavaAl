package myJavaAl_20200609;

import java.util.ArrayList;

public class GradeCaculator {

	private String name; // 학생이름(인스턴스변수);
	private double scoreOfAverage; // 직전학기까지의 평균
	private int numberOfGetCredits; // 직전학기까지의 총 이수학점!

	ArrayList<Course> scoreDataList = new ArrayList<Course>();

	// 생성자초기화
	public GradeCaculator(String name, double scoreOfAverage, int numberOfGetCredits) {
		this.name = name;
		this.scoreOfAverage = scoreOfAverage;
		this.numberOfGetCredits = numberOfGetCredits;
		// ?생성자에 더 필요한건 없을까?

	}

	// 디폴트 생성자
	public GradeCaculator() {

	}

	// 성적입력메소드 =>addCourse()=> boolean값일까?
	public boolean addCourse(Course c) {
		scoreDataList.add(c);

		return true;
	}

	// print() => 직전학기 성적! 이번학기성적! 전체예상학점!

	// 1. 직전학기 성적 리턴해주는 메소드! <= 만들필요 없을듯?
//	private double scoreAve() {
//		
//		
//		return scoreOfAverage; 	//직전학기까지의 평균성적반환
//	}

	// 2. 이번학기 성적 출력메소드
	private double getScore() {
		double totalScore = 0;

		for (int i = 0; i < scoreDataList.size(); i++) {
			totalScore += (double) (scoreDataList.get(i).getScoreNum() * scoreDataList.get(i).getCredit());
		}

		return totalScore / getCredit();

	}

	// 3 이번학기 credit 총합 출력메소드
	private int getCredit() {
		int totalCredits = 0;
		for (int i = 0; i < scoreDataList.size(); i++) {
			totalCredits += scoreDataList.get(i).getCredit();
		}
		return totalCredits;
	}

	// 4. 전체예상 학점 출력메소드 => print()

	public void print() {
		int expectedTotalCredits = getCredit() + numberOfGetCredits;
		//예상학점구하는 공식
		double expectedTotalScore = (double)((scoreOfAverage*numberOfGetCredits) + (getScore()*getCredit())); 
		double ets = expectedTotalScore / expectedTotalCredits;

		System.out.printf("직전 학기 성적: %.1f (총 %d학점)%n", scoreOfAverage, numberOfGetCredits);
		System.out.printf("이번 학기 성적: %.10f (총 %d학점)%n", getScore(), getCredit());
		System.out.printf("전체 예상 학점: %.10f (총 %d학점)%n",ets,expectedTotalCredits);

	}

	/*
	 * 이전 학기까지의 평균 점수 (4.5 만점) 이전 학기까지의 이수 크레딧 수 (전공 과목(CREDIT_MAJOR)은 3학점, 교양
	 * 과목(CREDIT_GENERAL)은 2학점) 이번 학기 과목별 예상 성적
	 */

}

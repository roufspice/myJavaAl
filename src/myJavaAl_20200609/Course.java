package myJavaAl_20200609;

public class Course {
	private String courseName; 				// 과목이름
	static final int CREDIT_MAJOR = 3;		// 전공학점은 3학점, 비전공학점은 2학점으로 파이널선언!
	static final int CREDIT_GENERAL = 2;
	private int credit;
	private String score; // {A+, A, B+, B, C+, C, D+, D, F}	// 학점을 선언하는 과정!
	private double scoreNum;				//A+ => 4.5학점으로 바꿔주는것!

	
	public Course(String courseName, int credit, String score) {
		this.courseName = courseName;
		this.score = score;
		this.scoreNum = changeScore(score);
		if(credit == CREDIT_MAJOR) {
			this.credit = 3;
		} else if(credit == CREDIT_GENERAL) {
			this.credit = 2;
		}
		
		
		
		// credit은 클래스변수임!
	}

	public Course() {
	}

	
	
	// getter setter
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public static int getCreditMajor() {
		return CREDIT_MAJOR;
	}

	public static int getCreditGeneral() {
		return CREDIT_GENERAL;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public double getScoreNum() {
		return scoreNum;
	}
	
	//성적결과를 숫자로 반환해주는 메소드 성적에 벗어나는 입력값은 -1로 반환!
	private double changeScore(String score) {
		double result;
		
		switch(score) {
		case "A+":
			result = 4.5; break;
		case "A":
			result = 4.0; break;
		case "B+":
			result = 3.5; break;
		case "B":
			result = 3.0; break;
		case "C+":
			result = 2.5; break;
		case "C":
			result = 2.0; break;
		case "D+":
			result = 1.5; break;
		case "D":
			result = 1.0; break;
		case "F":
			result = 0.0; break;
		default:
			result = -1;
			
		}
		return result;
		
		
	}

}

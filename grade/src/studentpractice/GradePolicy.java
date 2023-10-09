package studentpractice;

public class GradePolicy extends Student{
	



	//학점 부여 정책
	
	// 필수과목 S~F
	// 일반과목 A~F
	
	//1) A,B,C,D,E,F를 사용하는 방법
	
	//필	
	
	public String Subject;
	Subject comst1 = new ComputerSt();
	Subject korst1 = new KorSt();
	int mathScore;
	int korScore;
//	public String generalSubject;

	
	
	public GradePolicy(String stName, String stNum, String subject, String requireSub, int korScore, int mathScore) {
		super(stName, stNum, subject , requireSub);
		Subject=subject;
		this.korScore=korScore;
		this.mathScore=mathScore;
	}
	
	
	//메
	
	//수학 점수
	String mathScore() {
		//전공이 컴퓨터공학과 일때 필수과목점수등급
		if(Subject == comst1.major()) {
			if(mathScore>=95) {
				return "S";
			} else if(mathScore>=90) {
				return "A";
			} else if(mathScore>=80) {
				return "B";
			} else if(mathScore>=70) {
				return "C";
			} else if(mathScore>=60) {
				return "D";
			} else {
				return "F";
			}
		}
		//전공이 컴퓨터공학과가 아닐 때 일반과목 점수등급
		else if (Subject != comst1.major()) {
			if(mathScore>=90) {
				return "A";
			} else if(mathScore>=80) {
				return "B";
			} else if(mathScore>=70) {
				return "C";
			} else if(mathScore>=55) {
				return "D";
			} else {
				return "F";
			}			
		}
		else {
			return "다른 과목을 추가하세요";
		}
	}
	//국어 점수
	String korScore() {
		// 전공이 국어국문학과일때 국어과목점수등급
		if(Subject == korst1.major()) {
			if(korScore>=95) {
				return "S";
			} else if(korScore>=90) {
				return "A";
			} else if(korScore>=80) {
				return "B";
			} else if(korScore>=70) {
				return "C";	
			} else if(korScore>=60) {
				return "D";	
			} else {
				return "F";
			}			
		}
		// 전공이 국어국문학과가 아닐때 국어과목점수등급
		else if(Subject != korst1.major()) { 
			if(korScore>=90) {
				return "A";
			} else if(korScore>=80) {
				return "B";
			} else if(korScore>=70) {
				return "C";
			} else if(korScore>=55) {
				return "D";
			} else {
				return "F";
			}						
		}
		return "과목을 추가하세요";
	}
	
	
}

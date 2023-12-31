package gradingProgram;

import java.util.ArrayList;

public interface ScorePrint {
	
	final String korean = "국어";
	final String math = "수학";
	final String dance = "방송댄스";
	
	//학점 부여 정책
	
		// 필수과목 S~F
		// 일반과목 A~F
	
	//필수 과목 학점 산출
	static String getRequiedGrade(int score) {
		if(score>=95) {
			return "S";
		} else if(score>=90) {
			return "A";
		} else if(score>=80) {
			return "B";
		} else if(score>=70) {
			return "C";
		} else if(score>=60) {
			return "D";
		} else {
			return "F";
		}
	}
	//일반 과목 학점 산출
	static String getnoRequiedGrade(int score) {
		if(score>=90) {
			return "A";
		} else if(score>=80) {
			return "B";
		} else if(score>=70) {
			return "C";
		} else if(score>=55) {
			return "D";
		} else {
			return "F";
		}
	}
	
	//패스논패스 과목 학점 산출
	static String passnonpass(int score) {
		if(score>=70) {
			return "pass";
		} else {
			return "fail";
		}
	}
	
	//기본 프린트
	static void subjectPrint(String subject) {
		System.out.println("---------------------------------");
		System.out.printf("         %s  수강생  학점                \n",subject);
		System.out.println(" 이름 |   학번   |중점과목|점수 : 학점");
		System.out.println("---------------------------------");
	}
	
	//국어 수강생 점수 산출
	static void koreanscore(ArrayList<Student> studentList) {
		subjectPrint(korean);
		for(Student stu : studentList) {
			if(stu.getRequireSub().equals(korean)) {
				System.out.print(stu.toString()+stu.getKorScore()+" :  ");
				System.out.println(getRequiedGrade(stu.getKorScore()));
			}else if(!(stu.getRequireSub().equals(korean))) {
				System.out.print(stu.toString()+stu.getKorScore()+" :  ");
				System.out.println(getnoRequiedGrade(stu.getKorScore()));
			}else {
				System.out.println("과목을 추가하세요");
			}
		}
	}
//	수학 수강생 점수 산출
	static void mathscore(ArrayList<Student> studentList) {
		subjectPrint(math);
		for(Student stu : studentList) {
			if(stu.getRequireSub().equals(math)) {
				System.out.print(stu.toString()+stu.getMathScore()+" :  ");
				System.out.println(getRequiedGrade(stu.getMathScore()));
			}else if(!(stu.getRequireSub().equals(math))) {
				System.out.print(stu.toString()+stu.getMathScore()+" :  ");
				System.out.println(getnoRequiedGrade(stu.getMathScore()));
			}else {
				System.out.println("과목을 추가하세요");
			}
		}
	}
	//방송댄스 수강생 점수 산출
	static void dancescore(ArrayList<Student> studentList) {
		subjectPrint(dance);
		for(Student stu : studentList) {
			if(stu.getDanceScore()!= -1) {
				System.out.print(stu.toString()+stu.getDanceScore()+" :  ");
				System.out.println(passnonpass(stu.getDanceScore()));
			}
		}
	}
}

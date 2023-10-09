package gradingProgram;

import java.util.HashMap;

public class Student{

	//필 (이름 점수 private)
	private String stName;
	String stNum;
	String subject;
	String requireSub;
	int idx;
	private int mathScore;
	private int korScore;
	private int danceScore;
	//스태틱으로 학변 인덱스 적립
	static HashMap<String,Integer> idxfinder = new HashMap<>();
	
	//생
	public Student() {
		
	}
	public Student(int idx, String stName, String stNum,int korScore,int mathScore) {
		this.stName=stName;
		this.stNum=stNum;
		this.setKorScore(korScore);
		this.setMathScore(mathScore);
		this.setDanceScore(-1);
		this.idx=idx;
		//해시맵에 학번 인덱스 적립
		idxfinder.put(stNum, idx);
	}
	
	
	//메
	//object toString 오버라이드
	@Override
	public String toString() {
		return getStName()+" | "+stNum;
	}
	
	
	//getter /setter
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public int getDanceScore() {
		return danceScore;
	}
	public void setDanceScore(int danceScore) {
		this.danceScore = danceScore;
	}
}

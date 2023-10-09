package gradingProgram;

public class KoreanStudent extends Student {
	
	//필
	String requireSub="국어";
	String subject = "국어국문학과";
	

	public KoreanStudent() {
		
	}

	public KoreanStudent(int idx,String stName, String stNum, int korScore, int mathScore) {
		super(idx,stName, stNum, korScore, mathScore);
	}
	
	//메
	//Student toString 오버라이드
	@Override
	public String toString() {
		return super.toString()+" | "+requireSub+" | ";
	}
	
	
	
	

}

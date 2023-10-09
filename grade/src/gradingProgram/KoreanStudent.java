package gradingProgram;

public class KoreanStudent extends Student {
	
	//필
	public String requireSub=korean;
	String department = "국어국문학과";
	

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

	@Override
	String getRequireSub() {
		return requireSub;
	}
	
	
	
	

}

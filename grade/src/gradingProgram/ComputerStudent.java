package gradingProgram;

public class ComputerStudent extends Student {
	
	//필
	final String requireSub = math;
	final String department = "컴퓨터공학과";
	

	public ComputerStudent() {
		
	}

	public ComputerStudent(int idx,String stName, String stNum, int korScore, int mathScore) {
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

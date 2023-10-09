package studentGrade;

public class Grade {

//--<필드>--------------------------------------------------------
	Student student=new Student();
	
//--<생성자>--------------------------------------------------------
	
	
//--<메소드>--------------------------------------------------------
	
//-----------필수과목 등급출력 조건문(S~F)-----------
	
	//필수 과목이 수학일 때 등급(컴퓨터공학과)
//	void requiredMathGrade(){
//		if(student.mathScore >= 95) {
//			System.out.println("S");
//			
//		} else if(student.mathScore >= 90) {
//			System.out.println("A");
//			
//		} else if(student.mathScore >= 80) {
//			System.out.println("B");
//			
//		} else if(student.mathScore >= 70) {
//			System.out.println("C");
//			
//		} else if(student.mathScore >= 60) {	
//			System.out.println("D");
//			
//		} else {
//			System.out.println("F");
//			//60점 미만은 F
//		}
//	}
//	
//	
//	//필수 과목이 국어일 때 등급(국어국문학과)
		void requiredKorGrade(){
			for(int i = 0; i < student.korScore[i]; i++){
				if(student.korScore[i] >= 95) {
					System.out.println("S");
					
				} else if(student.korScore[i] >= 90) {
					System.out.println("A");
					
				} else if(student.korScore[i] >= 80) {
					System.out.println("B");
					
				} else if(student.korScore[i] >= 70) {
					System.out.println("C");
					
				} else if(student.korScore[i] >= 60) {	
					System.out.println("D");
					
				} else {
					System.out.println("F");
					//60점 미만은 F
			}
		}
		
	}
	
////-----------일반과목 등급출력 조건문(A~F)-----------
//	
//	
//	//일반 수학 등급
//	void mathGrade(){
//		if(student.mathScore >= 90) {
//			System.out.println("A");
//			
//		} else if(student.mathScore >= 80) {
//			System.out.println("B");
//			
//		} else if(student.mathScore >= 70) {
//			System.out.println("C");
//			
//		} else if(student.mathScore >= 55) {
//			System.out.println("D");
//			
//		} else {
//			System.out.println("F");
//			//60점 미만은 F
//		}
//	}
//		
//	//일반 국어 등급
//	void korGrade(){
//		if(student.korScore >= 90) {
//			System.out.println("A");
//			
//		} else if(student.korScore >= 80) {
//			System.out.println("B");
//			
//		} else if(student.korScore >= 70) {
//			System.out.println("C");
//			
//		} else if(student.korScore >= 55) {
//			System.out.println("D");
//
//		} else {
//			System.out.println("F");
//			//60점 미만은 F
//		}
//	
//	
//
//	}
	
	public static void main(String[] args) {
		Grade grade=new Grade();
		Subject sub=new Subject();
		
		grade.requiredKorGrade();
//		grade.requiredMathGrade();
//		grade.requiredKorGrade();
//		System.out.println("----------------");
//		sub.subjectCheck();
		
		
		
	}

}

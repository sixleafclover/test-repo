package studentGrade;

public class Student {

	//시나리오
//	과목은 국어와 수학 / 학생은 각 두 과목을 모두 수강한다.
//	컴퓨터공학과 학생: 수학(필수) / 국어국문학과 학생은: 국어(필수)
//	일반과목: A~F / 필수과목: S~F
//	
//	필수과목
//	S(100점 ~ 95점)/A(94점 ~ 90점)/B(89점 ~ 80점)/C(79점 ~ 70점)/D(69점 ~ 60점)/F(60점 미만)
//	
//	일반과목
//	A(100점 ~ 90점)/B(89점 ~ 80점)/C(79점 ~ 70점)/D(69점 ~ 55점)/F(55점 미만)
	
	
	
	
//--<필드>--------------------------------------------------------
	
	//학생 이름
	String[] name= {"안성원", "오태훈", "이동호", "조성욱", "최태평"};
	
	//학번
	String[] number= {"181213", "182330", "171518", "172350", "171290"};

	//전공
	String[] major={"컴퓨터공학과", "국어국문학과"};

	//필수과목
	String[] requiredSubject= {"수학", "국어"};
	
	//수학점수
	int[] mathScore= {95,95,100,89,83};

	//국어점수
	int[] korScore= {56,98,88,95,56};
	
	
	//학생 이름
//	String name;
//	
//	//학번
//	String number;
//	
//	//전공
//	String major="컴퓨터공학과";
//	
//	//필수과목
//	String requiredSubject= "수학";
//	
//	//수학점수
//	int mathScore=60;
//
//	//국어점수
//	int korScore=84;
	
//--<생성자>--------------------------------------------------------
	
	Student(){
	}
	
	//이름, 학번, 전공, 수학점수, 국어점수
//	Student(String name, String number, String major, int mathScore, int korScore){
//		this.name=name;
//		this.number=number;
//		this.major=major;
//		this.mathScore=mathScore;
//		this.korScore=korScore;
//	}
	
//--<메소드>--------------------------------------------------------
	
	public static void main(String[] args) {
		//이름
		String[] name= {"안성원", "오태훈", "이동호", "조성욱", "최태평"};
		
		//학번
		String[] number= {"181213", "182330", "171518", "172350", "171290"};

		//전공
		String[] major={"컴퓨터공학과", "국어국문학과"};

		//필수과목
		String[] requiredSubject= {"수학", "국어"};
		
		//수학점수
		int[] mathScore= {95,95,100,89,83};

		//국어점수
		int[] korScore= {56,98,88,95,56};
		
		
		for(int i = 0; i <name.length; i++) {
			System.out.println(name[i]+" | "+number[i]+" | "+mathScore[i]+" | "+korScore[i]);
		}
	}
	
}

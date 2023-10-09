package studentpractice;

public class GoodSchool {

	public static void main(String[] args) {
	
		GradePolicy[] st = new GradePolicy[5];
		
		
		st[0] = new GradePolicy("안성원","181213", "국어국문학과", "국어" ,95 , 56);
		st[1] = new GradePolicy("오태훈","182330", "컴퓨터공학과", "수학" ,95 , 98);
		st[2] = new GradePolicy("이동호","171518", "국어국문학과", "국어" ,100 , 88);
		st[3] = new GradePolicy("조성욱","172350", "국어국문학과", "국어" ,89 , 95);
		st[4] = new GradePolicy("최태평","171290", "컴퓨터공학과", "수학" ,83 , 56);
		
		//국어 수강생 학점
		for (int i = 0; i < st.length; i++) {
			if(st[i].requireSub == "국어") {
				System.out.printf("%s | %s | %s | %s ",st[i].stName,st[i].stNum,st[i].Subject, st[i].requireSub);
				System.out.printf("%d:%s\n",st[i].mathScore,st[i].mathScore());				
			}
			else if(st[i].requireSub != "국어") {
				System.out.printf("%s | %s | %s | %s ",st[i].stName,st[i].stNum,st[i].Subject, st[i].requireSub);
				System.out.printf("%d:%s\n",st[i].mathScore,st[i].mathScore());								
			}
		}
		System.out.println();
		
		//수학 수강생 학점
		for (int i = 0; i < st.length; i++) {
			if(st[i].requireSub == "국어") {
				System.out.printf("%s | %s | %s | %s ",st[i].stName,st[i].stNum,st[i].Subject, st[i].requireSub);
				System.out.printf("%d:%s\n",st[i].korScore,st[i].korScore());				
			}
			else if(st[i].requireSub != "국어") {
				System.out.printf("%s | %s | %s | %s ",st[i].stName,st[i].stNum,st[i].Subject, st[i].requireSub);
				System.out.printf("%d:%s\n",st[i].korScore,st[i].korScore());								
			}
		}
	}
	
}

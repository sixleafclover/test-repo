package gradingProgram;

import java.util.ArrayList;
import java.util.HashMap;

public class GradingTest {

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<>();
		
		studentList.add(new KoreanStudent(studentList.size(),"안성원","181213",95 , 56));
		studentList.add(new ComputerStudent(studentList.size(),"오태훈","182330",95 , 98));
		studentList.add(new KoreanStudent(studentList.size(),"이동호","171518",100 , 88));
		studentList.add(new KoreanStudent(studentList.size(),"조성욱","172350",89 , 95));
		studentList.add(new ComputerStudent(studentList.size(),"최태평","171290",83 , 56));

		HashMap<String,Integer> idxfinder = Student.idxfinder;

		studentList.get(idxfinder.get("181213")).setDanceScore(60);
		studentList.get(idxfinder.get("171518")).setDanceScore(70);
		studentList.get(idxfinder.get("171290")).setDanceScore(80);
		
		
		ScorePrint.koreanscore(studentList);
		ScorePrint.mathscore(studentList);
		ScorePrint.dancescore(studentList);

		
	}

}

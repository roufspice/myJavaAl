package myJavaAl_20200609;

public class GradeCaculatorDemo {
	public static void main(String[] args) {
		
		
		 	GradeCaculator gradeCalc = new GradeCaculator("김신의", 4.0, 100);

		 	gradeCalc.addCourse(new Course("OOP", Course.CREDIT_MAJOR, "A+"));
	        gradeCalc.addCourse(new Course("신호와시스템", Course.CREDIT_MAJOR, "A"));
	        gradeCalc.addCourse(new Course("해석학", Course.CREDIT_MAJOR, "B+"));
	        gradeCalc.addCourse(new Course("확률", Course.CREDIT_MAJOR, "A+"));
	        gradeCalc.addCourse(new Course("스포츠댄스", Course.CREDIT_GENERAL, "A"));
	        
	       
	        
	        gradeCalc.print();
//	        System.out.println(gradeCalc.getCredit());
	        
		
	}

}

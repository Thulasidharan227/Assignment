package studentdivision;

public class StudentDivision {
	
	public static void studentDivision(int subject1, int subject2, int subject3, int subject4, int subject5) {
		int AverageMark=(subject1+subject2+subject3+subject4+subject5)/5;
		if(AverageMark>=60) {
			System.out.println("First division");
		}
		if(AverageMark>=50&&AverageMark<=59) {
			System.out.println("Second division");
		}
		if(AverageMark>=40&&AverageMark<=49) {
			System.out.println("Third division");
		}
		if(AverageMark<40) {
			System.out.println("Fail");
		}
		
	}
	
	public static void main(String[] args) {
		studentDivision(98, 56, 91, 64, 29);
	}

	
}

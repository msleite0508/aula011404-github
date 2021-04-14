package entities;

public class Student_fix8 {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double notaFinal() {
		return grade1 + grade2 + grade3;
	}
	
	public double missingPoints() {
		if(notaFinal() < 60) {
			return 60 -notaFinal(); 
		}else {
			return 0.0;
		}
		
	}
	
}

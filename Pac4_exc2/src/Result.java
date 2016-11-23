import java.text.DecimalFormat;


public class Result extends Student implements IExam {
	private Exam exam;
	
	public Result(String name, int roll_no, int mark1, int mark2) {
		super(name, roll_no, mark1, mark2);
		this.exam = new Exam();
		
	}
	
	public void percent_cal(){
		// With delegate we could do:
		//this.exam.percent_cal();
		
		DecimalFormat myFormat = new DecimalFormat("#.00");
		double result = ((this.getMark1() + this.getMark2())*100)/200;
		System.out.println("Percentage: "+ result +"%" );
	
	}
	
	
	

}

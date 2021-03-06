
public class Student {
	private final String NL = System.getProperty("line.separator");
	private String name;
	private int roll_no;
	private int mark1;
	private int mark2;
	/**
	 * @param name
	 * @param roll_no
	 * @param mark1
	 * @param mark2
	 */
	public Student(String name, int roll_no, int mark1, int mark2) {
		this.name = name;
		this.roll_no = roll_no;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the roll_no
	 */
	public int getRoll_no() {
		return roll_no;
	}
	/**
	 * @return the mark1
	 */
	public int getMark1() {
		return mark1;
	}
	/**
	 * @return the mark2
	 */
	public int getMark2() {
		return mark2;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param roll_no the roll_no to set
	 */
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	/**
	 * @param mark1 the mark1 to set
	 */
	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}
	/**
	 * @param mark2 the mark2 to set
	 */
	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	
	
	public void display() {
		System.out.println(		
				"Name of student: " + name +NL+
				"Roll No. of Student:" + roll_no +NL+
				"Marks of Subject1: "+ mark1 +NL+
				"Marks of Subject2: " + mark2 
		);
	}
	
	
	
}

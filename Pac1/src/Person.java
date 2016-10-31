/*
 * Class Definition
 */
public class Person {
	/*Attributes*/
	private String name;
	private Integer age;
	
	/* METHOD CONSTRUCTOR */
	
	public Person(String name, Integer age){
		this.name = name;
		this.age = age;
	}
	
	/* METHODS */
		/* Getters*/
		public String getName(){
			return this.name;
		}
		
		public Integer getAge(){
			return this.age;		
		}
		/* Setters*/
		public void setAge(Integer age){
			this.age = age;
		}
		public void setName(String name){
			this.name = name;
		}
		
	
	
	
}

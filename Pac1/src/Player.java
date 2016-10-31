/*
 * Class Definition
 */
public class Player extends Person{
	/*Attributes*/
	private Integer number;
	private String playerPosition;
	
	/* METHOD CONSTRUCTOR */
	public Player(String name, Integer age, Integer number, String playerPosition) {
		super(name,age);
		this.number = number;
		this.playerPosition = playerPosition;
	}
	
	/* METHODS */
		/* Getters*/
		public Integer getNumber(){
			return this.number;
		}
		
		public String getPlayerPosition(){
			return this.playerPosition;
		}
		
		/* Setters*/
		public void setNumber(Integer number){
			this.number = number;
		}
		public void setPlayerPosition(String position){
			this.playerPosition = position;
		}
}

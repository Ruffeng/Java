import java.util.Date;



/*
 * Class Definition
 */
public class Team {
	/*Attributes*/
	private String name;
	private String city;
	private Date since;
	
	/*Relations */
	private Player[] players;
	
	/* METHOD CONSTRUCTOR */
	public Team(String name, String city, Date since){
		this.name = name;
		this.city = city;
		this.since = since;
	}
	/* METHODS */
		/* GETTER */
		public String getName(){
			return this.name;
		}
		public String getCity(){
			return this.city;
		}
		public Date getSince(){
			return this.since;
		}
		
		/* SETTER*/
		public void setName(String name){
			this.name = name;
		}
		public void setCity(String city){
			this.city = city;
		}
		public void setSince(Date since){
			this.since = since;
		}
	
}

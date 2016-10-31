import java.util.Date;
/*
 * Class Definition
 */
public class Score {
	/*Attributes*/
	private Date when;
	/*Relations*/ 
	private Player player;
	private Match match;
	
/* METHOD CONSTRUCTOR */
	
	public Score(Date when){
		this.when = when;
	}
	
	/* METHODS */
	
		/* Getters*/
		public Date getWhen(){
			return this.when;
		}
	
		/* Setters*/
		public void setWhen(Date when){
			this.when = when;
		}
}

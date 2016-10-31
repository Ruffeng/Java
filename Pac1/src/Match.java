import java.util.Date;
/*
 * Class Definition
 */
public class Match {
	/*Attributes*/
	private Date date;
	private Team localTeam;
	private Team visitorTeam;
	
	/*Relations */
	private Team[] teams;
	
	/* METHOD CONSTRUCTOR */
	public Match(Date date, Team local, Team visitor ){
		this.date = date;
		this.localTeam = local;
		this.visitorTeam = visitor;
	}
	/* METHODS */
		
		/* Getters */
		public Date getDate(){
			return this.date;
		}
		public Team getLocal(){
			return this.localTeam;
		}
		public Team getVisitor(){
			return this.visitorTeam;
		}
		
		/* Setters */
		public void setDate(Date date){
			this.date = date;	
		}
		public void setLocalTeam(Team local){
			this.localTeam = local;	
		}
		public void setVisitorTeam(Team visitor){
			this.visitorTeam = visitor;	
		}
		
		/* Other */
		public Team getWinner(){
			// Actions to return the winner Team variable
			return winner; 
		}
		public Team getLoser(){
			// Actions to return the loser Team variable
			return loser; 
		}
		public Integer getScore(Team t){
			// Actions to return the Score Team variable
			return score; 
		}
		public Integer[] getScores(){
			// Actions to return the Scores of each team: scores = [localScore, visitorScore]
			return scores;
		}
		
	
}

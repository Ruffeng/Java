package edu.uoc.dpoo;

import java.util.ArrayList;
import java.util.List;

public class Organizer extends User {
    private List<Competition> competitions;
    
    public Organizer(User user) {
        super(user);
        // Initialize the list of competitions
        competitions = new ArrayList<Competition>();                
    }

    public void removeSubmission(Submission submission) {
        /* NOT IMPLEMENTED */
    }

    public boolean sendMessage(Competition competition, String subject, String message) {
        /* NOT IMPLEMENTED */
        return false;
    }

    public Competition newCompetition(String title, float target) {        
    	Platform platform = this.getPlatform();
    	Competition competition = new Competition(platform,this, title, target);
    	platform.registerCompetition(competition);
    	//this.competitions.add(competition);
    	return competition;
    }

    public void closeCompetition(Competition competition) {
        competition.close();
    }
    
    public List<Competition> getCompetitions() {        
    	updateCompetitions();
    	return this.competitions;
    }
    
    private void updateCompetitions() {
    	this.competitions =  new ArrayList<Competition>();
    	for(Competition competition: this.getPlatform().getOpenCompetitions()){
    		if (competition.getOwner().equals(this)){
    			this.competitions.add(competition);
    		}
    	}
    }
   
}

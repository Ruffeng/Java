package edu.uoc.dpoo;

import java.util.ArrayList;
import java.util.List;

public class Organizer extends User {
    private List<Competition> competitions;
    
    public Organizer(User user) {
        super(user);
        // Initialize the list of competitions
        updateCompetitions();
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
    	addCompetition(competition);
    	return competition;
    }

    public void closeCompetition(Competition competition) {
        competition.close();
        updateCompetitions();
    }
    
    public List<Competition> getCompetitions() {        
    	return this.competitions;
    }
    
    /**
     * PRIVATE METHODS
     */
    private void updateCompetitions() {
    	clearCompetitionsList();
    	iterateCompetitions();
    }
    private void clearCompetitionsList(){
    	this.competitions =  new ArrayList<Competition>();
    }
    private void iterateCompetitions(){
    	for(Competition competition: this.getPlatform().getOpenCompetitions()){
    		checkEquals(competition);
    	}
    }
    private void checkEquals(Competition competition){
    	if (competition.getOwner().equals(this)){
			addCompetition(competition);
		}
    }
    private void addCompetition(Competition competition){
    	this.competitions.add(competition);
    }
    
}

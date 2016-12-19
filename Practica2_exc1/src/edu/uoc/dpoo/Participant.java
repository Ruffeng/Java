package edu.uoc.dpoo;

import java.util.List;

public class Participant extends User {

    private List<Submission> submissions;
    
    public Participant(User user) {
        super(user);      
    }

    public Submission submitPrediction(Competition competition, float prediction) {
        if(competition.isOpen()){
        	// Here the code to add a submission
        }
    	return null;
    }
    
    public List<Submission> getSubmissions() {        
        return submissions;
    }

}

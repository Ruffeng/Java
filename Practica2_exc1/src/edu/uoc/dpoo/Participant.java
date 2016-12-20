package edu.uoc.dpoo;

import java.util.ArrayList;
import java.util.List;

public class Participant extends User {

    private List<Submission> submissions;
    
    public Participant(User user) {
        super(user);    
        this.submissions = new ArrayList<Submission>();
    }

    public Submission submitPrediction(Competition competition, float prediction) {
        Submission submission = checkCompetition(competition,prediction);
        if(submission != null) updateSubmissions(submission,competition);
        return submission;
    }
    
    public List<Submission> getSubmissions() {        
        return submissions;
    }
    
    /**
     * Private Methods
     */
    private Submission createSubmission(Competition competition, float prediction){
    	return new Submission(this,competition,prediction);
    }
    private Submission checkCompetition(Competition competition, float prediction){
    	return competition.isOpen() ? createSubmission(competition,prediction) : null;
    }
    private void updateSubmissions(Submission submission, Competition competition){
    	// I put all submissions under control on Platform.
    	this.getPlatform().addSubmission(submission);
    	// Now I update the submissions from specific competition
    	competition.getSubmissions().add(submission);
    	// Finally I update submissions from a specific participant
    	submissions.add(submission);
    }
}

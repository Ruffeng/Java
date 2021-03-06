package edu.uoc.dpoo;

import java.util.Date;

public class Submission implements Comparable<Submission> {
    private Integer id;
    private Participant participant;
    private Competition competition;    
    private SubmissionStatus status;
    private Date submittedAt;
    private float prediction;
    private float error;
      
    public Submission(Participant participant, Competition competition, float prediction) {
    	this.id = addId(participant);
    	this.participant=participant;
    	this.competition = competition;
    	this.prediction = prediction;
    	this.submittedAt = new Date();
    	this.status = SubmissionStatus.PENDING;
    	
    }
    
    public SubmissionStatus getStatus() {       
        return status;
    }
    public void setStatus(SubmissionStatus status) {        
        this.status = status;        
    }
    
    public float getError() {        
        return this.error;
    }
    
    public void setError(float error) {        
        this.error = error;        
    }
    
    public float getPrediction() {        
        return prediction;
    }
    
    public Participant getParticipant() {        
        return this.participant;
    }
    
    /**
     * PRIVATE METHODS
     */
    private Integer addId(Participant participant){
    	Platform platform = participant.getPlatform();
    	return (platform.getNumSubmissions()+1) ;
    }

	@Override
	public int compareTo(Submission s1) {
		  return this.getError() < s1.getError() ? -1 
		             : this.getError() > s1.getError() ? 1 
		             : 0;
	}
}

package edu.uoc.dpoo;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.lang.Math.abs;

public class Competition {
    private Platform platform;
    private Integer id;
    private String title;
    private float target;
    private Boolean isActive;
    private Organizer owner;
    private List<Submission> submissions;
    private List<CompetitionListener> competitionListener;
      
    public Competition(Platform platform, Organizer owner, String title, float target) {
    	this.id = (platform.getNumCompetitions())+1;
    	this.platform = platform;
        this.owner = owner;
        this.title= title;
        this.target= target;
        this.isActive=true;
        this.submissions = new ArrayList<Submission>();
        this.competitionListener = new ArrayList<CompetitionListener>();
    }

    public float evaluate(Submission submission) {               
    	submission.setError(abs(this.target -submission.getPrediction()));
    	submission.setStatus(SubmissionStatus.DONE);
    	notifyListeners();
    	return submission.getError();
    }

    public Organizer getOwner() {        
        return owner;
    }
    
    public Boolean isOpen() {        
        return isActive;
    }
        
    public void close() {
        this.isActive = false;
        for(CompetitionListener listener: competitionListener){
        	listener.onCompetitionClosed();
        }
    }
    
   
    public Participant getWinner() {       
        return null;
    }

    public void sendMessage(String subject, String message) {

    }
    
    public List<Submission> getSubmissions() {        
    	List<Submission> submissionsSorted = new ArrayList<Submission>();
        List<Submission> submissionsSortedPendingDone = new ArrayList<Submission>();
        for(Submission submission : submissions){
            if(submission.getStatus()==SubmissionStatus.DONE) {
              submissionsSorted.add(submission);
              } 
          }
            for(Submission submission : submissions){
            if(submission.getStatus()!=SubmissionStatus.DONE) {
              submissionsSortedPendingDone.add(submission);
              } 
          }
        
        
        
        System.out.println("JUST SUBMISSIONS----------------------------");
         for(Submission submission: submissionsSorted){
             System.out.println(submission.getStatus()+" - "+String.format("%.19f", new BigDecimal(submission.getError())));
             
           }    
    	Collections.sort(submissionsSorted );
    	Collections.sort(submissionsSortedPendingDone );
    	for(Submission submission: submissionsSortedPendingDone){
            submissionsSorted.add(submission);
          }
    	
    	
    	
    	 System.out.println("JUST after----------------------------");
         for(Submission submission: submissionsSorted){
             System.out.println(submission.getStatus()+" - "+String.format("%.19f", new BigDecimal(submission.getError())));
             
           }    
    	return submissionsSorted;        
    }
    
    public List<Participant> getParticipants() {
        return null;
    }
    
    public void evaluateAll() {
       for(Submission submission: submissions){
    	   checkIfPending(submission);
       }
    }
        
    public void addListener(CompetitionListener listener) {
    	this.competitionListener.add(listener);
    }

    public void onCompetitionClosed(){
    	// Notifying the listeners
    }

    public void onNewEvaluation(){
    	
    	// Notifying the listeners
    }
    public void addSubmissions(Submission submission){
    	this.submissions.add(submission);
    }
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((isActive == null) ? 0 : isActive.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		result = prime * result
				+ ((platform == null) ? 0 : platform.hashCode());
		result = prime * result
				+ ((submissions == null) ? 0 : submissions.hashCode());
		result = prime * result + Float.floatToIntBits(target);
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Competition other = (Competition) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isActive == null) {
			if (other.isActive != null)
				return false;
		} else if (!isActive.equals(other.isActive))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		if (platform == null) {
			if (other.platform != null)
				return false;
		} else if (!platform.equals(other.platform))
			return false;
		if (submissions == null) {
			if (other.submissions != null)
				return false;
		} else if (!submissions.equals(other.submissions))
			return false;
		if (Float.floatToIntBits(target) != Float.floatToIntBits(other.target))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
    
    /**
     * Private methods
     */
    private void checkIfPending(Submission submission){
    	if(submission.getStatus()==SubmissionStatus.PENDING){
    		evaluate(submission);   		
    	}
    }
	private void notifyListeners(){
		
		for(CompetitionListener listener: competitionListener){
			
			listener.onNewEvaluation();
		}
	}


	       
}

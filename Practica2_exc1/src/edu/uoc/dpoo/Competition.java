package edu.uoc.dpoo;

import java.util.ArrayList;
import java.util.List;

public class Competition {
    private Platform platform;
    private Integer id;
    private String title;
    private float target;
    private Boolean isActive;
    private Organizer owner;
    private List<Submission> submissions;
      
    public Competition(Platform platform, Organizer owner, String title, float target) {
        // Missing: ID in platform, Default status isActive.
    	this.id = (platform.getNumCompetitions())+1;
    	this.platform = platform;
        this.owner = owner;
        this.title= title;
        this.target= target;
        this.isActive=true;
        this.submissions = new ArrayList<Submission>();
    }

    public float evaluate(Submission submission) {               
        return 0.0f;
    }

    public Organizer getOwner() {        
        return owner;
    }
    
    public Boolean isOpen() {        
        return isActive;
    }
        
    public void close() {
        
    }
    
    public boolean equals(Object obj) {                
        return false; 
    }
            
    public Participant getWinner() {       
        return null;
    }

    public void sendMessage(String subject, String message) {

    }
    
    public List<Submission> getSubmissions() {        
        return submissions;        
    }
    
    public List<Participant> getParticipants() {
        return null;
    }
    
    public void evaluateAll() {
       
    }
        
    public void addListener(CompetitionListener listener) {
        
    }
}

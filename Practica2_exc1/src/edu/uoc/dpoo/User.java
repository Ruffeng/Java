package edu.uoc.dpoo;


import java.util.ArrayList;
import java.util.List;

public class User implements CompetitionListener {
    private Platform platform;
    private String username;
    private String password;
    private String fullName;
    private List<Message> inbox;
    private List<Message> outbox;
    private List<Submission> submissions;
  
    public User (Platform platform, String username, String password, String fullName) {
        /**
         * PR1 Ex 2.1: User constructor needed for user registration
        */
        this.platform = platform;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.inbox = new ArrayList<Message>();
        this.outbox = new ArrayList<Message>();
        this.submissions = new ArrayList<Submission>();
    }
    
    public User (User obj) {
        /**
         * PR1 Ex 2.3: Implementation of the copy constructor
        */
        this.platform = obj.platform;
        this.username = obj.username;
        this.password = obj.password;
        this.fullName = obj.fullName;
        this.inbox = obj.inbox;
        this.outbox = obj.outbox;
        this.submissions = obj.submissions;
    }
                
    public Boolean checkPassword(String password) {   
        /**
         * PR1 Ex 2.2: Implementation of checkPassword, required by login
        */
        return this.password.equals(password);        
    }

    public Organizer asOrganizer() {   
        /**
         * PR1 Ex 2.3: Create a new object for the Organizer Role
        */
        return new Organizer(this);
    }

    public Participant asParticipant() {
        /**
         * PR1 Ex 2.3: Create a new object for the Participant Role
        */
        return new Participant(this);
    }

    public String getUserName() {
        /**
         * PR1 Ex 2.1: Required by method findUser
        */
        return this.username;
    }
    
    public String getFullName() {
        /**
         * PR1 Ex 2.1: Required by test
        */
        return this.fullName;
    }

    
	public String toString() {
		return fullName +"<" + username +  ">";
	}

	public boolean equals(Object obj) {
        /**
         * PR1 Ex 2.2: Required by test
        */
        if(obj==null) {
            return false;
        }        
        if (obj instanceof User) {
            User user = (User) obj;
            if (!this.username.equals(user.username) || !this.password.equals(user.password) || !this.fullName.equals(user.fullName)) {
                return false;
            }        
            // Additional checks can be added
        } else {
            return false;
        }
        
        return true;
    }

    public List<Message> getMessages() {        
        List<Message> messagesNotReaded=new ArrayList<Message>();
    	for(Message message: this.getInbox()){
        	if (message.getStatus().toString() == "PENDING"){
        		messagesNotReaded.add(message);
        	}
        	
        }
    	return messagesNotReaded;
    }
    
    public Message sendMessage(String to, String subject, String message) throws CompetitionException {        
    	return this.platform.sendMessage(this, to, subject, message); 
    }
        
    public List<Competition> myCompetitions() {
        return null;
    }

    public List<Message> getInbox() {        
        return this.inbox;
    }

    public List<Message> getOutbox() {        
        return this.outbox;
    }    
    
    public Platform getPlatform() {        
        return this.platform;
    }
    
    public void onNewEvaluation() {
        
    }
    public void onCompetitionClosed() {
        
    }
}

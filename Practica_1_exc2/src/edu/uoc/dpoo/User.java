package edu.uoc.dpoo;

import java.util.ArrayList;

/**
 * @author Ruffeng
 * 
 */
public class User {
	/**
	 * Attributes for User class
	 */
	private String username;
	private String password;
	private String fullName;
	/* Attribute to track all competitions that has played as a participant */
	private ArrayList<Participant> participants; 
	/* Attribute to track all competitions that has played as a organizer */
	private ArrayList<Organizer> organizers; 

	/**
	 * Constructor method for User class
	 * 
	 * @param user
	 *            the username
	 * @param pass
	 *            the password
	 * @param fullName
	 *            the fullName
	 */
	public User(String user, String pass, String fullName) {
		this.username = user;
		this.password = Encrypt.password(pass);
		this.fullName = fullName;
		this.participants = new ArrayList<Participant>();
		this.organizers = new ArrayList<Organizer>();
	}
	
	/**
	 * Method to create a new user, based on the user sent through parameters
	 * @param user
	 */
	public User(User user) {
			this.username = user.getUsername();
			this.password = user.getPassword();
			this.fullName = user.getFullName();
			this.participants = new ArrayList<Participant>();
			this.organizers = new ArrayList<Organizer>();
	}
	/**
	 * Constructor that doesn't digest a password which is already digested.
	 * Expecting an extra argument that is a boolean.
	 * 
	 * This constructor only will have run when method asParticipant or asOrganizer is invoked.
	 * To add an extra point of security and robust, we check the status of the boolean, if it's 
	 * true it won't digest again the password 
	 * @param user
	 * @param pass
	 * @param fullName
	 * @param checked
	 */
	public User(String user, String pass, String fullName, boolean checked) {
		this.username = user;
		this.password = (checked) ? pass: Encrypt.password(pass) ;
		this.fullName = fullName;
		this.participants = new ArrayList<Participant>();
		this.organizers = new ArrayList<Organizer>();
	}


	/**
	 * ----------------------------------- Public methods for User class
	 * ----------------------------------
	 */

	

	/**
	 * Getter of username
	 * 
	 * @return String
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * Getter of password
	 * 
	 * @return String
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * Getter of fullname
	 * 
	 * @return String
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * Method that verifies if a user password is correct or not.
	 * 
	 * @param password
	 * @return boolean
	 */
	public boolean checkPassword(String password) {
		String passwordDigest = Encrypt.password(password);		
		boolean result = (this.password.equals(passwordDigest)) ? (true):(false);
		return result;
	}

	/**
	 * Return all messages from the user
	 * 
	 * @return Message
	 */
	public Message getMessages() {
		return null;
	}

	/**
	 * Return all competitions from the user
	 * 
	 * @return Competition
	 */
	public ArrayList<Competition> myCompetitions() {
		
		return null;
	}

	/**
	 * Create a new Organizer object.
	 * 
	 * @return Organizer
	 */
	public Organizer asOrganizer() {
		
		/* Taking the password already digest, so it's not necessary digest it again */
		Organizer organizer = new Organizer(getUsername(),getPassword(),getFullName(),true);
		this.organizers.add(organizer);
		return organizer;
	}

	/**
	 * Create a new Participant object.
	 * 
	 * @return Participant
	 */
	public Participant asParticipant() {
		
		/* Taking the password already digest, so it's not necessary digest it again */
		
		Participant participant = new Participant(getUsername(),getPassword(),getFullName(),true);
		this.participants.add(participant);
		return participant;
	}

	/**
	 * Method to send a message to another user.
	 * 
	 * @param to
	 * @param subject
	 * @param message
	 * @return Message
	 */
	public Message sendMessage(String to, String subject, String message) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [username=" + username + ", fullName=" + fullName + "]";
	}

	

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}



}

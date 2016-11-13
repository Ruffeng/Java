package edu.uoc.dpoo;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
	 * Return all competition that the user has been, or is, as organizer.
	 * 
	 * @return Organizer
	 */
	public Organizer asOrganizer() {
		return null;
	}

	/**
	 * Return all competition that the user has been, or is, as participant.
	 * 
	 * @return Participant
	 */
	public Participant asParticipant() {
		
		String name = getUsername();
		/* Taking the password already digest, so it's not necessary digest it again */
		String password = getPassword();
		String fullname = getFullName();
		
		Participant participant = new Participant(name,password,fullname);
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
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

}
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
		this.password = pass;
		this.fullName = fullName;
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
		return false;
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
		return null;
	}

	/**
	 * Create a new Participant object.
	 * 
	 * @return Participant
	 */
	public Participant asParticipant() {
		return null;
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

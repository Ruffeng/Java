package edu.uoc.dpoo;
import java.util.ArrayList;

public class Participant extends User {
	
	private ArrayList<Submission> submissions;
	private User user;

	/**
	 * Constructor of PArticipants class that inheritates from Users
	 * 
	 * @param user
	 * @param pass
	 * @param fullName
	 */
	public Participant(String user, String pass, String fullName,boolean digested) {
			super(user,pass,fullName,digested);	
		}

	public Submission submitPrediction(Competition competition, Float prediction) {
		return null;
	}

	public ArrayList<Submission> getSubmissions() {
		return null;
	}

}

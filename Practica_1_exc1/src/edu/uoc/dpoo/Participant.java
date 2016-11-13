package edu.uoc.dpoo;
import java.util.ArrayList;

public class Participant extends User {
	
	private ArrayList<Submission> submissions;

	/**
	 * Constructor of PArticipants class that inheritates from Users
	 * 
	 * @param user
	 * @param pass
	 * @param fullName
	 */
	public Participant(String user, String pass, String fullName) {
			super(user,pass,fullName);	
		}

	public Submission submitPrediction(Competition competition, Float prediction) {
		return null;
	}

	public ArrayList<Submission> getSubmissions() {
		return null;
	}

}

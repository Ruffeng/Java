package edu.uoc.dpoo;
public class Organizer extends User {

	public Organizer(String user, String pass, String fullName) {
		super(user, pass, fullName);
	
	}

	public void removeSubmission(Submission submission) {
	}

	public boolean sendMessage(Competition competition, String subject,
			String message) {
		return false;
	}

	public Competition newCompetition(String title, Float target) {
		return null;
	}

	public void closeCompetition(Competition competition) {
	}

}

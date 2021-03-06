package edu.uoc.dpoo;
import java.util.ArrayList;

public class Competition {

	private Organizer organizer;
	private ArrayList<Submission> submissions;
	private ArrayList<Participant> participants;
	private int id;
	private String title;
	private float target;
	private boolean isActive;

	public float evaluate(Submission submission) {
		return 0;
	}

	public Organizer getOwner() {
		return null;
	}

	public Participant getWinner() {
		return null;
	}

	public void sendMessage(String subject, String message) {

	}

	public void close() {

	}

	public boolean isOpen() {
		return false;
	}

	public ArrayList<Submission> getSubmissions() {
		return null;
	}

	public ArrayList<Participant> getParticipants() {
		return null;
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
		if (id != other.id)
			return false;
		if (isActive != other.isActive)
			return false;
		if (organizer == null) {
			if (other.organizer != null)
				return false;
		} else if (!organizer.equals(other.organizer))
			return false;
		if (participants == null) {
			if (other.participants != null)
				return false;
		} else if (!participants.equals(other.participants))
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

}

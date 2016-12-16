package edu.uoc.dpoo;
import java.util.Date;

public class Message {
	/**
	 * Attributes for Message Class
	 */
	private User from;
	private User to;
	private String subject;
	private String message;
	private MessageStatus status;
	private Date createdAt;

	/**
	 * Methods from Message class Getters
	 */

	/**
	 * @return the from
	 */
	public User getFrom() {
		return null;
	}

	/**
	 * @return the to
	 */
	public User getTo() {
		return null;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return null;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return null;
	}

	/**
	 * @return the status
	 */
	public MessageStatus getStatus() {
		return this.status;
	}

	/**
	 * @return the createdAt
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * Method to show the cotent of the message
	 */
	public void read() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Message [from=" + from + ", to=" + to + ", subject=" + subject
				+ ", message=" + message + ", createdAt=" + createdAt + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
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
		Message other = (Message) obj;
		if (createdAt == null) {
			if (other.createdAt != null)
				return false;
		} else if (!createdAt.equals(other.createdAt))
			return false;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		if (to == null) {
			if (other.to != null)
				return false;
		} else if (!to.equals(other.to))
			return false;
		return true;
	}

}

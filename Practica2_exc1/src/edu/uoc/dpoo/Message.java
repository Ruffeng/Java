package edu.uoc.dpoo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {

    private String subject;
    private String message;
    private MessageStatus status;
    private Date createdAt;
    private User to;
    private User from;
    
    public Message (User from, User to, String subject, String message) {
        this.to = to;
        this.from = from;
        this.subject = subject;
        this.message = message;
        this.status= MessageStatus.PENDING;
        this.createdAt = new Date();
        
        
    }

    public void read() {
       this.status = MessageStatus.READ;
    }
    
    public MessageStatus getStatus() {        
        return this.status;
    }

   
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() { 
		 SimpleDateFormat date_formatted = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		return "{date: "+date_formatted.format(this.createdAt)+" ,from: "+this.from.toString()+ 
				", to: "+this.to.toString()+
				", subject: "+this.subject+
				", status: "+this.status+"}"; 
	
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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
		if (status != other.status)
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

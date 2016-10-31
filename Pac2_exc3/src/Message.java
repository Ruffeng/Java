import java.util.Date;

/**
 * Class Message to manage all the messages from Customer class
 * Is necessary to add Java.Utils to work with Date.
 * 
 */
public class Message {
	/**
	 * Attributes
	 */
	private Date date;
	private String summary;
	private String text;
	private Integer priority;
	private Boolean read;
	private Customer sender;
	private Customer receiver;
	
	
	/**
	 * Constructor that receives
	 * @param read
	 * @param sender
	 */
	public Message(Customer receiver, Customer sender) {
		this.sender = sender;
		this.receiver = receiver;
		this.summary = "NA";
		this.priority = 0;
		this.text = "NA";
		this.date = null;
		this.read = false;
	}
	/**
	 * Constructor that receives
	 * @param read
	 * @param sender
	 * @param priority
	 * @param message
	 */
	public Message(Customer receiver, Customer sender,Integer priority, String message) {
		this.sender = sender;
		this.receiver = receiver;
		this.priority = checkPriority(priority);
		this.summary = makeSummary(message);
		this.text = message;
		this.date = new Date();
		this.read = false;
	}
	
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}
	/**
	 * @param summary the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	/**
	 * @return the priority
	 */
	public Integer getPriority() {
		return priority;
	}
	/**
	 * @param priority the priority to set
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	/**
	 * @return the read
	 */
	public Boolean getRead() {
		return read;
	}
	/**
	 * @param read the read to set
	 */
	public void setRead(Boolean read) {
		this.read = read;
	}
	/**
	 * @return the sender
	 */
	public Customer getSender() {
		return sender;
	}
	/**
	 * @param sender the sender to set
	 */
	public void setSender(Customer sender) {
		this.sender = sender;
	}
	/**
	 * @return the receiver
	 */
	public Customer getReceiver() {
		return receiver;
	}
	/**
	 * @param receiver the receiver to set
	 */
	public void setReceiver(Customer receiver) {
		this.receiver = receiver;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Message [ sendTo=" + receiver.getName() + ", sendFrom="
				+ sender.getName() + ", summary="+ summary +" ,priority="+ priority+" ,text=" + text + ", date="+ date +" ,read="+ read +"]";
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
		Message other = (Message) obj;
		if (receiver == null) {
			if (other.receiver != null)
				return false;
		} else if (!receiver.equals(other.receiver))
			return false;
		if (sender == null) {
			if (other.sender != null)
				return false;
		} else if (!sender.equals(other.sender))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}
	/**
	 * PRIVATE METHODS
	 */
	/**
	 * We check if the priority is greater than 10, if it is, return just 10.
	 * @param priority
	 * @return Integer number
	 */
	private Integer checkPriority(Integer priority){
		if (priority > 10){
			return 10;
		}
		return priority;
	}
	/**
	 * Split the original message to take until first dot ".", then return as summary
	 * @param message
	 * @return String with the summary
	 */
	private String makeSummary(String message){
		String[] messageParts = message.split("\\."); // String array, each element is text between dots

		String summaryConstructor = messageParts[0];
		return summaryConstructor;
	}
	
}

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
	 * When we create a new object we expect at least, these parameters in this order:
	 * @param sender
	 * @param receiver
	 * @param text
	 */
	public Message( Customer receiver, Customer sender, String text) {
		this.sender = sender;
		this.receiver = receiver;
		this.text = text;
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
				+ sender.getName() + ", text=" + text + "]";
	}
	
}

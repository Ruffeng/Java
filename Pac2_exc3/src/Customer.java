

/**
 * Class Customer with all information about customer
 * 
 *
 */
public class Customer {
	/* Attributes */
	private String cip;
	private String name;
	private City city;
	/**
	 * Constructor from Customer
	 * @param cip
	 * @param name
	 */
	public Customer(String name, String cip,City city) {
		this.cip = cip;
		this.city = city;
		this.name = name;
	}
	/**
	 * @return the cip
	 */
	public String getCip() {
		return cip;
	}
	/**
	 * @param cip the cip to set
	 */
	public void setCip(String cip) {
		this.cip = cip;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the city
	 */
	public City getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [name="+ name +" id=" + cip + ", city=" + city.getName()
				+ "]";
	}
	
	
	
	
}

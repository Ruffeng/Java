/**
 * 
 */

/**
 * Class City with all cities stored
 * 
 *
 */
public class City {
	/**
	 * Attributes from class City
	 */
	private String name;
	
	/**
	 * Constructor from class City
	 * @param name
	 */
	public City(String name) {
		this.name = name;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "City [name=" + name + "]";
	}
}

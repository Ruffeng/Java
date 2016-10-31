import java.io.*;
/**
 * Original file from Professorat OOP, Universitat Oberta de Catalunya.
 * This file is being modified with a more JavaDoc information.
 * Professorat OOP released version 1.0.
 * Currently this is the version 1.1 
 * @author <p> Ruben Suet</p>
 * @version <p>1.1</p>
 */
public class Customer{
	// Main class on this file
	/** The cip attribute. Belongs to Customer class*/
	private String cip;
	
	/** The name attribute. Belongs to Customer class */
	private String name;
	
	/** The bonus number attribute. Belongs to Customer class */
	private String numberGrantedBonus;
	
	/** The date of Driving Licence attribute. Belongs to Customer class */
	private String dateDrivingLicence;
	
	
	/**
	 * Instantiates a new Customer constructor. We are expecting of 4 params:
	 *
	 * @param cip the cip
	 * @param name the name
	 * @param numberGrantedBonus the numberGrantedBonus
	 * @param dateDrivingLicence the date
	 */
	public Customer(String cip, String name, String numberGrantedBonus, String date) {
		this.cip = cip;
		this.name = name;
		this.numberGrantedBonus=numberGrantedBonus;
		this.dateDrivingLicence=date;
	}
	

	/**
	 * Getter of cip. No params expected.
	 * @return the cip
	 */
	public String getCip() {
		return cip;
	}

	/**
	 * Setter of cip. No return expected.
	 * @param cip the cip to set
	 */
	public void setCip(String cip) {
		this.cip = cip;
	}

	/**
	 * Getter of name. No params expected.
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter of name. No return expected.
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * Getter of numberGrantedBonus. No params expected.
	 * @return the numberGrantedBonus
	 */
	public String getNumberGrantedBonus() {
		return numberGrantedBonus;
	}


	/**
	 * Setter of numberGrantedBonus. No return expected.
	 * @param numberGrantedBonus the numberGrantedBonus to set
	 */
	public void setNumberGrantedBonus(String numberGrantedBonus) {
		this.numberGrantedBonus = numberGrantedBonus;
	}


	/**
	 * Getter of dateDrivingLicense. No params expected.
	 * @return the dateDrivingLicence
	 */
	public String getDateDrivingLicence() {
		return dateDrivingLicence;
	}


	/**
	 * Setter of dateDrivingLicence. No return expected.
	 * @param dateDrivingLicence the dateDrivingLicence to set
	 */
	public void setDateDrivingLicence(String dateDrivingLicence) {
		this.dateDrivingLicence = dateDrivingLicence;
	}


	/**
	 * 
	 * Here we are Computing credits. No params expected.
	 *
	 * @return the float corresponding to the percentage of approved credits
	 */
	public float computeGrantedBonus(){
		return ((float)((Integer.parseInt(this.getNumberGrantedBonus())*100)/360));
		
	}

	/**
	 * We are computing the ages that customer has the driver license since his/her year
	 * until nowadays ( 2016). No params expected
	 *
	 * @return the int corresponding to the number of ages from drivingLicence
	 */
	public int computeAges(){ 		
		int age=Integer.parseInt((this.getDateDrivingLicence()).substring(6));
		return 2016-age;		
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/**
	 * Overriding the toString method to return a custom string message.
	 * @return the String with all attributes about that object,
	 */
	@Override
	public String toString() {
		return "Customer [cip=" + cip + ", name=" + name + ", numberGrantedBonus=" + this.computeGrantedBonus() + "% , ages from DrivingLicence="
				+ this.computeAges() + "]";
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	/**
	 * Overriding the equals method to return a boolean when we compare.
	 * @param Object the object to compare then with the original objecte ( this)
	 * @return boolean depending of of the comparison.
	 */
	@Override
	public boolean equals(Object obj) {	
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof Customer == false)
			return false;
		Customer other = (Customer) obj;
		if (cip == null) {
			if (other.getCip() != null)
				return false;
		} else if (!cip.equals(other.getCip()))
			return false;		
		return true;
	}

	

	/**
	 * Main entry to run our program.
	 * @param args :4 String arguments inside an array. If it's less it will arise an error.
	 */
	public static void main(String[] args) {
		   Customer cust_1=null;
		   boolean w=false;
			// check arguments length
			    if ((args.length < 2)||(args.length%4!=0)) {
			        System.out.println("ERROR. Application needs almost two arguments for each Customer to be created");
			        System.out.println("Usage:");
			        System.out.println(" java Customer <arg1> <arg2> ... <argn>");
			        System.out.println(" arg1 cip and arg2 name for each new Customer.");

			        System.out.println();
			        return;
			    }
			    else{
			    	
			    	int i=0;
			    	while (i<args.length){
			    		
			    		// get arguments from command line
			
			    		// create Customer			    		
			    		cust_1= new Customer(args[i],args[i+1],args[i+2],args[i+3]);
			    		
			    		if (cust_1.getCip().equals("X")){
			    			System.out.println("Wrong Customer detected --> "+cust_1);
			    			w=true;
			  
			    		}
			    		if (!w){
			    			System.out.println("New Customer info: "+cust_1);
			    		}
			    		w=false;
			    	
			    		i+=4;
			    	}
		    
			    }	
			  String search="John Smith";
			  Customer cust_2=new Customer("4",search,"300","11/04/1970");	  
		
		      if (cust_1.equals(cust_2)) {
		         System.out.println("Last Customer has the same cip than the pattern "+ search);
		      } else System.out.println("Last Customer not matching pattern");  
		      
		  
		}
	}



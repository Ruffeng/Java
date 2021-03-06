import java.util.ArrayList;

/**
 * Test class of Exercise 1
 *
 * @author POO teaching staff
 * @version 1.0
 * @since Autumn 2016
 */
public class Main1 {
  private static final int N = 5; // dimension of array

  /**
   *
   * Changes status of patient visits for today to STATUS_ADMITTED
   * @param visits Array of hospital visits
   * @param patID String with patient identifier
   */
  private static void admit(Visit[] visits,String patID) {
	for(Visit visit : visits){
    	if(visit.scheduledForToday() && visit.getPatientID() == patID){
    		visit.setStatus(2);
    	} 
    }
  }

  /**
   *
   * Prints on screen patient visits with status STATUS_ADMITTED
   * @param visits Array of hospital visits
   * @param patID String with patient identifier
   */
  private static void printAdmittedVisits(Visit[] visits,String patID) {	  
		  /**
		   * Iterating first the array to get all patientsID. With the 
		   * if statement i am making sure that i will not repeat the same value 
		   * and it will be more efficient
		   */
	  	  ArrayList<String> patientsID = new ArrayList<String>() ;
		  for(Visit visit : visits){
			  if(patientsID.contains(visit.getPatientID())==false){
			  patientsID.add(visit.getPatientID());
			  }
		  }
		  /**
		   * Now that I have all patientsID, i just check if it contains the patID that we sent
		   * through parameters. If it is there, then i will check the status and print in the 
		   * case that the meeting is today.
		   * Otherwise, if the contains method returns false, it will entry on the else statement to 
		   * show us that "Today we don't have any appointment with the doctor"
		   * 
		   */
	  	  if (patientsID.contains(patID)){
	  		for(Visit visit : visits){	
				  if(visit.getPatientID() == patID){
				  		if(visit.getStatus()==2  ){
				   		System.out.println(visit);
				    	}
				  	}
			   }
	  	  }
	  	  else {
	  		System.out.println("You don't have any scheduled visit today");
	  	  }
			  
  }

  /**
   *
   * @param visits Array of hospital visits
   * @param serviceID String with service identifier
   */
  private static boolean serviceHasVisits(Visit[] visits,String serviceID) {
	  boolean check = false;
	  for (Visit visit: visits){
		 String service = visit.getServiceID();
		 if (serviceID == service){
			check = true;
		 }
	 }
	  return check;
  }

  public static void main(String[] args) {
    Visit[] visits = new Visit[N];
    String today = "2016-10-29 ";
    visits[0] = new Visit("0000000001","1000000001","CARSRV","Cardiology Door 1",today+"10:00","Dr. John Heart",Visit.TYPE_FIRST_VISIT);
    visits[1] = new Visit("0000000002","1000000002","CARSRV","Cardiology Door 1",today+"10:15","Dr. John Heart",Visit.TYPE_FIRST_VISIT);
    visits[2] = new Visit("0000000003","1000000001","RADSRV","Radiology Door 25",today+"08:00","Ms. Uranium",Visit.TYPE_FIRST_VISIT);
    visits[3] = new Visit("0000000004","1000000003","TRASRV","Traumatology Door 10",today+"10:00","Dr. Joe Bones",Visit.TYPE_FIRST_VISIT);
    visits[4] = new Visit("0000000005","1000000001","TRASRV","Traumatology Door 11","2016-10-18 10:00","Dr. Mary Legs",Visit.TYPE_FIRST_VISIT);

    System.out.println("Service CARSRV has scheduled visits? "+(serviceHasVisits(visits,"CARSRV")?"YES":"NO"));
    System.out.println("Service TRASRV has scheduled visits? "+(serviceHasVisits(visits,"TRASRV")?"YES":"NO"));
    System.out.println("Service RADSRV has scheduled visits? "+(serviceHasVisits(visits,"RADSRV")?"YES":"NO"));
    System.out.println("Service NEUSRV has scheduled visits? "+(serviceHasVisits(visits,"NEUSRV")?"YES":"NO"));

    System.out.println("PATID: 1000000001");
    admit(visits,"1000000001");
    printAdmittedVisits(visits,"1000000001");

    System.out.println("PATID: 1000000002");
    admit(visits,"1000000002");
    printAdmittedVisits(visits,"1000000002");

    System.out.println("PATID: 1000000003");
    admit(visits,"1000000003");
    printAdmittedVisits(visits,"1000000003");

    System.out.println("PATID: 1000000004");
    admit(visits,"1000000004");
    printAdmittedVisits(visits,"1000000004");

    System.out.println("PATID: 1000000005");
    admit(visits,"1000000005");
    printAdmittedVisits(visits,"1000000005");
  }
}

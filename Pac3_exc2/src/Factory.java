import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Enumeration;
import java.util.ArrayList;

/**
 * This class represents a furniture manufacturing company
 *
 * @author POO teaching staff
 * @version 1.0
 * @since Autumn 2016
 */

public class Factory{

   // The new line separator:
   private final String NL = System.getProperty("line.separator");

   /**
    * This atribute stores the list of materials
    */
   private ArrayList<Material> materials;

   /**
    * This atribute stores the list of colors
    */
   private ArrayList<Color> colors;

   /**
    * This atribute stores the list of products
    */
   private ArrayList<Furniture> furniture;

   /**
    * This atribute stores the list of orders
    */
   private ArrayList<Order> orders;

   /**
    * Constructor method
    */
   public Factory() {
      this.materials = new ArrayList<Material>();
      this.colors = new ArrayList<Color>();
      this.furniture = new ArrayList<Furniture>();
      this.orders = new ArrayList<Order>();
   }

   /**
    * This method adds an element to the list of materials
    * @param m
    */
	public void add(Material m) {
		this.materials.add(m);
	}

  /**
   * This method adds an element to the list of colors
   * @param m
   */
	public void add(Color c) {
	 this.colors.add(c);
	}

   /**
    * This method adds an element to the list of furniture
    * @param p
    */
	public void add(Furniture f) {	
		this.furniture.add(f);
	}

   /**
    * This method adds an element to the list of orders
    * @param o
    */
	public void add(Order o) {
		this.orders.add(o);
	}

   /**
    * This method generates and returns the information of
    * every element in the materials list of the factory, in
    * the order they were introduced.
    */
   public String listOfMaterials() {
      StringBuilder sb = new StringBuilder();
      for (Material material: this.materials){
    	 sb.append("Name: "+material.getName()+"	Price per cm2: "+String.format("%.3f",material.getPricePerCm2())+" euros\n");   	 
      }
      
      return sb.toString();
   }

   /**
    * This method generates and returns the information of
    * every element in the colors list of the factory, in
    * the order they were introduced.
    */
   public String listOfColors() {
      StringBuilder sb = new StringBuilder();
      for (Color color: this.colors){
    	  sb.append("Name: "+color.getName()+"	Price Factor: "+String.format("%.3f",color.getPriceFactor())+" euros\n");
      }
      return sb.toString();
   }
  
   /**
    * This method generates and returns the information of
    * every element in the products list of the factory, in
    * the order they were introduced.
    */
   public String listOfFurniture() {
      StringBuilder sb = new StringBuilder();
      for (Furniture item: this.furniture){
    	  sb.append(NL+"Furniture ID: "+item.getId());
    	  sb.append(NL+"Furniture Description: ");
    	  sb.append(item.toString());
      }
      return sb.toString();
   }

   /**
    * This method generates and returns the information of
    * every element in the orders list of the factory, in
    * the order they were introduced.
    */
   public String listOfOrders() {
      StringBuilder sb = new StringBuilder();
      for( Order order: this.orders){
    	sb.append(order.toString());
      }
      return sb.toString();
   }

   /**
    * This method generates and returns the information of
    * those elements in the furniture list of the factory,
    * whose price is comprised between a minimum and a maximum
    * values (both included).
    * @param min
    *             minimum price
    * @param max
    *             maximum price
    */
   public String listFurnitureInPriceRange(double min, double max) {
      StringBuilder sb = new StringBuilder();
      for(Furniture item: this.furniture ){
    	  if(min<item.price() && item.price()<max){
    		  sb.append(NL+"Furniture ID: "+item.getId());
        	  sb.append(NL+"Furniture Description: ");
        	  sb.append(item.toString());
    	  }
      }
      return sb.toString();
   }

   /**
    * This method removes an Order object from the list orders.
    * To do its task, this method has to use the appropriate
    * method of ArrayList class.
    * And to do that, it is necessary to redefine the equals
    * method on class Order, to define whether two Order
    * objects are equals (see description of equals method in
    * class Order)
    */
   public boolean removeOrder(Order orderToRemove) {
    //  boolean result = this.orders.equals(order);
      boolean result = false;
	  for(int i=0; i< this.orders.size(); i++){
    	  if(this.orders.get(i).equals(orderToRemove)){
    		  result =  true;
    		  this.orders.remove(i);    	  }
      }
      return result;
   }
}

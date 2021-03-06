import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Enumeration;
import java.util.ArrayList;

/**
 * This class represents an Closet
 *
 * @author POO teaching staff
 * @version 1.0
 * @since Autumn 2016
 */

public class Closet extends Furniture{

   // The new line separator:
   private final String NL = System.getProperty("line.separator");

   /**
    * This atribute stores the Furniture width
    */
   private double width;
   /**
    * This atribute stores the Furniture height
    */
   private double height;
   /**
    * This atribute stores the Furniture depth
    */
   private double depth;

   /**
    * This atribute stores the list of frontparts
    */
   private ArrayList<FrontPart> frontparts;
     
   /**
    * Constructor method
    *
    * @param id
    *            the Furniture id
    * @param material
    *            the Furniture material object
    * @param w
    *            the Closet width
    * @param h
    *            the Closet height
    * @param d
    *            the Closet depth
    */
   public Closet(String id, Material material, Color color, double w, double h, double d) {
	  super(id,material,color);
	  this.frontparts = new ArrayList<FrontPart>();
	  this.height = h;
      this.width = w;
      this.depth = d;
   }

   /**
    * Getter method of atribute width
    * @return atribute width
    */
   public double getWidth() {
      return this.width;
   }

   /**
    * Getter method of atribute height
    * @return atribute height
    */
   public double getHeight() {
      return this.height;
   }

   /**
    * Getter method of atribute depth
    * @return atribute depth
    */
   public double getDepth() {
      return this.depth;
   }

   /**
    * Add a FrontPart to this object
    * @param f FrontPart object
    */
   public void add(FrontPart f) {	   
	   this.frontparts.add(f);	  
   }

   /**
    * This method generates and returns the information of
    * every element in the front parts list of the closet, in
    * the order they were introduced.
    */
   public String listOfFrontParts() {
		StringBuilder sb = new StringBuilder();
	   for(FrontPart front: frontparts){
			sb.append(front.toString());
	   }
      return sb.toString();
   }

   /**
    * This method calculates and returns the price of the
    * Furniture.
    *
    * The price of the Furniture is calculated as:
    *   (sum of its areas) x (price per cm2 of the material) x (price factor of the color)
    *
    * @return price of the Furniture
    */
   public double price() {
     return bodyPrice()+frontPartsPrice();
   }
   
   /**
    * This method generates and returns an String with
    * the information of the Furniture object.
    *
    * Note that this method has to access to the Material
    * and Color atributes of the class to get some information,
    * and that this method also gets price from front parts, if any,
    * to add to final price.
    */

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append( NL+"  Closet made on "+getMaterial().getName()+" with color "+getColor().getName() +
				   NL+"  Material price: "+String.format("%.3f",getMaterial().getPricePerCm2())+" euros per cm2"+
				   NL+"  Width: " + width +" cm"+
				   NL+"  Height: " + height + " cm"+
				   NL+"  Depth: " + depth+" cm"+
				   NL+"  Color price factor:"+String.format("%.3f", getColor().getPriceFactor())+" euros"+ 
				   NL+" Body price: "+String.format("%1$,.2f",bodyPrice())+" euros"+
				   NL+" Front parts:");
		sb.append(listOfFrontParts());
  	   	sb.append(NL+"Furniture price: "+String.format("%1$,.2f",price())+" euros"+NL);

		return sb.toString(); 
	}

   /**
    * Get the price from the FrontParts of this Closet
    */
   private double frontPartsPrice() {
	   double front_totalPrice = 0;
	   for(FrontPart front: this.frontparts){
			front_totalPrice += front.price();
	   }
     return front_totalPrice;
   }
   private double bodyPrice() {
	      double total_area = ( this.height *this.depth * 2)+(this. width * this.height);
	      double  total_price = total_area * this.getMaterial().getPricePerCm2()*this.getColor().getPriceFactor();
	     
	      return total_price;
   }

}

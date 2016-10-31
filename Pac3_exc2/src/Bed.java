import java.text.DecimalFormat;

/**
 * This class represents a bed
 *
 * @author POO teaching staff
 * @version 1.0
 * @since Autumn 2016
 */

public class Bed extends Furniture{

   // The new line separator:
   private final String NL = System.getProperty("line.separator");

   /**
    * This atribute stores the bed X dimension
    */
   private double x;

   /**
    * This atribute stores the bed Y dimension
    */
   private double y;

   /**
    * Constructor method
    *
    * @param id
    *            the Furniture id
    * @param material
    *            the Furniture material object
    * @param color
    *            the Furniture color object
    * @param x
    *            the bed x dimension
    * @param y
    *            the bed y dimension
    */
   public Bed(String id, Material material, Color color, double x, double y) {
      super(id,material,color);
	  this.x = x;
      this.y = y;
   }

   /**
    * Getter method of atribute x
    * @return atribute x
    */
   public double getX() {
      return this.x;
   }

   /**
    * Getter method of atribute y
    * @return atribute y
    */
   public double getY() {
      return this.y;
   }

   /**
    * This method calculates and returns the price of the
    * Bed.
    *
    * The price of the Bed is calculated as:
    *   (its Area) x (price per cm2 of the material) x (price factor of the color)
    *
    * @return price of the cylinder
    */
   public double price() {
	   double total_area= (this.getX() * this.getY());
	   double total_price = total_area*getMaterial().getPricePerCm2()*getColor().getPriceFactor();
	   return total_price;
      
   }

   /**
    * This method generates and returns an String with
    * the information of the Bed object.
    *
    * Note that this method has to access to the Material
    * and Color atributes of the class to get some information.
    */
   public String toString() {
	  StringBuilder sb = new StringBuilder();
	  sb.append(NL+" Bed made on "+getMaterial().getName()+" with color "+getColor().getName());
	  sb.append(NL+" Material price: "+getMaterial().getPricePerCm2()+" euros per cm2");
	  sb.append(NL+" X: "+getX());
	  sb.append(NL+" Y: "+getY());
	  sb.append(NL+" Color price factor: "+String.format("%.3f", getColor().getPriceFactor())+" euros");
	  sb.append(NL+"Furniture price: "+price()+" euros"+NL);
	  
      return sb.toString();
   }
}

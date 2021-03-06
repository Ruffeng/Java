import java.text.DecimalFormat;

/**
 * This class represents a Door
 *
 * @author POO teaching staff
 * @version 1.0
 * @since Autumn 2016
 */

public class Door extends FrontPart{

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
    *            the FrontPart id
    * @param material
    *            the FrontPart material object
    * @param color
    *            the FrontPart color object
    * @param x
    *            the door x dimension
    * @param y
    *            the door y dimension
    */
   public Door(String id, Material material, Color color, double x, double y) {
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
    * the information of the Door object.
    *
    * Note that this method has to access to the Material
    * and Color atributes of the class to get some information.
    */
   public String toString() {
   	return NL+"  FrontPart ID: "+getId()+
   		NL+"   FrontPart Description:"+
   		NL+"   Door made on "+getMaterial().getName()+" with color"+ getColor().getName()+
   		NL+"   Material price: "+String.format("%.3f", getMaterial().getPricePerCm2())+" euros per cm2"+
   		NL+"   X: "+getX()+
   		NL+"   Y: "+getY()+
   		NL+"   Color price factor: "+String.format("%.3f", getColor().getPriceFactor())+" euros"+
   		NL+"  FrontPart price:"+ price()+" euros"+NL;
   }
   
}

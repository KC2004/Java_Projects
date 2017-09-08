
/**
 * Defines a reusable class Rectangle. One object of class Rectangle stores
 * the height and width of a Rectangle.
 */

public class Rectangle {

   private int height;   // height is a data member
   private int width;   // width is a data member
   
   /**
    * constructor
    */
   public Rectangle(){
	   height = 1;
	   width = 1;
   }
   
   /**
    *  parameterized constructor 
    *  */
   public Rectangle(int h, int w){
	   height = h;
	   width = w;
   }

   /** 
    * constructor with one side sent as parameter
    */
   public Rectangle(int side){
	   height = side;
	   width = side;
   }


   /**
    * Sets the value for height to "newHeight". 
    */
   public void setHeight (int newHeight) {     // newHeight is a parameter
      if (newHeight >= 0)
    	  height = newHeight;
   }

   /**
    * Sets the value for width to "newWidth".
    */
   public void setWidth (int newWidth) {     // newWidth is a parameter
      if (newWidth >= 0){  // put curly braces whether there's one or more to reduce programing errors 
    	  width = newWidth;
      }
   }
   
   
   /**
    * Returns the value of width.
    */
   public int getWidth () {   
      return width;
   }

   /**
    * Returns a String containing the height and width of the Rectangle
    */
   public String toString() {
      return "height = " + height + ", " + "width = " + width;
   }

   /**
    * Returns the value of height.
    */
   public int getHeight () {    
      return height;
   }
   
   /**
    * Returns the integer area of Rectangle object
    */
   public int area(){
	   return height*width;
   }
   /**
    * prints the rectangle in whatever symbol the main sends in
    */
   public void drawRectangle(char symbol){
	   for (int j=1; j<=height; j++){
		   for (int i=1; i<=width;i++){
			   System.out.print(symbol);
			   System.out.print(i);

			   }
		   System.out.println(symbol);
	   }
   }
   
   /**
    * method name overloading
    */
   public void drawRectangle(){
	   drawRectangle('*');
   }
   
   /**
    * 
    */
   public boolean Equal(Rectangle other){
	   return ((this.height == other.height) && (this.width == other.width));
   }
}
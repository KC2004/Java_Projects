/**
 * Creates three objects of class Rectangle, setting
 * values for their height and width, and then printing those values to see
 * that everything works for both objects.
 */

public class TestRectangle {
   public static void main (String args[]) {
      Rectangle floor;
      floor = new Rectangle ();   // constructs (allocates space for) an object
      System.out.println(floor);
      floor.setHeight(3);
      floor.setWidth(2);
      System.out.println(floor.getHeight());
      
      System.out.println("area should 6:" + floor.area());
      System.out.println("height should be 3: "+ floor.getHeight());
      System.out.println("width should be 2: " + floor.getWidth());
      System.out.println("Here is the floor:" + floor.toString());
      floor.drawRectangle('*');

      Rectangle ceiling;
      ceiling = new Rectangle();   // constructs a second Rectangle object
      ceiling.setHeight(5);
      ceiling.setWidth(6);
      System.out.println("area should 30:" + ceiling.area());
      System.out.println("height should be 5: "+ ceiling.getHeight());
      System.out.println("width should be 6: " + ceiling.getWidth());
      System.out.println("Here is the ceiling:" + ceiling.toString());
      ceiling.drawRectangle('+');
      
      Rectangle wall;
      wall = new Rectangle();
      wall.setHeight(7);
      wall.setWidth(4);
      System.out.println("area should 28:" + wall.area());
      System.out.println("height should be 7: "+ wall.getHeight());
      System.out.println("width should be 4: " + wall.getWidth());
      System.out.println("Here is the wall:" + wall.toString());
      wall.drawRectangle('&');
      
      Rectangle square_wall = new Rectangle(5); // expect 5 by 5 square
      System.out.println(square_wall);
      square_wall.drawRectangle('0');
      
      Rectangle square_floor = new Rectangle(5);
      if (square_floor.equals(square_wall))
    	  System.out.println("they are equal");
      else
    	  System.out.println("they are not equal");
   }
}

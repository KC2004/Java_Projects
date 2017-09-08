/**
 * Tests class Driver by reading the data, calculating and printing
 * out the insurance premiums for four different drivers.
 */
class TestDriver {
      public static void main(String args[])  {
            Driver driver;
            driver = new Driver();
            driver.read();
            System.out.println("Premium: $" + driver.premium());
            driver.read();
            System.out.println("Premium: $" + driver.premium());
            driver.read();
            System.out.println("Premium: $" + driver.premium());
            driver.read();
            System.out.println("Premium: $" + driver.premium());
      }
}

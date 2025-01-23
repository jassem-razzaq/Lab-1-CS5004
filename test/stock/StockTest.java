package stock;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class with tests for all public methods of Stock class
 */
public class StockTest {
  private Stock apple;
  private Stock dell;

  /**
   * Setup method to initialize test stocks for later testing
   */
  @Before
  public void setup() {
    this.apple = new Stock("AAPL", "Apple Computer", 100);
    this.dell = new Stock("DELL", "Dell Tech", 50);
    this.apple.setCurrentPrice(200);
    this.dell.setCurrentPrice(25);
  }

  /**
   * Tests for getter methods of Stock class
   */
  @Test
  public void parameterEquals() {
    assertEquals("AAPL", this.apple.getSymbol());
    assertEquals("Apple Computer", this.apple.getName());
    assertEquals(100, this.apple.getCostBasis(), 0.01);
    assertEquals(200, this.apple.getCurrentPrice(), 0.01);
    assertEquals(1, this.apple.getChangePercent(), 0.01);
  }

  /**
   * Test for toString method of Stock class
   */
  @Test
  public void testToString() {
    assertEquals("Apple Computer Current Price: $200.00\n"
            + " Gain/Loss:100.00%", apple.toString());
  }

  /**
   * Tests for setters of current price and cost basis of Stock class
   */
  @Test
  public void testSetters() {
    this.apple.setCurrentPrice(500);
    this.dell.setCostBasis(99.01);
    assertEquals(500, apple.getCurrentPrice(), 0.01);
    assertEquals(99.01, dell.getCostBasis(), 0.01);
  }
}

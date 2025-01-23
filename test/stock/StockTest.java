package stock;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StockTest {
  private Stock apple;
  private Stock dell;

  @Before
  public void setup() {
    this.apple = new Stock("AAPL", "Apple Computer", 100);
    this.dell = new Stock("DELL", "Dell Tech", 50);
    this.apple.setCurrentPrice(200);
    this.dell.setCurrentPrice(25);
  }

  @Test
  public void parameterEquals() {
    assertEquals("AAPL", this.apple.getSymbol());
    assertEquals("Apple Computer", this.apple.getName());
    assertEquals(100, this.apple.getCostbasis(), 0.01);
    assertEquals(200, this.apple.getCurrentPrice(), 0.01);
    assertEquals(1, this.apple.getChangePercent(), 0.01);
  }

  @Test
  public void testToString() {
    assertEquals("Apple Computer Current Price: $200.00\n" +
            " Gain/Loss:100.00%", apple.toString());
  }

  @Test
  public void testSetters() {
    this.apple.setCurrentPrice(500);
    this.dell.setCostBasis(99.01);
    assertEquals(500, apple.getCurrentPrice(), 0.01);
    assertEquals(99.01, dell.getCostbasis(), 0.01);
  }
}

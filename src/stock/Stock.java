package stock;

/**
 * stock.Stock class for buying selling and trading.
 */
public class Stock {
  private String symbol;
  private String name;
  private double cost_basis;
  private double current_price;

  /**
   * Default constructor for stock class.
   */
  public Stock() {
    this.symbol = "AAA";
    this.name = "Default";
    this.cost_basis = 1.0;
  }

  /**
   * Overloaded constructor for stock class.
   * @param symbol : Symbol of the stock.
   * @param name : Name of the stock.
   * @param cost_basis : Cost basis of stock.
   */
  public Stock(String symbol, String name, double cost_basis){
    this.symbol = symbol;
    this.name = name;
    this.cost_basis = cost_basis;
  }

  /**
   * Function to get symbol of stock.
   * @return symbol of stock
   */
  public String getSymbol() {
    return this.symbol;
  }

  /**
   * Function to get name of stock.
   * @return name of stock
   */
  public String getName() {
    return this.name;
  }

  /**
   * Function to get cost basis of stock.
   * @return cost basis of stock
   */
  public double getCostBasis() {
    return this.cost_basis;
  }

  /**
   * Function to get current price of stock.
   * @return current price of stock
   */
  public double getCurrentPrice() {
    return this.current_price;
  }

  /**
   * Function to set cost basis of stock.
   * @param cost_basis: Cost basis of stock
   */
  public void setCostBasis(double cost_basis) {
    this.cost_basis = cost_basis;
  }

  /**
   * Function to set current price of stock.
   * @param current_price: Current price of stock
   */
  public void setCurrentPrice(double current_price) {
    this.current_price = current_price;
  }

  /**
   * Function to get fractional change between current price and cost basis
   */
  public double getChangePercent() {
    return (this.current_price - this.cost_basis) / this.cost_basis;
  }

  /**
   * Override the toString method to return parameters of stock.
   */
  @Override
  public String toString() {
    return String.format("%s Current Price: $%.2f\n Gain/Loss:%.2f%%",
            this.getName(), this.getCurrentPrice(), this.getChangePercent() * 100);
  }
}

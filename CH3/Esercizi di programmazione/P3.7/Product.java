public class Product
{

  public Product(String productName, double productPrice)
  {

    this.name = productName;

    this.price = productPrice;

  }

  public String getName()
  {

    return this.name;

  }

  public double getPrice()
  {

    return this.price;

  }

  public void reducePrice()
  {

     this.price = this.price - (this.price * 10 / 100);

  }

  private String name;

  private double price;

}

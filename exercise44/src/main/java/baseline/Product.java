package baseline;

public class Product {
    //stores values of a single product
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(String name, double price, int quantity) {
        //used in junit testing
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        //used for product search
        return name;
    }

    public double getPrice() {
        //used for junit testing
        return price;
    }

    public int getQuantity() {
        //used for junit testing
        return quantity;
    }

    @Override
    public String toString() {
        //to be used for printing products
        return  String.format("Name: %s%nPrice: %.2f%nQuantity: %d", name, price, quantity);
    }
}

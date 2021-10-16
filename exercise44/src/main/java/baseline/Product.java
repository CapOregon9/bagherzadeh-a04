package baseline;

public class Product {
    //stores values of a single product
    private String name;
    private double price;
    private int quantity;

    @Override
    public String toString() {
        //to be used for printing products
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

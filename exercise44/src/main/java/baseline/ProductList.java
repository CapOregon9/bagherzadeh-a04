package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductList {
    //stores products in a list
    private List<Product> products = new ArrayList<>();
    private static final Scanner input = new Scanner(System.in);

    public void searchForProduct() {
        //searches for a product in the product list
        boolean searchCase;
        String userInput;
        do {
            System.out.println("What is the product name? ");
            userInput = input.nextLine();
            searchCase = inProductList(userInput);
            if (!searchCase) {
                System.out.println("Sorry, that product was not found in our inventory.");
            }
        } while (!searchCase);
        printProduct(userInput);
    }

    public boolean inProductList(String input) {
        //finds if the product exists in the list
        boolean outputCase = false;
        for (Product product : products) {
            if (product.getName().equals(input)) {
                outputCase = true;
            }
        }
        return outputCase;
    }

    public void printProduct(String input) {
        //prints a product from products list
        for (Product product: products) {
            if (product.getName().equals(input)) {
                System.out.println(product);
            }
        }
    }

    public void addProduct(Product product) {
        //used for junit testing
        products.add(product);
    }

    public List<Product> getProductList() {
        //used for junit testing
        return products;
    }
}

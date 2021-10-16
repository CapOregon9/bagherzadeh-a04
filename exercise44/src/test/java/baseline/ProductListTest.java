package baseline;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductListTest {

    @Test
    void testInProductList() {
        //tests if the in product list function works
        ProductList productList = new ProductList();
        Product product = new Product("Widget", 25.00, 5);
        productList.addProduct(product);
        boolean actualState = productList.inProductList("Widget");
        assertEquals(true, actualState);
    }

    @Test
    void createdProductList() {
        //tests if the product list is successfully being created
        FileProcessor fileProcessor = new FileProcessor();
        ProductList productList = new ProductList();
        Product product1 = new Product("Widget", 25.00, 5);
        Product product2 = new Product("Thing", 15.00, 5);
        Product product3 = new Product("Doodad", 5.00, 10);
        Gson gson = new Gson();
        List<Product> products1 = new ArrayList<>();
        StringBuilder expectedString = new StringBuilder();
        StringBuilder actualString = new StringBuilder();
        products1.add(product1);
        products1.add(product2);
        products1.add(product3);
        try {
            Reader reader = new FileReader("data\\exercise44_input.json");
            productList = fileProcessor.readJSONFile(reader, gson);
            reader.close();
        } catch (IOException e) {
        }
        List<Product> products2 = productList.getProductList();
        for (Product product: products1) {
            expectedString.append(product);
        }
        for (Product product: products2) {
            actualString.append(product);
        }
        assertEquals(expectedString.toString(),actualString.toString());
    }
}
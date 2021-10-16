package baseline;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Solution44 {
    public static void main(String[] args) {
        //declare instance of GSON and file processor
        FileProcessor fileProcessor = new FileProcessor();
        Gson gson = new Gson();
        //access file and store in objects
        try (Reader reader = new FileReader("data\\exercise44_input.json")) {
            ProductList productList = fileProcessor.readJSONFile(reader,gson);
            //access method to find a product in the product list
            productList.searchForProduct();
        } catch (IOException e) {
            System.out.println("Unable to access file.");
        }


    }
}

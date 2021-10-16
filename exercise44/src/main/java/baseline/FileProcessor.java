package baseline;

import com.google.gson.Gson;

import java.io.Reader;

public class FileProcessor {
    //Accesses JSON files

    public ProductList readJSONFile(Reader reader, Gson gson) {
        //reads json file and returns the object that is created
        return gson.fromJson(reader, ProductList.class);
    }
}

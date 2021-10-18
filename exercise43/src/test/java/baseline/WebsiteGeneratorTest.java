package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteGeneratorTest {

    @Test
    void makeDirectoryJS() {
        WebsiteGenerator websiteGenerator = new WebsiteGenerator();
        websiteGenerator.makeDirectory("awesomeco", "js");
        boolean actualValue = new File(String.format("data\\website\\%s\\%s", "awesomeco", "js")).exists();
        assertEquals(true, actualValue);
    }


    @Test
    void createHTML() {
        WebsiteGenerator websiteGenerator = new WebsiteGenerator();
        websiteGenerator.createHTML("awesomeco", "Max Power");
        boolean value = new File("data\\website\\" + "awesomeco" + "\\index.html").exists();
        assertEquals(true, value);
    }
}
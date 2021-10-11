package baseline;

public class Solution43 {
    public static void main(String[] args) {
        //create instance of website generator and user input
        WebsiteGenerator websiteGenerator = new WebsiteGenerator();
        UserInput userInput = new UserInput();
        //prompt user for site name and author and store as strings
        String siteName = userInput.getSiteName();
        String author = userInput.getAuthor();
        //Ask user if they want certain directories and store values as booleans
        boolean jsFolder = userInput.getJSFolder();
        boolean cssFolder = userInput.getCSSFolder();
        //make directories and the html file
        websiteGenerator.makeDirectory(siteName, "");
        if (jsFolder) {
            //if statement for jsFolder
            websiteGenerator.makeDirectory(siteName, "js");
        }
        if (cssFolder) {
            //if statement for cssFolder
            websiteGenerator.makeDirectory(siteName, "css");
        }
        websiteGenerator.createHTML(siteName, author);
    }
}

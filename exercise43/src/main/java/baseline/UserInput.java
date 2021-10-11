package baseline;

import java.util.Scanner;

public class UserInput {
    private static final Scanner input = new Scanner(System.in);
    //This class is used to prompt the user for inputs
    public String getSiteName() {
        //prompts user and returns the site name
        System.out.println("Site name: ");
        return input.nextLine();
    }
    public String getAuthor() {
        //prompts user and returns the author
        System.out.println("Author: ");
        return input.nextLine();
    }

    public boolean getJSFolder() {
        //prompts user and asks if they want a JavaScript folder
        System.out.println("Do you want a folder for JavaScript? ");
        String userInput = input.nextLine();
        return userInput.equalsIgnoreCase("y");
    }

    public boolean getCSSFolder() {
        //prompts user and asks if they want a CSS folder
        System.out.println("Do you want a folder for CSS? ");
        String userInput = input.nextLine();
        return userInput.equalsIgnoreCase("y");
    }
}

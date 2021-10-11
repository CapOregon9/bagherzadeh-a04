package baseline;

import java.io.*;

public class WebsiteGenerator implements DirectoryMaker, HTMLMaker{
    //This class makes the structure for the website as well as an index html

    public void makeDirectory(String root,String newDir) {
        //creates a directory based on the input
        boolean value;
        if (newDir.equals("")) {
            value = new File(String.format("data\\website\\%s", root)).mkdirs();
        } else {
            value = new File(String.format("data\\website\\%s\\%s", root, newDir)).mkdirs();
        }
        if (value) {
            madeDirectory(root, newDir);
        }
    }

    public void madeDirectory(String root, String dir) {
        //prints result of directory creation
        if (dir.equals("")) {
            System.out.printf("Created ./website/%s/%n", root);
        } else {
            System.out.printf("Created ./website/%s/%s/%n", root, dir);
        }
    }

    public void createHTML(String title, String author) {
        //creates an HTML for the website
        File file = new File("data\\website\\" + title + "\\index.html");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
            bufferedWriter.write(String.format("<!DOCTYPE html>%n<html>%n<head>%n<title>%s</title>%n<meta name = \"author\" content = \"%s\">%n</head>%n</html>", title, author));
            madeDirectory(title, "index.html");
        } catch (IOException e) {
            System.out.println("Could not write file.");
        }

    }
}

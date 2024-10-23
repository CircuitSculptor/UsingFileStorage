import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class UsingFileStorage {
    public static void main(String[] args) {

        File myFile = new File("File1.txt");
        System.out.println("My file is located at " + myFile.getAbsolutePath());
        String content = "Details to write";
        try {
            FileWriter myWriter = new FileWriter(myFile, true);
            myWriter.write("ATU is awesome");
            myWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        /*
        try {
            PrintWriter outputFile = new PrintWriter("Names.txt");
            outputFile.println("Bartek");
            outputFile.println("Lance");
            outputFile.println("Eoin");
            outputFile.println("Simon");
            outputFile.println("Joy");
            outputFile.println("Anzelina");
        }
        catch (FileNotFoundException ffe) {
            System.out.println("File not found" + ffe.getMessage());
        }
        */

    }
}

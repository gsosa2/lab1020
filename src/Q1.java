import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {

    //I used scanner to read the sample text and add it to an arraylist then print that out, and then I reversed that as well.
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/sample.txt");

        Scanner scanner = new Scanner(file);

        ArrayList<String> lines = new ArrayList<String>();

        while(scanner.hasNextLine()){
            lines.add(scanner.nextLine());
        }
        for (String line : lines) {
            System.out.println(line);
        }

        System.out.println("\n");
        for(int i = lines.size()-1; i >= 0; i--){
            System.out.println(lines.get(i));
        }


    }



}
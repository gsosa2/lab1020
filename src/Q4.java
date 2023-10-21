import java.io.*;

public class Q4 {

    public static void main(String[] args) throws IOException {

        File input = new File("src/Car.txt");
        File output = new File("CarOutput.txt");

        inputOutput(input, output);
    }
    //takes an input file and read it then outputs it to the output file defined by the user.
    public static void inputOutput(File input,File output) throws IOException {

        try{
        BufferedReader reader = new BufferedReader(new FileReader(new File(String.valueOf(input))));
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File(String.valueOf(output))));
        String line;
        while((line = reader.readLine()) != null){
            writer.write(line + "\n");
            }
        writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }


}



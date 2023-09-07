import java.io.*;
import java.nio.file.*;
import java.util.*;


public class CSVReader {

    public static void main(String[] args) {
      String inputPath = "D:\\Marvel\\input.csv";
        String outputPath = "D:\\Marvel\\output.csv";


        try {
            BufferedReader br = new BufferedReader(new FileReader(inputPath));
            PrintWriter pw = new PrintWriter(new FileWriter(outputPath));

            String line;
            while ((line = br.readLine()) != null) {
                pw.println(line);
            }

            br.close();
            pw.close();

            System.out.println("CSV file contents copied to " + outputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

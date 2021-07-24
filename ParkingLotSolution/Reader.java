package ParkingLotSolution;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Reader
{
  public static List<String> readFile(String filepath){
      List<String> inputs=new ArrayList<>();

      if(filepath.length() == 0) {
            System.err.println("Please provide input path");
            throw new RuntimeException("File Path Not Provided");
            //return null;
        }

      try {
        File myObj = new File(filepath);
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          inputs.add(data);
      }
      myReader.close();
      } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    return inputs;
  }
}
import java.util.Random;
import java.util.Scanner;
import java.io.*;
public class TestData
{
   private static Scanner scan;

//  Creates a file of test data
   public static void main(String[] args) 
   {
      final int MAX = 10;
      int value;
      
      while(true){
    	  try {
    		  scan = new Scanner(System.in);
    		  String fileName = scan.nextLine();
    		  PrintWriter outFile = new PrintWriter(fileName);
    		  Random rand = new Random();
    		  for (int line=1; line <= MAX; line++)
    		  {
    			  for (int num=1; num <= MAX; num++)
    			  {
    				  value = rand.nextInt(90) + 10;
    				  outFile.print(value + "   ");
    			  }
    			  outFile.println();
    		  }
    		  outFile.close();
    		  System.out.println("Output file has been created: " + fileName);
    		  break;
    	  }

    	  catch(IOException ex) {
    		  System.out.println("Error, please enter another file name:");
    	  }
      }
   }
}
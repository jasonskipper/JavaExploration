//Michael Skipper, N01162792
import java.io.*;
import java.util.*;
public class ReadFileLineByLine {
   public static void main(String[] args)throws IOException {

      String line;
      List<String> formula = new ArrayList<String>();
   
      double result;
      String test;

      try {
         //open file for reading the calculated formulas "formulas.txt" 
         //open file for storing the calculated formulas "results.txt"
         File formulas = new File("");
         File results = new File("");
      
         Scanner s = new Scanner(formulas);
         BufferedWriter ws = new BufferedWriter(new PrintWriter(results));
         
         while(s.hasNextLine()) {// read one line at a time
            line = s.nextLine();
            if(!line.isEmpty())
               System.out.println("read <" + line + ">");// Display message to commandline 
            
            StringTokenizer StrT = new StringTokenizer(line, " \n");// Declare ArrayList of for storing tokenized formula from String line
            while (StrT.hasMoreElements()) {
            formula.add(StrT.nextToken());
            }
            result = 0;

            if(!formula.isEmpty()){
               if (formula.get(1).equals("+")) {
               result = Double.parseDouble(formula.get(0)) + Double.parseDouble(formula.get(2));// The variable to store result of the operation 
               } 
               else if (formula.get(1).equals("-")) {
                  result = Double.parseDouble(formula.get(0)) - Double.parseDouble(formula.get(2));
               } 
               else if (formula.get(1).equals("*")) {
                  result = Double.parseDouble(formula.get(0)) * Double.parseDouble(formula.get(2));
               } 
               else if (formula.get(1).equals("/")) {
                  result = Double.parseDouble(formula.get(0)) / Double.parseDouble(formula.get(2)); // The variable to store result of the operation
               }
               System.out.println(formula.get(0) + ' ' + formula.get(1) + ' ' + formula.get(2) + " = " + result ); // Display result to command line
            }
      // Determine the operator and calculate value of the result
            if(result !=0){
               test = line +" = "+ result+"\n";
               ws.write(test);// Write result to file
            }
            formula.clear();
         }
         ws.close(); // Need to close input and output files 
      } catch (FileNotFoundException e) {
         e.printStackTrace();// Display meaningful error message 
      }
   }
}
  
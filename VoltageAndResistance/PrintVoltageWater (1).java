/* 
This program displays a list of voltages corresponding to certain temperatures in a circuit system. 
Written by: Michael Skipper, N01162792  
*/  

import java.text.DecimalFormat;

public class PrintVoltageWater {

  public static void main(String[] args) {  

    DecimalFormat formatting = new DecimalFormat("##.00"); 

    System.out.println("\t  T\t\t Va\n\t------\t------"); 

    for (int temperature = 0; temperature <= 100; temperature += 10) { 

      double voltage = (double)(20*(temperature+100))/(250+temperature);

      System.out.println("\t"+temperature+"\t\t\t"+formatting.format(voltage));
    }
  }
}
/*
This program computes and displays resistances of particular wires. 
Written by: Michael Skipper, N01162792
*/ 

import java.util.Scanner; 
import java.text.DecimalFormat; 

public class WireResistance {

   public static double computeDiameter(int wireGauge) {
      return 0.127 * Math.pow(92, (36-(double)wireGauge)/39); 
    }
 
   public static double computeCopperWireResistance(double length, int wireGauge) {
      double Cdiameter = computeDiameter(wireGauge); 
      double CopperWireLength = (double)length * 0.0254; 
      return (double) 4*(1.678*Math.pow(10, -8))*(double)CopperWireLength/(3.14*Math.pow(Cdiameter/1000, 2)); 
    }
   
   public static double computeAlumWireResistance(double length, int wireGauge){
      double Adiameter = computeDiameter(wireGauge); 
      double AlumWireLength = (double)length * 0.0254; 
      return (double) 4*(2.82*Math.pow(10, -8))*(double)AlumWireLength/(3.14*Math.pow(Adiameter/1000, 2));
      
    }


   public static void main(String[] args) {
      Scanner s = new Scanner(System.in); 
      DecimalFormat formatting = new DecimalFormat("0.###"); 
      
      System.out.print("Enter the wire gauge: "); 
      int wireGauge = s.nextInt(); 
      System.out.print("Enter the wire length in inches: "); 
      int length = s.nextInt(); 
      
      double CW = computeCopperWireResistance(length, wireGauge); 
      double AW = computeAlumWireResistance(length, wireGauge); 
      
      System.out.println("The resistance of a " + length +" inch piece of " + wireGauge +" gauge copper wire is "+formatting.format(CW)+" Ohms."); 
      System.out.println("The resistance of a " + length + " inch piece of " + wireGauge + " gauge aluminum wire is " + formatting.format(AW)+" Ohms."); 

   }
} 
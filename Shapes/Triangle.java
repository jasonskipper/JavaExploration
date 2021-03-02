//Michael Skipper, N01162792 
import java.lang.Math;

class Triangle extends GeometricObject {
   private double side1;
   private double side2;
   private double side3;
   
   public Triangle() {
      side1 = 1.0;
      side2 = 1.0;
      side3 = 1.0;
   }
   
   public Triangle(double side1, double side2, double side3) {
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
   }
   
   public double getside1() { 
      return this.side1;
   }
   
   public void setside1(double side1) {
      this.side1 = side1;
   }
   
   public double getside2() {
      return side2;
   }
   
   public void setSide2(double side2) {
      this.side2 = side2;
   }
   
   public double getside3() {
      return side3;
   }
   
   public void setside3(double side3) {
      this.side3 = side3;
   }
   
   public double getArea() { 
      double area = 0.5*(side1 + side2 + side3);
      
      return Math.sqrt(area*((area-side1)*(area-side2)*(area-side3))); // Heron's formula for the area of a triangle
   }
   
   public double getPerimeter() {
      return side1 + side2 + side3; // formula for the perimeter of a triangle
   }
   
   public String toString() {
      return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3; // print sides upon will
   }
}
//Michael Skipper, N01162792 
class Circle1 extends GeometricObject1 implements Comparable {
   
   protected double radius;
   double area;
   double perimeter;
   // Default constructor
   public Circle1() {
      this(1.0, "white", 1.0);
   }
   // Construct circle with specified radius
   public Circle1(double radius) {
      super("white", 1.0);
      this.radius = radius;
   }
   // Construct a circle with specified radius, weight, and color
   public Circle1(double radius, String color, double weight) { 
      super(color, weight);
      this.radius = radius;
   }
   // Getter method for radius
   public double getRadius() {
      return radius;
   }
   // Setter method for radius
   public void setRadius(double radius) {
      this.radius = radius;
   }
   // Implement the findArea method defined in GeometricObject
   public double findArea(double area) {
   // Write your code here
      return Math.PI*(radius*radius);
   }
   // Implement the findPerimeter method defined in GeometricObject
   public double findPerimeter(double perimeter) {
      return Math.PI*2*radius;
   // Write your code here
   }
   // Override the equals() method defined in the Object class
   public boolean equals(Circle1 circle) {
      Double r1 = this.getRadius();
      Double r2 = this.getRadius();
      return r1.compareTo(r2) == 0;
   }
   // Write your code here  }
   // Override the toString() method defined in the Object class
   public String toString() {
      return "Circle-> radius: " + this.radius;
   // Write your code here
   }
   // Implement the compareTo method defined in Comparable
   public int compareTo(Object o) {
      Double r1 = this.getRadius();
      Circle1 circle = (Circle1) o;
      Double r2 = circle.getRadius();
      return r1.compareTo(r2);
   }
   // Write your code here
   public static Circle1 max(Comparable o1, Comparable o2) { // Write your code here
      if (o1.compareTo(o2) > 0) {
         return (Circle1) o1;
      } 
      else {
         return (Circle1) o2;
      }
   }
   
   @Override
      double getArea() {
      throw new UnsupportedOperationException("Not supported yet.");     
   }

   @Override
      double getPerimeter() {
      throw new UnsupportedOperationException("Not supported yet.");
   }
}

//Michael Skipper, N01162792
import java.lang.Math;

class Circle2D { 

   private double x, y; 
   private double radius; 

   public Circle2D() {
      this.x = 0; 
      this.y = 0; 
      this.radius = 1.0; 
      
   }
   public Circle2D(double x, double y, double radius) { 
      this.x = x; 
      this.y = y; 
      this.radius = radius; 
   }

   public double getX() { 
      return this.x; 
   }
   
   public void setX(double x) { 
      this.x = x;   
   }
   
   public double getY() { 
      return this.y; 
   }
    
   public void setY(double y) { 
      this.y = y;
   }

   public double getRadius() { 
      return this.radius; 
   }

   public void setRadius(double radius) { 
      this.radius = radius;
   }

   public double getPerimeter() { 
      return 2*Math.PI*this.radius; 
   }

   public double getArea() { 
      return Math.PI*(this.radius*this.radius);
   }

   public boolean contains(double x, double y) { 
      double d = distance(x, y, this.x, this.y); 
      
      if (d < this.radius)
         return true; 
      else
         return false;
   }

   public boolean contains(Circle2D circle) { 
      double d = distance(circle.x, circle.y, this.x, this.y);
         
      if (d < this.radius)
         return true; 
      else
         return false;
   }

   public boolean overlaps(Circle2D circle) { 
      double d = distance(circle.x, circle.y, this.x, this.y);
      
      if (d <= circle.radius + this.radius) 
         return true; 
      else 
         return false; 
   }

   private static double distance(double x1, double y1, double x2, double y2) { 
      return Math.sqrt((y2 - y1)*(y2 - y1)+(x2 - x1)*(x2 - x1)); 
   }
}
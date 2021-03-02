//Michael Skipper, N01162792
import java.util.Scanner;

class MyInteger { 

   private int value;

   public int getValue() {
      return value;
   }

   public MyInteger(int value) { 
      this.value = value;
   }

   public boolean isEven() { 
      return (value % 2) == 0;
   }

   public boolean isOdd() {
      return(value % 2) == 1;
   }
   
   public boolean isPrime() { 
      for (int i = 2; i < value; i++) { 
         if (value % i == 0) 
            return false;
      }
      return true; 
   } 

   public static boolean isEven(int n) { 
      return (n % 2) ==0; 
   }
 
   public static boolean isOdd(int n) { 
      return (n % 2) == 1; 
   }

   public static boolean isPrime(int n) { 
      for (int i = 2; i < n; i++) { 
         if (n % i == 0) 
            return false;
      }
      return true; 
   }

   public static boolean isEven(MyInteger n) { 
      return n.isEven(); 
   }
   
   public static boolean isPrime(MyInteger n) { 
      return n.isPrime(); 
   }  
   
   public static boolean isOdd(MyInteger n) { 
      return n.isOdd(); 
   }
   
   public boolean equals(int anotherNum) { 
      if (anotherNum ==value) 
         return true; 
      return false; 
      }
   
   public boolean equals(MyInteger n) { 
      if (n.value == this.value)
         return true; 
      return false; 
   } 
   
}
import java.util.Scanner;
public class Countdigits
  {
    public static void main(String[] args) {
      int count = 0 , num = 0003452;
      while (num !=0) {
        num /=10;
        ++count;
      }
      System.out.println("Number of digits: " + count);
    }
    
  }
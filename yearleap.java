import java.util.Scanner;
class Yearleap
  {
    public static void main(String arges[])
    {
      int year;
      System.out.println("enter the year:");
      Scanner sc=new Scanner(System.in);
      year = sc.nextInt();
      if(year%4==0 || year%400==0)
      {
        System.out.println("it is a leap year");
        }
      else
      {
      System.out.println("it is a non leap year");
        }
      }
      
  }
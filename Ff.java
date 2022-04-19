/*
6.Write a java program to check whether a year is leap year or not 
*/
import java.util.Scanner;
class Ff
  {
    public static void main(String args[])
    {
      int year;
      System.out.println("enter the year:");
      Scanner sc=new Scanner(System.in);
      year = sc.nextInt();
      if((year%4==0)||(year%400==0))
      {
         System.out.println("it is a leap year");
      }
      else
      {
         System.out.println("it is a non leap year");
      }
    }
  }
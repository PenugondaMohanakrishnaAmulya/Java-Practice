import java.util.Scanner;
class EvenOdd
  {
    public static void main(String arges[])
    {
      int a;
      System.out.println("enter the number:");
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      if(a%2==0)
      {
        System.out.println("number even");
        }
      else
      {
      System.out.println("number is odd");
        }
      }
      
  }
import java.util.Scanner;
class PositiveNeg
  {
    public static void main(String arges[])
    {
      int a;
      System.out.println("enter the number:");
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      if(a>0)
      {
        System.out.println("positive");
        }
      else
      {
      System.out.println("negitive");
        }
      }
      
  }
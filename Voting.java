import java.util.Scanner;
class Voting
  {
    public static void main(String arges[])
    {
      int age;
      System.out.println("enter the ageof persion:");
      Scanner sc=new Scanner(System.in);
      age=sc.nextInt();
      if(age>=18)
      {
        System.out.println("eligibile to voting");
        }
      else
      {
      System.out.println("not eligibile to voting");
        }
      }
      
  }
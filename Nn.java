/*
14. Write a JAVAprogram to input basiJAVAsalary of an employee and calculate its Gross     salary according to following:
    BasiJAVASalary <= 10000 : HRA = 20%, DA = 80%
    BasiJAVASalary <= 20000 : HRA = 25%, DA = 90%
    BasiJAVASalary > 20000 : HRA = 30%, DA = 95%
  */
import java.util.Scanner;
class Nn
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter BasiJAVASalary:");
      int sal=sc.nextInt();
      if(sal >= 20000)
      {
         System.out.println("HRA = 25%, DA = 90%");
      }
      else if (sal <= 10000)
      {
         System.out.println("HRA = 20%, DA = 80%");
      }
       else if (sal > 20000)
      {
        System.out.println("HRA = 30%, DA = 95%");
      }
      }
  }
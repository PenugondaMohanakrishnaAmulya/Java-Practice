import java.util.Scanner;
class Sumofeven
  {
    public static void main(String args[])
    {
      int a[]=new int[5];
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the array value");
      int sum=0;
      for(int i=0;i<5;i++)
      {
        a[i] = sc.nextInt();
      }
      System.out.println("array values are");
       for(int i=0;i<5;i++)
         {
           if(a[i]%2==0)
         sum=sum+a[i];
         }
     System.out.println(sum);
    }
  }
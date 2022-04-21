import java.util.Scanner;
class Mini
  {
    public static void main(String args[])
    {
      int a[]=new int[5];
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the array value");
      for(int i=0;i<5;i++)
      {
        a[i] = sc.nextInt();
      }
      int min=a[0];
      System.out.println("array values are");
       for(int i=0;i<5;i++)
         {
           if(a[i]%5==0)
             min=a[i];
          
       }
     System.out.println(min);
    }
  }
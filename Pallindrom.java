import java.util.Scanner;
public class Pallindrom
  {
    public static void main (String[]args){
      int num,rNUM=0, rem;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number ");
      num=sc.nextInt();
      int oNUM=num;
      while (num!=0)
       {
        rem =num%10;
        rNUM=rNUM *10+rem;
        num/=10;
        }
      if(oNUM == rNUM) 
      {
        System.out.println(oNUM+" is palindrome");
      }
      else 
     {
        System.out.println(oNUM +" is not palindrome");
      }
    }
  }
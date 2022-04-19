/*
Write a JAVAprogram to print day of week name using switch case
*/
import java.util.Scanner;
class Pp
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enterr any number of day=");
      char n=sc.next().charAt(0);
      switch (n)
        {
          case'1':
            System.out.println(" Monday ");
            break;
            case'2':
            System.out.println(" Tuesday ");
            break;
            case'3': 
            System.out.println(" Wednesday ");
            break;
            case'4':
            System.out.println(" Thursday ");
            break;
            case'5': 
            System.out.println(" Friday ");
            break;
            case'6':
            System.out.println(" Saturday ");
            break;
            case'7': 
            System.out.println(" Sunday ");
          break;
          default:
          System.out.println(n+"is not a day");
        }
      }
  }
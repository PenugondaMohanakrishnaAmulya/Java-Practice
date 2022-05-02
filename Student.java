import java.util.Scanner;
class Student
  {
      String name;
      int rollnumber;
      String branch;
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    Student st1=new Student();
      st1.name="Amulya";
      st1.rollnumber=456;
        st1.branch="ECE";
      Student st2=new Student();
      st2.name="Dinesh";
      st2.rollnumber=333;
      st2.branch="ECE";
      System.out.println(st1.name+" "+st1.rollnumber+" "+st1.branch+" ");
      System.out.println(st2.name+" "+st2.rollnumber+" "+st2.branch+" ");
      
      }
  }
    
  
      
      
    
  
import java.util.Scanner;
class Person
  {
    String name;
    int Id;
    int age;
    void college()
    {
      System.out.println("XYZ College");
    }
  }
class Student extends Person
  {
    String dept;
    void study()
    {
      System.out.println("Studying");
    }
  }
class Employe extends Person
  {
    int Salary;
  void teach()
   {
    System.out.println("Teaching");
   }
  }
class Graduate extends Student
  {
    String Course;
  }
class Postgraduate extends Student
  {
    String Subject;
  }
class Faculty extends Employe
  {
    String teach_sub;
  }
class Staff extends Employe
  {
    String work;
  }
class Masters extends Postgraduate
  {
    String Group;
  }
class Phd extends Postgraduate
  {
    String Topic;
  }
class People
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Person per=new Person();
      System.out.println("Enter the person name:");
      String name=sc.nextLine();
      System.out.println("Enter the Id number");
      int Id=sc.nextInt();
      System.out.println("Enter the age");
      int age=sc.nextInt();
     per.college();
      System.out.println("name : "+name+"\n Id is : "+Id+"\n age is : "+age+" ");
      
    }
  }
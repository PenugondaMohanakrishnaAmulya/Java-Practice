import java.util.*;
class Student
  {
    private int rollno;
    private String name;
    void setRollno(int rollno)
    {
      this.rollno=rollno;
    }
    int getRollno()
    {
      return this.rollno;
    }
    void setName(String name)
    {
      this.name=name;
    }
    String getName()
    {
      return this.name;
    }
  }
class SetGet
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Student st=new Student();
      System.out.println("Enter rollno");
      st.setRollno(sc.nextInt());
      System.out.println("enter name");
      st.setName(sc.next());
      System.out.println(st.getRollno()+st.getName());
      }
  }
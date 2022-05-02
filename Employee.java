import java.util.Scanner;
class Employee
  {
    String name;
      int employeeID;
      String dept;
      int salary;
      
    public static void main(String args[])
    {
      Employee emp1 = new Employee();
      emp1.name="Bavitha";
      emp1.employeeID=144228;
      emp1.dept="System Engineer";
      emp1.salary=25000;
      Employee emp2 = new Employee();
      emp2.name="Lohith";
      emp2.employeeID=144313;
      emp2.dept="Service manager";
      emp2.salary=30000;
      System.out.println(emp1.name+" "+emp1.employeeID+"  "+emp1.dept+"  "+emp1.salary+"/-");
      System.out.println(emp2.name+"  "+emp2.employeeID+"  "+emp2.dept+"  "+emp2.salary+"/-");
    }
  }
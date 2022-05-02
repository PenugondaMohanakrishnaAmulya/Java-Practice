import java.util.*;
class Emp
  {
    private int id;
    private String name;
    private String dep;
    private Long salary;
    void setId(int id)
    {
      this.id=id;
    }
    int getId()
    {
      return this.id;
    }
    void setName(String name)
    {
      this.name=name;
    }
    String getName()
    {
      return this.name;
    }
    void setDep(String dep)
    {
      this.dep=dep;
    }
    String getDep()
    {
      return this.dep;
    }
    void setSalary(long salary)
    {
      this.salary=salary;
    }
    long getSalary()
    {
      return this.salary;
    }
  }
class Empolyee
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Emp st=new Emp();
       Emp st1=new Emp();
      //empoly first person data
      System.out.println("Enter id");
      st.setId(sc.nextInt());
      System.out.println("Enter name");
      st.setName(sc.next());
      System.out.println("Enter dep");
      st.setDep(sc.next());
      System.out.println("Enter Salary");
      st.setSalary(sc.nextLong());      
      //empoly second person data
      System.out.println("Enter id");
      st1.setId(sc.nextInt());
      System.out.println("Enter name");
      st1.setName(sc.next());
      System.out.println("Enter dep");
      st1.setDep(sc.next());
      System.out.println("Enter Salary");
      st1.setSalary(sc.nextLong());
      //to get output
      System.out.println(st.getId()+" "+st.getName()+" "+st.getDep()+" "+st.getSalary());
      System.out.println(st1.getId()+" "+st1.getName()+" "+st1.getDep()+" "+st1.getSalary());
      }
  }

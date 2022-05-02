class student
  {
    String Name;
    int Rollnumber;
    String Branch;
    void reading()
    {
      System.out.println("reading");
    }
    void writing()
    {
      System.out.println("writen");
    }
  }

//MAIN METHOD
class Student1
  {
    public static void main(String args[])
    {
      Student St1=new Student();
      St1.name="amulya";
      St1.rollnumber=456;
      St1.branch="ece";
      
      System.out.println(St1.name+" "+St1.rollnumber+" "+St1.branch);
    }
  }
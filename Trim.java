public class Trim
  {
    public static void main(String arg[])
    {
     String str1="Bitlabs";
    String str2="Bitlabs";
    String str3=new String("Bitlabs");
    String str4= "tarun tarun tarun tarun";
    if(str3==str4)
       {
       System.out.println("true");
       }
else
    {
  System.out.println("false");
}
  if(str1.equals(str2))
  {
    System.out.println("true");
  }
else
  {
    System.out.println("false");
  }
      System.out.println(str4);
      System.out.println(str4.trim());
}
  }
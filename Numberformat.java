class Numberformat
{
  public static void main(String args[])
  {
    String str="123";
    int a=Integer.parseInt(str);
    try{
      System.out.println(a);
    }
    catch (ArithmeticException e)
      {
        System.out.println(e);
        }
    System.out.println("expection Handled");
  }
}
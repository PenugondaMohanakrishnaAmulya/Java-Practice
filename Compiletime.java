class Addition
  {
    int add(int a,int b)
    {
      return(a+b);
      }
    int add (int a,int b,int c)
    {
      return(a+b+c);
      }
      double add(double d,double s)
      {
        return(d+s);
      }
    }
    class Compiletime
      {
        public static void main(String args[])
        {
        Addition a=new Addition();
int x=a.add(2,3);
int y=a.add(2,3,4);
double z=a.add(2.3,4.5);
System.out.println(x+" "+y+" "+z);
    }
  }
class Ar
  {
    int rec(int a,int b)
    {
      return(a*b);
    }
     int sqr(int a)
    {
      return(a*a);
    }
     double cir(double r)
    {
      return(3.14*r*r);
    }
     double tri(double l,double b)
    {
      return((1/2)*l*b);
    }
  }
class Area
  {
    public static void main(String args[])
    {
      Ar a=new Ar();
      int x=a.rec(2,3);
      System.out.println("area of rectangle : "+x);
      int y=a.sqr(4);
      System.out.println("area of square : "+y);
      double z=a.cir(5);
      System.out.println("area of circle : "+z);
      double m=a.tri(4,3);
      System.out.println("area of triangle : "+m);
      
    }
  }
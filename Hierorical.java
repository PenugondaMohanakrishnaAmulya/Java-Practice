class Animl
  {
    String color;
    void eat()
    {
      System.out.println("eating");
    }
  }
class Dg extends Animal
  {
    String breed;
    void bark()
    {
      System.out.println("barking");
    }
  }
class Cats extends Animl
  {
  void meow()
   {
    System.out.println("running");
   }
  }
class Hierorical
  {
    public static void main(String args[])
    {
      Cats d=new Cats();
      d.color="white";
      System.out.println(d.color+" ");
      d.eat();
      d.meow();
    }
  }
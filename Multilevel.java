class Animall
  {
    String color;
    void eat()
    {
      System.out.println("eating");
    }
  }
class Dogg extends Animal
  {
    String breed;
    void bark()
    {
      System.out.println("barking");
    }
  }
class Cat extends Dogg
  {
  void meow()
   {
    System.out.println("running");
   }
  }
class Multilevel
  {
    public static void main(String args[])
    {
      Cat d=new Cat();
      d.color="white";
      d.breed="husky";
      System.out.println(d.color+" "+d.breed);
      d.eat();
      d.bark();
      d.meow();
    }
  }
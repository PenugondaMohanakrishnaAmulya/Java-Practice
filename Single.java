class Animal
  {
    String color;
    void eat()
    {
      System.out.println("eating");
    }
  }
class Dog extends Animal
  {
    String breed;
    void bark()
    {
      System.out.println("barking");
    }
  }
class Single
  {
    public static void main(String args[])
    {
      Dog d=new Dog();
      d.color="white";
      d.breed="husky";
      System.out.println(d.color+" "+d.breed);
      d.eat();
      d.bark();
    }
  }
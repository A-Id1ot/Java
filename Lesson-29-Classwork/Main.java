class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}
  void init(){
    Dog Toto=new Dog();
    Toto.name="Toto";
    Dog Snoopy=new Dog();
    Snoopy.name="Snoopy";
    Dog Poophy=new Dog();
    Poophy.name="Poophy";
    class Dog{
      String breed;
      int age;
      String name;
      void bark(){
        System.out.println("Bark my name is"+name);
      }
    }
    Toto.bark();
    Snoopy.bark();
    Poophy.bark();
  }
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }
}
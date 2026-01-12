class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}
  void init(){
    Animal pig=new Animal("pig",90,5);
    System.out.println(pig.isHealthy());
    Animal dog=new Animal("dog",40,3);
    System.out.println(dog.isHealthy());
  }
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }
}
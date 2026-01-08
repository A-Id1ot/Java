class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}
  void init(){
    class car{
      String brand;
      String color;
      String model;
      int year;
      double value;
      car(String brand, String color, String model, int year, double value){
        this.brand=brand;
        this.color=color;
        this.model=model;
        this.year=year;
        this.value=value;
      }
      void honk(){
        System.out.println("honk honk");
      }
    }
  }
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }
}
class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}
  void init(){
    car car1=new car("Toyota","grey","Corolla",2010,20000);
    car car2=new car("Ford","grey","F150",2012,23000);
    print(car1.brand+" "+car1.model+" "+car1.value);
    print(car2.brand+" "+car2.model+" "+car2.value);
  }
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
      System.out.println("This car is a "+color+" "+year+" "+brand+" "+model+" that is worth "+value);
    }
  }
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }
}
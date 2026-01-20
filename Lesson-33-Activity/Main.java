class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}
  void init(){
    CartItem uhhh=new CartItem("null", 0, 10000, true);
    System.out.println("The "+uhhh.itemName+" costs "+uhhh.itemPrice+);
    CartItem cigarettes=new CartItem("cigarettes", 6, 500, false);
    System.out.println("The "+cigarettes.itemName+" costs "+cigarettes.itemPrice);
    CartItem soup=new CartItem("soup",10,12,false);
    System.out.println("The "+soup.itemName+" costs "+soup.itemPrice);
  }
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }
}
class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}
  void init(){
    allowance();
    addTwoNumbers();
  }
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }
  void allowance(){
    int d=1;
    int p=1;
    while (!(500<p)){
      print(p);
      p+=Math.pow(2,d);
      d++;
    }
    print("Days: "+ d);
  }
  void addTwoNumbers(){
    int n1 = randInt(-100,100);
    int n2 = randInt(-100,100);
    int a=0;
    print(n1+" + "+n2+" = ?");
    while(n1+n2!=a){
      a=Input.readInt();
      if(n1+n2==a){
        print("Correct The answer was "+a);
      }
      else{
        print("That is not correct");
      }
    }
  }
}
class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println(approxPI(10));
  }
  float approxPI(int t){
    float total = 0;
      for (int i = 0; i < t; i++) {
        double term=Math.pow(-1,i)/(2*i+1);
        total+=term;
      }
    return 4*total;
  }
}
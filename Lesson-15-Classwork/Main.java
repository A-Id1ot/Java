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
    float pi=0;
    for(int i=1;1<=t;i++){
      pi+=4*(1/t);
    }
    return pi;
  }
}
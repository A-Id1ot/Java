class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}
  void init(){
    String[] f={"adrian","thatoneguyfromthestreet","dudeman"};
    double[] t={-4,5,0,23,34,5,10};
    double[] tf = convert(t);
    print(tf);
  }
  double[] convert(double[] t){
    double[] f1=new double[t.length];
    for(int i=0;i<=t.length-1;i++){
      f1[i] = celsiusToFarhenheit(t[i]);
    }
    return f1;
  }
  double celsiusToFarhenheit(double c){
    return c*9/5+32;
  }
}
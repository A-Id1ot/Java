class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}
  void init(){
    System.out.println(specs(1));
    System.out.println(harmonic(3));
    System.out.println(fib(1));
  }
  String specs(int N){
    String a="";
    for (int i=0;i<=N;i++){
      a+=" ";
    }
    return a+"DONE";
  }
  double harmonic(int N){
    double q=0;
    for(int i=1;i<=N;i++){
      q+=Math.pow(i,-1);
    }
    return q;
  }
  int fib(int n){
    int f=0,s=1;
    for (int i=0;i<n;i++) {
      System.out.print(f);
      if(i<=n-1) System.out.print(", "); 
        int n1=f+s;
        f=s;
        s=n1;
    }
    return s;
  }
}
class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}
  void init(){
    double[] p={10,3,59,6,2,5};
    int[] n={2,4,6,8,10,12,14,16,18,20,22};
    int[] l={0,7,4,2,3,2};
    int[] w={6,7,5,2,9,5};
    print(total(p));
    print(isin(n, 2));
    print(checkLotto(l,w));
  }
  // Use these functions below for the activity
  String convertToEmoji(String code){
    return String.valueOf(Character.toChars(
                               Integer.parseInt(code, 16)));
  }
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }
  boolean isPrime(int n){
    int divisor = 2;
    while(n%divisor !=0){
      divisor+=1;
    }
    if(divisor==n)
      return true;
    else
      return false;
  }
  double total(double[] p){
    double s = 0;
    for (int i=0;i<p.length;i++) {
      s+=p[i];
    }
    s=(int)(100*(s*1.08525));
    return s/100;
  }
  boolean isin(int[] n,int s){
    boolean in=false;
    for (int i=0;i<n.length;i++) {
      if(n[i]==s){
        in=true;
      }
    }
    return in;
  }
  int checkLotto(int[] l,int[] a){
    int c=0;
    for(int i=0;i<a.length;i++) {
      if(isin(l,a[i])){
        c++;
      }
    }
    return c;
  }
}
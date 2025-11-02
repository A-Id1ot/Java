class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}
  void init(){
    System.out.println(swapLetter("the seen","e","%"));
    System.out.println(encryption2("abcdefghi"));
    System.out.println(encryption3("abcdef"));
  }
  //will use reverse for problem 3
  String reverse(String s){
    String bld="";
    for(int x=s.length()-1; x>=0; x--)
      bld+=s.substring(x,x+1);
    return bld;
  }
  String swapLetter(String s,String c, String r){
    String bld="";
    for(int x=0;x<=s.length()-1;x++){
      String l=s.substring(x,x+1);
      if(l.equals(c)){
        bld+=r;
      }
      else{
        bld+=l;
      }
    }
    return bld;
  }
  String encryption2(String t){
    String bld="";
    String sh1="";
    String fh = t.substring(0,t.length()/2);
    String sh = t.substring(t.length()/2);
    for (int x=0;x<fh.length();x++){
      String l1=fh.substring(x,x+1);
      String l2=sh.substring(x,x+1);
      bld+=l1+l2;
    }
    if (t.length()%2!=0){
      sh1=sh.substring(sh.length()-1);
      bld+=sh1;
    }
    return bld;
  }
  String encryption3(String s){
    String result="";
    int n=s.length();
    for (int i=0;i<n/2;i++) {
      result = result+s.substring(i,i+1)+s.substring(n-1-i,n-i);
    }
    return result; // no middle character
  }
}
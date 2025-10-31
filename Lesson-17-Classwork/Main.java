class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}
  void init(){
    System.out.println(swapLetter("the seen","e","%"));
    System.out.println(encryption2("abcdefghi"));
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
    String fh = t.substring(0,t.length()/2);
    String sh = t.substring(t.length()/2);
    for (int x=0;x<fh.length();x++){
      String l1=fh.substring(x,x+1);
      String l2=sh.substring(x,x+1);
      bld+=l1+l2;
    }
    if (t.length()%2!=0) 
      String sh1(sh.length()-1);
      bld+=sh1;
    }
    return bld;
  }
}
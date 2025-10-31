class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}
  void init(){
    System.out.println(swapLetter("the seen","e","%"));
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
      if(t.length()%2!=0){
        String t1=t.substring(0,(t.length()-1)/2);
        String t2=t.substring((t.length()+1)/2);
        for(int x=0;x<=t1.length();x+=2){
        }
        bld=t1+t2;
      }else{
        String t1=t.substring(0,(t.length()-1)/2);
        String t2=t.substring((t.length()+1)/2);
        for(int x=0;x<=t1.length();x+=2){
        }
        bld=t1+t2;
      }
    return bld;
  }
}
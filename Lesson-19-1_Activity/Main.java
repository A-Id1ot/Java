class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}
  void init(){
    print(rollDice());
    print(lotto());
    print(additionTutor());
  }
  String rollDice(){
    int fr=(int)(Math.random()*6)+1;
    int sr=(int)(Math.random()*6)+1;
    String a=fr+" "+sr;
    return a;
  }
  String lotto(){
    String bld="";
    for(int x=0;x<5;x++){
      int rr=(int)(Math.random()*48)+1;
      bld+=rr+" ";
    }
    return bld;
  }
  String additionTutor(){
    int fn=(int)(Math.random()*60)+1;
    int sn=(int)(Math.random()*60)+1;
    print("What is the answer:");
    print(fn + " + " + sn + " = ? ");
    int a=Input.readInt();
    if(a==fn+sn){
      return "Correct!";
    }
    else{
      return "Incorrect.";
    }
  }
}
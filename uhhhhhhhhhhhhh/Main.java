class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}
  void init(){
    String m = "Hi yo";
    System.out.println(e(m));
    //print(d(e(m)));
  }
  int[] e(String s){
    int randomNum = (int)(Math.random() * 255);
    System.out.println(randomNum);
    int[] newarray = new int[s.length()];
    System.out.println(s);
    for(int i = 0; i < s.length(); i++){
    	int result = s.charAt(i);
        newarray[i] = result+randomNum;
		System.out.println(newarray[i]);
    }
    int[] suffering = new int[newarray.length+1];
    for(int i = 0; i < newarray.length; i++){
    	if(newarray[i] % 4 == 0){
        suffering[i] = newarray[i]/4;
      }
      else{
     		suffering[i] = newarray[i]*4;
      }
    }
    return suffering;
  }
  
}
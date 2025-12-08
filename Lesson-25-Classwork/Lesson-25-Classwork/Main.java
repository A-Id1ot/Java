class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}
  void init(){
    String myStr = "Hi yo";
  }
    int randomNum = (int)(Math.random() * 255);
    System.out.println(randomNum);
    String newstring = "";
    int[] newarray = new int[myStr.length()];
    System.out.println(myStr);
    for(int i = 0; i < myStr.length(); i++){
    	int result = myStr.charAt(i);
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
		System.out.println(suffering[i]);
    }
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }
}
class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}
  void init(){
    System.out.println(creditCardType("711"));
  }
  String creditCardType(String cr){
    if(cr.substring(0,1).equals("4")){
      return "Visa";
    }
    else if(cr.substring(0,2).equals("34")||cr.substring(0,2).equals("37")){
      return "America Express";
    }
    else if(cr.substring(0,2).equals("36")){
      return "Diner Club";
    }
    else if(cr.substring(0,2).equals("51")||cr.substring(0,2).equals("55")){
      return "Mastercard";
    }
    else if(cr.substring(0,4).equals("6011")||cr.substring(0,2).equals("65")){
      return "Discovery";
    }
    else{
      return "This ain't a credit card.";
    }
  }
}
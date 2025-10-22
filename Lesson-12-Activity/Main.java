class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}
  void init(){
    System.out.println(creditCardType("711123"));
    System.out.println(pigLatin("agsfd"));
    System.out.println(nycLocate("10344"));
    System.out.println(getMonth("10/12/26"));
    System.out.println(validatePswd("false()"));
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
  String pigLatin(String w){
    String w1=w.substring(1,w.length())+w.substring(0,1)+"ay";
    return w1;
  }
  String nycLocate(String z){
    if(z.substring(0,3).equals("100")||z.substring(0,3).equals("101")||z.substring(0,3).equals("102")){
      return "Manhattan";
    }
    else if(z.substring(0,3).equals("103")){
      return "Staten Island";
    }
    else if(z.substring(0,3).equals("104")){
      return "Bronx";
    }
    else if(z.substring(0,3).equals("112")){
      return "Brooklyn";
    }
    else if(z.substring(0,3).equals("111")||z.substring(0,3).equals("113")||z.substring(0,3).equals("114")){
      return "Queens";
    }
    else{
      return "Not in NY";
    }
  }
  String getMonth(String d){
    if(d.substring(0,2).equals("01")){
      return "January";
    }
    else if(d.substring(0,2).equals("02")){
      return "Febuary";
    }
    else if(d.substring(0,2).equals("03")){
      return "March";
    }
    else if(d.substring(0,2).equals("04")){
      return "April";
    }
    else if(d.substring(0,2).equals("05")){
      return "May";
    }
    else if(d.substring(0,2).equals("06")){
      return "June";
    }
    else if(d.substring(0,2).equals("07")){
      return "July";
    }
    else if(d.substring(0,2).equals("08")){
      return "August";
    }
    else if(d.substring(0,2).equals("09")){
      return "September";
    }
    else if(d.substring(0,2).equals("10")){
      return "October";
    }
    else if(d.substring(0,2).equals("11")){
      return "November";
    }
    else if(d.substring(0,2).equals("12")){
      return "December";
    }
    else{
      return"Not a valid date";
    }
  }
  boolean validatePswd(String p){
    if(p.length()>=5&&p.length()<=8&&p.indexOf("^")<0&&p.indexOf("*")<0&&p.indexOf("(")<0&&p.indexOf(")")<0){
      return true;
    }
    else{
      return false;
    }
  }
}
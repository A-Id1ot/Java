class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println(collegeCredit("asdfasdf"));
    System.out.println(getCounsoler("Hello","World"));
    System.out.println(imageType("something.png"));
  }
  boolean collegeCredit(String co){
    if(co.substring(5,6).equals("M")||co.substring(5,6).equals("E")){
      return true;
    }
    else{
      return false;
    }
  }
  String getCounsoler(String fi, String mi){
    if(fi.substring(0,1).equals("B")||mi.substring(0,1).equals("B")){
      return "Berrouet";
    }
    else if(fi.substring(0,1).equals("C")||mi.substring(0,1).equals("C")){
      return "Chu";
    }
    else if(fi.substring(0,1).equals("D")||mi.substring(0,1).equals("D")){
      return "Dinn";
    }
    else if(fi.substring(0,1).equals("E")||mi.substring(0,1).equals("E")){
      return "Eyzengart";
    }
    else if(fi.substring(0,1).equals("F")||mi.substring(0,1).equals("F")){
      return "Flores";
    }
    else if(fi.substring(0,1).equals("G")||mi.substring(0,1).equals("G")){
      return "Gibson";
    }
    else if(fi.substring(0,1).equals("L")||mi.substring(0,1).equals("L")){
      return "Shim Lee";
    }
    else if(fi.substring(0,1).equals("M")||mi.substring(0,1).equals("M")){
      return "Meltzer";
    }
    else if(fi.substring(0,1).equals("P")||mi.substring(0,1).equals("P")){
      return "Paccione";
    }
    else if(fi.substring(0,1).equals("S")||mi.substring(0,1).equals("S")){
      return "Fiore";
    }
    else if(fi.substring(0,1).equals("T")||mi.substring(0,1).equals("T")){
      return "Tsai";
    }
    else{
      return "Zayes";
    }
  }
  String imageType(String fil){
    if(fil.substring(fil.indexOf('.') + 1).equals("jpeg")||fil.substring(fil.indexOf('.') + 1).equals("jpg")){
      return "Joint Photographic Experts Group";
    }
    else if(fil.substring(fil.indexOf('.') + 1).equals("png")){
      return "Portable Network Graphics";
    }
    else if(fil.substring(fil.indexOf('.') + 1).equals("gif")){
      return "Graphics Interchange Format";
    }
    else if(fil.substring(fil.indexOf('.') + 1).equals("pdf")){
      return "Portable Document Format";
    }
    else{
      return "Unknown file type";
    }
  }
}
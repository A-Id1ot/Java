class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
	print("hello");
	FtoC(100);
	sphereVolume(2);
	coneVolume(2, 2);
	distance(1,2,3,4);
  }
  void print(String word){
    System.out.println(word);
  }
  void FtoC(double f){
	double c=(f-32)*(5/9.0);
	System.out.println(c);
  }
  void sphereVolume(double r){
	double sv=(4/3.0)*Math.PI*Math.pow(r,3);
	System.out.println(sv);
  }
  void coneVolume(double r2,double h){
	double cv=Math.PI*Math.pow(r2,2)*(h/3.0);
	System.out.println(cv);
  }
  void distance(double x1,double y1,double x2, double y2){
	double d=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
	System.out.println(d);
  }
}
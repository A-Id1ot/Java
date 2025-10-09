class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}
	void init(){
		System.out.println(gpa(3.7));
		System.out.println(isGraduating(12,45));
		System.out.println(BMI(180,65));
		System.out.println(shippingCost(120));
		System.out.println(blueOrViolet(725));
	}
	double gpa(double g){
		double s=(g*100)/4;
		if(s>90){
			return s*1.1;
		}
		else{
			return s;
		}
	}
	String isGraduating(int glvl,int cred){
		boolean gr=false;
		if(glvl==11&&cred>=44){
			gr=true;
		}
		if(gr=true){
			return "Student is Graduating";
		}
		else{
			return"Student is NOT Graduating";
		}
	}
	String BMI(double weight, int height){
		double bmi=(weight*703/height)/height;
		if(bmi<=18.4){
			return "Underweight";
		}
		else if(bmi>=18.5&&bmi<=24.9){
			return "Normal";
		}
		else if(bmi>=25.0&&bmi<=39.9){
			return "Overweight";
		}
		else{
			return "Obese";
		}
	}
	double shippingCost(double weight){
		if(weight<=10){
			return 0.0;
		}
		else if(weight>=10&&weight<=15){
			return 5.00;
		}
		else if(weight>=15&&weight<=25){
			return 10.0;
		}
		else{
			return 10+(0.02*(weight-25));
		}
	}
	boolean blueOrViolet(double THz){
		if(THz>=600&&THz<=670){
			return true;
		}
		else if(THz>=700&&THz<=750){
			return true;
		}
		else{
			return false;
		}
	}
}
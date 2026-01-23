class Main {
  public static void main(String[] args)throws Exception {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}
  void init()throws Exception{
    CreateList list=new CreateList("CR101.csv");
    Student[] students = list.getStudentArray();
    // add your code below here
    int f=0;
    int p=0;
    for(int i=0;i<students.length;i++){
      Student student=students[i];
      if(student.getGpa()<65.0){
        f++;
      }
      else{
        p++;
      }
    }
    print("failing students: "+f);
    print("passing students: "+p);
    print("percentage failing: "+(f*100.0/students.length)+"%");
    int fc=0;
    for(int i=0;i<students.length;i++){
      Student student=students[i];
      if (student.findTeacher("Castro R")&&student.getGpa()<65.0){
        fc++;
      }
    }
    print("castro R students failing: " + fc);
    int fm=0;
    for(int i=0;i<students.length;i++){
      Student student=students[i];
      if (!student.findCourseStartingWith("UL")) {
        fm++;
      }
    }
    print("students not taking taking music: " + fm);
    int im=0;
    for(int i=0;i<students.length;i++){
      Student student=students[i];
      if (student.findCourseStartingWith("UL")&&student.getGpa()<65.0){
        this.print(student.getId());
      }
    }
    int fs=0;
    for(int i=0;i<students.length;i++){
      Student student=students[i];
      if((student.getGradeLevel()==9||student.getGradeLevel()==10)&&student.getGpa()>90.0){
        fs++;
      }
    }
    print("freshmen and sophomores with gpa over 90: " + fs);
    int pb=0;
    for(int i=0;i<students.length;i++){
      Student student=students[i];
      if (student.findTeacher("Porchetta")||student.findTeacher("Banu")){
        pb++;
      }
    }
    print("students that have Banu and Porchetta has teachers: "+pb);
    int gf=0;
    int gso=0;
    int gj=0;
    int gse=0;
    for(int i=0;i<students.length;i++){
      Student student=students[i];
      if(student.getGradeLevel()==9){
        gf++;
      }else if(student.getGradeLevel()==10){
        gso++;
      }else if(student.getGradeLevel()==11){
        gj++;
      }else if(student.getGradeLevel()==12){
        gse++;
      }
    }
    print("freshmen:  " + gf);
    print("sphmores:  " + gso);
    print("juniors:  " + gj);
    print("seniors:  " + gse);
    gf=0;
    gso=0;
    gj=0;
    gse=0;
    for(int i=0;i<students.length;i++){
      Student student=students[i];
      if (student.findTeacher("Porchetta")) {
        if(student.getGradeLevel()==9){
          gf++;
        }else if(student.getGradeLevel()==10){
          gso++;
        }else if(student.getGradeLevel()==11){
          gj++;
        }else if(student.getGradeLevel()==12){
          gse++;
        }
      }
    }
    print("porchetta freshmen:  " + gf);
    print("porchetta sphmores:  " + gso);
    print("porchetta juniors:  " + gj);
    print("porchetta seniors:  " + gse);
  }
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }
}
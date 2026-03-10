import java.io.IOException;
import java.sql.*;
//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java
//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; ServerExample.java
class Main {
 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}
  void init() {
      Database db=new Database("jdbc:sqlite:students.db");
      //String sql = "Select * From cr101 where teacher1 = 'BANU';";
      //String queryRequest = db.runSQL(sql, "table-auto");
		  //print(queryRequest);
      //String sql = "Select * From cr101 where teacher1 = 'PORCHETTA' and period = '10';";
      //String queryRequest = db.runSQL(sql, "table-auto");
		  //print(queryRequest);
      //String sql = "Select distinct studentid From cr101";
      //String queryRequest = db.runSQL(sql, "table-auto");
      //print(queryRequest);
      //String sql = "Select studentid,course,period From cr101 where room in (322,105,106,323) and grade='11';";
      //String queryRequest = db.runSQL(sql, "table-auto");
      //print(queryRequest);
      String sql = "Select * From cr101 where course like 'M%X';";
      String queryRequest = db.runSQL(sql, "table-auto");
      print(queryRequest);
  }
}
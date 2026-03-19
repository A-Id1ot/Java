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
    String result="";
    String sql = "";
		Database db = new Database("jdbc:sqlite:chinook.db" );	
    //select albums.Title, artists.Name from albums
    //inner join artists on albums.ArtistId = artists.ArtistId limit 20;
    //select tracks.Name from tracks
    //inner join genreson tracks.GenreId = genres.GenreId where genres.Name IN ('Blues', 'Latin', 'Pop', 'Classical') limit 20;
    select tracks.Name from tracks
    inner join playlist_track on tracks.TrackId = playlist_track.TrackId inner join playlists on playlist_track.PlaylistId = playlists.PlaylistId where playlists.Name = 'Grunge' limit 20;
  }    
}
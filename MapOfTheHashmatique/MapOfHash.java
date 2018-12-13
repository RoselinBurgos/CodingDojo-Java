import java.util.*;
public class MapOfHash {
    public static void main(String[] args) {
        HashMap<String, String> songList = new HashMap<String, String>();
        songList.put("I want it that way.", "You are, my fire");
        songList.put("Wonderwall", "I said Maybe..");
        songList.put("Bye Bye Bye", "I'm doing this tonight.");
        songList.put("You are everything", "Today I saw somebody.");

        String title = songList.get("Wonderwall");
        System.out.println("The lyrics of the song are: " + title );
      
        Set<String> keys = songList.keySet();
        for(String key : keys) {
            System.out.println("Title: " + key); 
        }

        for(String key : keys){
            System.out.println("Lyrics: " + songList.get(key));
        }

        for(String key : keys){
            System.out.println("Title: " + key + " " + "Lyrics: " + songList.get(key));
        }

        
    }
}

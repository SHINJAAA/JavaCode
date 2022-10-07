import java.util.*;
public class Act_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> songs = new LinkedList<>();
        songs.add("We Belong Together");
        songs.add("Million Miles");
        songs.add("The Climb");
        songs.add("Who you are");
        songs.add("A Woman's Worth");
        
        LinkedList<String> artist = new LinkedList<>();
        artist.add("Mariah Carey");
        artist.add("Lady Gaga");
        artist.add("Miley Cirus");
        artist.add("Jessie J");
        artist.add("Alicia Keys");

        
        LinkedList<String> playlist = new LinkedList<>();
        playlist.addAll(songs);
        playlist.addAll(artist);
        
        System.out.println("Songs: "+songs);
        System.out.println("Artist: "+artist);
        System.out.println("\n");

        System.out.println(playlist.get(0) +" - "+ playlist.get(5));
        System.out.println(playlist.get(1) +" - "+ playlist.get(6));
        System.out.println(playlist.get(2) +" - "+ playlist.get(7));
        System.out.println(playlist.get(3) +" - "+ playlist.get(8));
        System.out.println(playlist.get(4) +" - "+ playlist.get(9));

    }
    
}

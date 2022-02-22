import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    // creating playlist
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    
    // adding songs to playlist
    desertIslandPlaylist.add("Immortal - Evanescence");
    desertIslandPlaylist.add("A Tribe Called Quest - Electric Relaxation");
    desertIslandPlaylist.add("Sneaker Pimps - Six Underground");
    desertIslandPlaylist.add("Still loving you - Scorpion");
    desertIslandPlaylist.add("Leave the door open - Bruno Mars");
    desertIslandPlaylist.add("Radiohead - Idioteque");
    desertIslandPlaylist.add("Bad habits - Ed Sheeran");
    desertIslandPlaylist.add("Gramatik - Good Evening, Mr. Hitchcock");
    desertIslandPlaylist.add("Woman - Kiss Me More");
    desertIslandPlaylist.add("The Modern Jazz Quartet - Django");
    
    // printing playlist
    // System.out.println(desertIslandPlaylist);
    
    // checking playlist size
    // System.out.println(desertIslandPlaylist.size());
    
    // removing songs
    desertIslandPlaylist.remove("Gramatik - Good Evening, Mr. Hitchcock");
    desertIslandPlaylist.remove("Bad habits - Ed Sheeran");
    desertIslandPlaylist.remove("The Modern Jazz Quartet - Django");
    desertIslandPlaylist.remove("Leave the door open - Bruno Mars");
    desertIslandPlaylist.remove("Woman - Kiss Me More");
    
    // System.out.println(desertIslandPlaylist);
    
    // swapping songs
    int indexA = desertIslandPlaylist.indexOf("Sneaker Pimps - Six Underground");
    int indexB = desertIslandPlaylist.indexOf("A Tribe Called Quest - Electric Relaxation");
    
    String tempA = "Sneaker Pimps - Six Underground";
    
    desertIslandPlaylist.set(indexA, "A Tribe Called Quest - Electric Relaxation");
    // System.out.println(desertIslandPlaylist);
    desertIslandPlaylist.set(indexB, tempA);
    System.out.println(desertIslandPlaylist);
    
  }
  
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ספי
 */
public class MusicSong {
    private int ID;
    private String title;
    private String Artist;
    private String Year;
   
    public MusicSong(String title, String Artist, String Year) {
        this.title = title;
        this.Artist = Artist;
        this.Year = Year;
        
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String Artist) {
        this.Artist = Artist;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

  

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return Artist;
    }

    public String getYear() {
        return Year;
    }

    @Override
    public String toString() {
        return "title=" + title + ", Artist=" + Artist + ", Year=" + Year +  '}';
    }
    
    
}

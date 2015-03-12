
import com.echonest.api.v4.Artist;
import com.echonest.api.v4.EchoNestAPI;
import com.echonest.api.v4.EchoNestException;
import com.echonest.api.v4.Track;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//https://github.com/echonest/jEN
/**
 *
 * @author ספי
 */
public class Mfile {
    String path;
    MusicSong m;
    
    
 
    private  MusicSong getID(String path) throws EchoNestException {
    EchoNestAPI echoNest = new EchoNestAPI();
    File f=new File(path);
    Track ans = null;
    MusicSong m=null;
        try {
          ans = echoNest.uploadTrack(f);
        } catch (IOException ex) {
             Logger.getLogger(RUN.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (ans != null){
            m=new MusicSong(ans.getTitle(), ans.getArtistName(), "0000");
             System.out.println(m.toString());
        }
    return m;
    }

    private  void setDIT(){
        if (m!=null)
       {
         File f= new File(path);
         Properties props = new Properties();
         props.
         f.
         
           
        }
        
    }
}

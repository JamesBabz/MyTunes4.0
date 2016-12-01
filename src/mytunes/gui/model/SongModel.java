/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunes.gui.model;

import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import mytunes.be.Song;

/**
 *
 * @author James
 */
public class SongModel {
    
    private Song contextSong;

    
    private static SongModel instance;

    public static SongModel getInstance()
    {
        if (instance == null)
        {
            instance = new SongModel();
        }
        return instance;
    }

    private SongModel()
    {
    }
    
    
    ObservableList<Song> songs = FXCollections.observableArrayList();

    public void addSong(Song song)
    {
        songs.add(song);

    }
    
    public void editSong(Song contextSong){
        for (int i = 0; i < songs.size()-1; i++) {
            Song song = songs.get(i);
             if (song.getTitle() == contextSong.getTitle()){
                int songIndex = i;
                song.setTitle(contextSong.getTitle());
                song.setArtist(contextSong.getArtist());
            }
            
            
        }
            
        }
           
            
        
    

    public List<Song> getSongs()
    {
        return songs;
    }
    
    public void setSongs()
    {
        
    }
    
    public Song getContextSong(){
        return contextSong;
     
    }

    public void setContextSong(Song contextSong) {
        this.contextSong = contextSong;
    }
    
    
    
    

}

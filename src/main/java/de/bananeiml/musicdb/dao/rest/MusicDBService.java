package de.bananeiml.musicdb.dao.rest;

import de.bananeiml.musicdb.server.dao.entity.Album;
import de.bananeiml.musicdb.server.dao.entity.Artist;
import de.bananeiml.musicdb.server.dao.entity.Title;
import java.util.Collection;

/**
 *
 * @author Martin Scholl
 */
public interface MusicDBService {
    
    public Album getAlbum(String id);
    public Collection<Album> getAlbums(String filter);
    public void createAlbum(Album album);
    public void deleteAlbum(String id);
    
    public Artist getArtist(String name);
    public Collection<Artist> getArtists();
    public void createArtist(Artist artist);
    public void deleteArtist(String name);
    
    public Title getTitle(String name);
    public Collection<Title> getTitles();
    public void createTitle(Title title);
    public void deleteTitle(String name);
    
}

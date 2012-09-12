package de.bananeiml.musicdb.dao.rest;

import de.bananeiml.musicdb.server.dao.entity.Artist;
import de.bananeiml.musicdb.server.dao.entity.Title;
import java.util.Collection;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Martin Scholl
 */
@Path("/musicdb")
public class MusicDBRestServiceImpl {// implements MusicDBService {

    public static final String ARTIST = "artist"; 
    public static final String ARTIST_NAME = "artistname";
    
    public static final String TITLE = "title";
    public static final String TITLE_NAME = "titleName";
    
    @GET
    @Path("/" + ARTIST)
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Artist> getArtists() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @GET
    @Path("/" + ARTIST + "/{" + ARTIST_NAME + "}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Artist getArtist(@PathParam(ARTIST_NAME) final String artistName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @PUT
    @Path("/" + ARTIST + "/{" + ARTIST_NAME + "}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Artist createArtist(@PathParam(ARTIST_NAME) final String artistName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @DELETE
    @Path("/" + ARTIST + "/{" + ARTIST_NAME + "}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void deleteAlbum(@PathParam(ARTIST_NAME) final String artistName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
   
    @GET
    @Path("/" + ARTIST + "/{" + ARTIST_NAME + "}/" + TITLE)
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Title getArtistTitles(@PathParam(ARTIST_NAME) final String artistName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @GET
    @Path("/" + ARTIST + "/{" + ARTIST_NAME + "}/" + TITLE + "/{" + TITLE_NAME + "}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Title getArtistTitle(@PathParam(ARTIST_NAME) final String artistName,
            @PathParam(TITLE_NAME) final String titleName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @PUT
    @Path("/" + ARTIST + "/{" + ARTIST_NAME + "}/" + TITLE + "/{" + TITLE_NAME + "}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Title createArtistTitle(@PathParam(ARTIST_NAME) final String artistName,
            @PathParam(TITLE_NAME) final String titleName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @GET
    @Path("/" + TITLE)
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Title> getTitles() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    // FIXME: are shortcuts allowed? and is this operation reasonable?
    @GET
    @Path("/" + TITLE + "/{" + TITLE_NAME + "}")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Title getTitle(@PathParam(TITLE_NAME) final String titleName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

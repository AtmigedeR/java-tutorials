package com.volkan.avci.exercises.spotify.model.response;

import com.volkan.avci.exercises.spotify.model.artist.ArtistList;

import java.io.Serializable;

public class ArtistResponse implements Serializable {
    private ArtistList artists;

    public ArtistList getArtists() {
        return artists;
    }

    public void setArtists(ArtistList artists) {
        this.artists = artists;
    }
}

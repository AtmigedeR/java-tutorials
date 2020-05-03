package com.volkan.avci.exercises.spotify.api;

import com.volkan.avci.exercises.spotify.model.response.ArtistResponse;
import com.volkan.avci.exercises.spotify.model.request.Request;

public interface SpotifyApi {

    ArtistResponse queryArtists(Request request);
}

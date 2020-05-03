package com.volkan.avci.exercises.spotify.controller;

import com.volkan.avci.exercises.spotify.api.SpotifyApi;
import com.volkan.avci.exercises.spotify.model.request.Request;
import com.volkan.avci.exercises.spotify.model.response.ArtistResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Spotify Query Service")
@RestController
public class SpotifyQueryController {

    private SpotifyApi spotifyApi;

    public SpotifyQueryController(SpotifyApi spotifyApi) {
        this.spotifyApi = spotifyApi;
    }

    @ApiOperation(value = "Retrieve Main Path", notes = "Service Main Path")
    @GetMapping("/")
    public String index()
    {
        return "Spotify api query App";
    }

    @ApiOperation(value = "List Spotify Artists by Parameters")
    @GetMapping("/artists")
    public ArtistResponse getArtists(@RequestParam(name="query") String query, @RequestParam("type") String type,
                                     @RequestParam(name="offset") int offset, @RequestParam("limit") int limit)
    {
        Request request = new Request();
        request.setQuery(query);
        request.setType(type);
        request.setLimit(limit);
        request.setOffset(offset);
        return spotifyApi.queryArtists(request);
    }
}

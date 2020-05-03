package com.volkan.avci.exercises;

import com.fasterxml.jackson.databind.JsonNode;
import com.volkan.avci.exercises.spotify.api.SpotifyApi;
import com.volkan.avci.exercises.spotify.api.SpotifyApiImpl;
import com.volkan.avci.exercises.spotify.model.request.Request;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootTest
public class SpotifySearchApiTest {

    RestTemplate restTemplate = new RestTemplate();
    SpotifyApi spotifyApi = new SpotifyApiImpl(restTemplate);

    @Ignore
    @Test
    public void testApi() {
        Request request = new Request();
        request.setLimit(2);
        request.setOffset(1);
        request.setType("artist");
        request.setQuery("queen");
        //ArtistList artistList = spotifyApi.queryArtists(request);
        //System.out.println(artistList);
    }

    @Ignore
    @Test
    public void querySimpleSpotifyService() {

        String url="https://api.spotify.com/v1/search?query=queen&type=artist&offset=1&limit=2";
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth("BQCbVsUTDl5hb_9RPjJI89QegK0vY_rV2v03Qm5E6cQu6IM7a5PYqc0lCFp91axyrsFOM6yjhL2_PmNh9Vm2Cdw9wRiyKKCrdByzvsip2pdr_h5T2zEH5lMmFvRNJmvQhbLODPCz7h5fy2DJ4s0otNZE");
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>("body", headers);
        ResponseEntity<JsonNode> result = restTemplate.exchange(url, HttpMethod.GET, entity, JsonNode.class);
        System.out.println(result);
    }
}

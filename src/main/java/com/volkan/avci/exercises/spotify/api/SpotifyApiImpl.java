package com.volkan.avci.exercises.spotify.api;

import com.volkan.avci.exercises.spotify.model.common.ApiHeader;
import com.volkan.avci.exercises.spotify.model.request.Request;
import com.volkan.avci.exercises.spotify.model.response.ArtistResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class SpotifyApiImpl implements SpotifyApi {

    @Value("${spotify.api.base.url}")
    private String api_url;

    @Value("${spotify.api.auth.token}")
    private String authToken;

    private RestTemplate restTemplate;

    @Autowired
    public SpotifyApiImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    @Cacheable(value = "spotifyApiQueries", key = "#request")
    public ArtistResponse queryArtists(Request request) {

        HttpEntity<String> entity = new HttpEntity<>("body", new ApiHeader(authToken).getHeaders());
        ResponseEntity<ArtistResponse> result = restTemplate
                .exchange(buildQuery(request), HttpMethod.GET, entity, ArtistResponse.class);
        return result.getBody();
    }

    private String buildQuery(Request request) {
        return  UriComponentsBuilder
                .fromUriString(api_url)
                .queryParam("query", request.getQuery())
                .queryParam("type", request.getType())
                .queryParam("offset", request.getOffset())
                .queryParam("limit", request.getLimit())
                .toUriString();
    }
}

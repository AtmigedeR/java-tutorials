package com.volkan.avci.exercises.spotify.model.common;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.Arrays;

public class ApiHeader {

    private HttpHeaders headers;
    private String token;

    public ApiHeader(String token)
    {
        this.token = token;
    }

    public HttpHeaders getHeaders()
    {
        headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(token);
        return headers;
    }
}

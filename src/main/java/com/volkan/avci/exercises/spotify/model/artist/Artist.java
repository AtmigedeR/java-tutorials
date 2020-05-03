package com.volkan.avci.exercises.spotify.model.artist;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.volkan.avci.exercises.spotify.model.common.Followers;
import com.volkan.avci.exercises.spotify.model.common.Image;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Artist implements Serializable {

    private Map<String, String> external_urls;
    private Followers followers;
    private List<String> genres;
    private String href;
    private String id;
    private List<Image> images;
    private String name;
    private int popularity;
    private String type;
    private String uri;


    @JsonAnySetter
    public void add(String key, String value) {
        external_urls.put(key, value);
    }

    public Map<String, String> getExternal_urls() {
        return external_urls;
    }

    public Followers getFollowers() {
        return followers;
    }

    public void setFollowers(Followers followers) {
        this.followers = followers;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}

package com.volkan.avci.exercises.spotify.model.common;

import java.io.Serializable;

public class Image implements Serializable {
    private Integer height;
    private String url;
    private Integer weight;

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}

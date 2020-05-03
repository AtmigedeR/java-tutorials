package com.volkan.avci.exercises.spotify.model.common;

import java.io.Serializable;

public class Followers implements Serializable {
    private String href;
    private Integer total;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}

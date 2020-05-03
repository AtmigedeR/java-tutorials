package com.volkan.avci.exercises.spotify.model.request;

import java.util.Objects;

public class Request {
    private String query;
    private String type;
    private Integer offset;
    private Integer limit;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        return getQuery().equals(request.getQuery()) &&
                getType().equals(request.getType()) &&
                getOffset().equals(request.getOffset()) &&
                getLimit().equals(request.getLimit());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuery(), getType(), getOffset(), getLimit());
    }

    @Override
    public String toString() {
        return "Request{" +
                "query='" + query + '\'' +
                ", type='" + type + '\'' +
                ", offset=" + offset +
                ", limit=" + limit +
                '}';
    }
}

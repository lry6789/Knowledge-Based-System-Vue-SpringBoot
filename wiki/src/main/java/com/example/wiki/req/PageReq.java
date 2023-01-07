package com.example.wiki.req;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

public class PageReq {


    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "PageReq{" +
                "page=" + page +
                ", size=" + size +
                '}';
    }
    @NotNull(message = "Page number cannot be null")
    private int page;

    @NotNull(message = "Size cannot be null")
    @Max(value = 1000, message = "Size cannot be larger than 1000")
    private int size;


}
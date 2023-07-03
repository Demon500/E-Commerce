package com.example.e_commerce.model;

public class Category {

    int cat_id;
    String cat_title;

    public Category(int cat_id, String cat_title) {
        this.cat_id = cat_id;
        this.cat_title = cat_title;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public String getCat_title() {
        return cat_title;
    }

    public void setCat_title(String cat_title) {
        this.cat_title = cat_title;
    }

}

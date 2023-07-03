package com.example.e_commerce.model;

public class Course {
    int course_id;
    String course_title, course_image,course_date,course_level, course_bg_color,course_desc;

    public Course(int course_id, String course_title, String course_image, String course_date, String course_level, String course_bg_color, String course_desc) {
        this.course_id = course_id;
        this.course_title = course_title;
        this.course_image = course_image;
        this.course_date = course_date;
        this.course_level = course_level;
        this.course_bg_color = course_bg_color;
        this.course_desc = course_desc;
    }

    public String getCourse_desc() {
        return course_desc;
    }

    public void setCourse_desc(String course_desc) {
        this.course_desc = course_desc;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_title() {
        return course_title;
    }

    public void setCourse_title(String course_title) {
        this.course_title = course_title;
    }

    public String getCourse_image() {
        return course_image;
    }

    public void setCourse_image(String course_image) {
        this.course_image = course_image;
    }

    public String getCourse_date() {
        return course_date;
    }

    public void setCourse_date(String course_date) {
        this.course_date = course_date;
    }

    public String getCourse_level() {
        return course_level;
    }

    public void setCourse_level(String course_level) {
        this.course_level = course_level;
    }

    public String getCourse_bg_color() {
        return course_bg_color;
    }

    public void setCourse_bg_color(String course_bg_color) {
        this.course_bg_color = course_bg_color;
    }
}

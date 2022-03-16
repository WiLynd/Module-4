package com.codegym.blog.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String writer;

    @ManyToOne(targetEntity = Category.class)
    @JsonBackReference
    @JoinColumn(name = "category_id",referencedColumnName = "id")
    private Category category;

    private String Content;
    private String postingDay;

    public Blog() {
    }

    public Blog(Integer id, String title, String writer, Category category, String content, String postingDay) {
        this.id = id;
        this.title = title;
        this.writer = writer;
        this.category = category;
        Content = content;
        this.postingDay = postingDay;
    }

    public Blog(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getPostingDay() {
        return postingDay;
    }

    public void setPostingDay(String postingDay) {
        this.postingDay = postingDay;
    }
}


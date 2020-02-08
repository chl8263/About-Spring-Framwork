package com.example.demo.databinding;

public class BindData {

    private Integer id;

    private String title;

    public BindData(){}

    public BindData(Integer id){
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

    @Override
    public String toString() {
        return "BindData{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}

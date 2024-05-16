package com.example.restfulapipractice.model;

public class User {
    private String name;
    private Long studentId;

    public void setName(String name){
        this.name=name;
    }

    public void setStudentId(Long studentId){
        this.studentId = studentId;
    }

    public String getName(){
        return name;
    }
    public Long getStudentId(){
        return studentId;
    }
}

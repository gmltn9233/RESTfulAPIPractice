package com.example.restfulapipractice.model;

import com.example.restfulapipractice.constant.StatusEnum;
import lombok.Getter;
import lombok.Setter;


public class Message {


    private StatusEnum status;
    private String message;
    private Object data;

    public Message() {
        this.status = StatusEnum.BAD_REQUEST;
        this.data = null;
        this.message = null;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public String getMessage(){
        return message;
    }

    public Object getData(){
        return data;
    }


    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
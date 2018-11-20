package com.luv2code.springdemo.rest;

public class CustomerErrorResponse {

    private int status;
    private String message;
    private long timeStam;

    public CustomerErrorResponse() {

    }

    public CustomerErrorResponse(int status, String message, long timeStam) {
        this.status = status;
        this.message = message;
        this.timeStam = timeStam;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimeStam() {
        return timeStam;
    }

    public void setTimeStam(long timeStam) {
        this.timeStam = timeStam;
    }
}
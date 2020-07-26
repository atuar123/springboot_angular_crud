package com.ctechbd.springboot_angular_crud.exception;

import lombok.Data;

import java.util.Date;

@Data
public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String details;

    public ErrorDetails(Date date, String message, String description) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }


}

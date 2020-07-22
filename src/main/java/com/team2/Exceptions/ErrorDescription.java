package com.team2.Exceptions;

/**
 * ErrorDescription
 *
 * @author Fırat ÜLGAY
 * @since 5.230.0
 */
public class ErrorDescription {

    private String message;
    private int code;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

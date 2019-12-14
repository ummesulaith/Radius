package com.example.radiusassessment.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Userdata {

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("success")
    @Expose
    private String success;

    @SerializedName("data")
    @Expose
    private Data data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Userdata{" +
                "message='" + message + '\'' +
                ", success='" + success + '\'' +
                ", data=" + data +
                '}';
    }

    public Userdata(String message, String success, Data data) {
        this.message = message;
        this.success = success;
        this.data = data;
    }
}

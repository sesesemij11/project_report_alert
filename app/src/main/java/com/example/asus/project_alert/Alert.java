package com.example.asus.project_alert;

import android.support.v7.app.AppCompatActivity;

public class Alert extends AppCompatActivity {
    public String detail, location, sent_type, topic, type_of_alert;

    public String getDetail() {
        return detail;
    }

    public String getLocation() {
        return location;
    }

    public String getSent_type() {
        return sent_type;
    }

    public String getTopic() {
        return topic;
    }

    public String getType_of_alert() {
        return type_of_alert;
    }

    public Alert(String detail, String location, String sent_type, String topic, String type_of_alert) {
        this.detail = detail;
        this.location = location;
        this.sent_type = sent_type;
        this.topic = topic;

        this.type_of_alert = type_of_alert;
    }

    public Alert () {

    }

}
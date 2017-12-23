package com.patterns.behavier.Observer.listeners;

import java.io.File;

public class EmailNotificationListener implements  EventListener {
    private String email;

    public EmailNotificationListener(String email){
        this.email = email;
    }

    @Override
    public void update(String evenType, File file) {
        System.out.println("email to" + email + ": Someone has performed " + evenType + " operation with the following file: " + file.getName());
    }
}

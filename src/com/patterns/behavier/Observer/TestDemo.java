package com.patterns.behavier.Observer;

import com.patterns.behavier.Observer.editor.Editor;
import com.patterns.behavier.Observer.listeners.EmailNotificationListener;
import com.patterns.behavier.Observer.listeners.LogOpenListener;

public class TestDemo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open",new LogOpenListener("file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("test@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

package com.vladproduction.sample2_fireProperty.settings_example;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ListenerB implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("ListenerB:");

        String propertyName = evt.getPropertyName();
        if (propertyName.equals("language")) {
            System.out.println("Language changed to: " + evt.getNewValue());
        } else if (propertyName.equals("themeColor")) {
            System.out.println("Theme color changed to: "  + evt.getNewValue());
        } else if (propertyName.equals("notificationEnabled")) {
            System.out.println("Notifications are now: " + (boolean) evt.getNewValue());
        }

    }
}

package com.vladproduction.sample2_fireProperty.boundary;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class MyCar {
    private String name;
    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        support.firePropertyChange("name", this.name, name);
        this.name = name;
    }

    //method for connect our MyCar and Listener
    public void addListener(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }
}

package com.vladproduction.sample1_mbeans.example_music.commonMBean;

public interface MusicMBean {


    StileType getStileType();
    void setStileType(StileType stileType);
    String getBand();
    void setBand(String band);
    int getFoundationYear();
    void setFoundationYear(int foundationYear);

    void printInfo();
}

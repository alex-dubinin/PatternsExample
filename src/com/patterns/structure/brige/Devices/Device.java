package com.patterns.structure.Brige.Devices;

public interface Device {
    public boolean isEnabled();

    public void enable();
    public void disenable();
    public int getVolume();
    public void setVolume(int percent);
    public int getChannel();
    public void setChannel(int channel);
    public void printStatus();
}

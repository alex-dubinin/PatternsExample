package com.patterns.structure.brige;

import com.patterns.structure.brige.Devices.Device;
import com.patterns.structure.brige.Devices.Radio;
import com.patterns.structure.brige.Devices.Tv;
import com.patterns.structure.brige.Remotes.AdvancedRemote;
import com.patterns.structure.brige.Remotes.BasicRemote;

public class TestDemo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device){
        System.out.println("Tests with basic remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }

}

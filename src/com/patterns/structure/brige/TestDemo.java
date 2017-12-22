package com.patterns.structure.Brige;

import com.patterns.structure.Brige.Devices.Device;
import com.patterns.structure.Brige.Devices.Radio;
import com.patterns.structure.Brige.Devices.Tv;
import com.patterns.structure.Brige.Remotes.AdvancedRemote;
import com.patterns.structure.Brige.Remotes.BasicRemote;

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

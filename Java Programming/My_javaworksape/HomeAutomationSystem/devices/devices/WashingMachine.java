package model.devices;

import model.interfaces.WashRoomAppliance;
import model.interfaces.ModeChangeable;

public class WashingMachine extends Device implements ModeChangeable, WashRoomAppliance {

    private String mode = "Normal";

    public WashingMachine(String deviceName) {
        super(deviceName);
    }

    @Override
    public void changeMode(String mode) {
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }

    @Override
    public String getDeviceType() {
        return "Washing Machine";
    }
}

package model.devices;

import model.interfaces.WashRoomAppliance;

public class WashingMachine extends Device implements WashRoomAppliance {

    public WashingMachine(int deviceId) {
        super("WashingMachine", deviceId);
    }

    @Override
    public String getDeviceType() {
        return "WashingMachine";
    }
}

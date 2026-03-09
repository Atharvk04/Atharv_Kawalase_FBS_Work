package model.devices;

import model.interfaces.WashRoomAppliance
;


public class Geyser extends Device implements WashRoomAppliance {

    public Geyser(int deviceId) {
        super("Geyser", deviceId);
    }

    @Override
    public String getDeviceType() {
        return "Geyser";
    }
}

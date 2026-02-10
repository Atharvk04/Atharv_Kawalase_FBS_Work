package model.devices;

import model.interfaces.KitchenAppliance;

public class MicroWave extends Device implements KitchenAppliance {

    public MicroWave(int deviceId) {
        super("MicroWave", deviceId);
    }

    @Override
    public String getDeviceType() {
        return "MicroWave";
    }
}

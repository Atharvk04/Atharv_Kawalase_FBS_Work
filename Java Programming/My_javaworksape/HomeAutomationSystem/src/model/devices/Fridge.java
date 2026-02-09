package model.devices;

import model.interfaces.KitchenAppliance;

public class Fridge extends Device implements KitchenAppliance {

    public Fridge(int deviceId) {
        super("Fridge", deviceId);
    }

    @Override
    public String getDeviceType() {
        return "Fridge";
    }
}

package model.devices;

import model.interfaces.BedRoomAppliance;
import model.interfaces.KitchenAppliance;
import model.interfaces.LivingRoomAppliance;
import model.interfaces.SpeedControllable;

public class Fan extends Device implements BedRoomAppliance, KitchenAppliance, LivingRoomAppliance,
SpeedControllable{

    public Fan(int deviceId) {
        super("Fan", deviceId);
    }

    @Override
    public String getDeviceType() {
        return "Fan";
    }
}

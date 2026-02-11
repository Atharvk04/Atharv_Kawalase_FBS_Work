package model.devices;

import model.interfaces.BedRoomAppliance;
import model.interfaces.ColorChangeable;
import model.interfaces.KitchenAppliance;
import model.interfaces.LivingRoomAppliance;

public class Light extends Device implements LivingRoomAppliance, BedRoomAppliance, KitchenAppliance,
ColorChangeable{

    public Light(int deviceId) {
        super("Light", deviceId);
    }

    @Override
    public String getDeviceType() {
        return "Light";
    }

	@Override
	public void changeColor(String color) {
		// TODO Auto-generated method stub
		
	}
}

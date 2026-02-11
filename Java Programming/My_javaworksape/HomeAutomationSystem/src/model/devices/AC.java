package model.devices;

import model.interfaces.BedRoomAppliance;
import model.interfaces.KitchenAppliance;
import model.interfaces.LivingRoomAppliance;
import model.interfaces.ModeChangeable;
import model.interfaces.TemperatureControlDevice;

public  class AC extends Device implements BedRoomAppliance, KitchenAppliance, LivingRoomAppliance, 
ModeChangeable, TemperatureControlDevice{

    public AC(int deviceId) {
        super("AC", deviceId);
    }

    @Override
    public String getDeviceType() {
        return "AC";
    }

	@Override
	public void decreaseTemperature() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeMode(String mode) {
		// TODO Auto-generated method stub
		
	}
}

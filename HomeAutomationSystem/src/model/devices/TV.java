package model.devices;

import model.interfaces.BedRoomAppliance;
import model.interfaces.ChannelChangeable;
import model.interfaces.EntertainmentDevice;
import model.interfaces.KitchenAppliance;
import model.interfaces.LivingRoomAppliance;

public class TV extends Device implements LivingRoomAppliance, BedRoomAppliance, KitchenAppliance, 
ChannelChangeable, EntertainmentDevice{

    public TV(int deviceId) {
        super("TV", deviceId);
    }

    @Override
    public String getDeviceType() {
        return "TV";
    }

	@Override
	public void nextChannel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void previousChannel() {
		// TODO Auto-generated method stub
		
	}
}

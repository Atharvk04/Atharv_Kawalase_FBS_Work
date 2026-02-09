package model.devices;

import model.interfaces.AdjustableVolume;
import model.interfaces.BedRoomAppliance;
import model.interfaces.KitchenAppliance;
import model.interfaces.LivingRoomAppliance;

public class MusicPlayer extends Device implements LivingRoomAppliance,BedRoomAppliance,
KitchenAppliance,AdjustableVolume {

    public MusicPlayer(int deviceId) {
        super("MusicPlayer", deviceId);
    }

    @Override
    public String getDeviceType() {
        return "MusicPlayer";
    }

	@Override
	public void increaseVolume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void decreaseVolume() {
		// TODO Auto-generated method stub
		
	}
}

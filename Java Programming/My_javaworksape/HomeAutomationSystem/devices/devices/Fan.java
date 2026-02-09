package model.devices;

import model.interfaces.BedRoomAppliance;
import model.interfaces.SpeedControllable;
import model.interfaces.KitchenAppliance;
import model.interfaces.LivingRoomAppliance;


public class Fan extends Device implements SpeedControllable, KitchenAppliance, BedRoomAppliance, LivingRoomAppliance 
		{
	private int speed = 10;

	public Fan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fan(String deviceName) {
		super(deviceName);
		// TODO Auto-generated constructor stub
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void increaseSpeed() {
		speed++;
	}

	@Override
	public void decreaseSpeed() {
		speed--;
	}

	@Override
	public String getDeviceType() {
		// TODO Auto-generated method stub
		return "Fan";
	}

}
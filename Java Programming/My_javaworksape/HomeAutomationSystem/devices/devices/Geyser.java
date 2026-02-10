package model.devices;

import model.interfaces.TemperatureControlDevice;
import model.interfaces.WashRoomAppliance;

public class Geyser extends Device implements WashRoomAppliance,TemperatureControlDevice{
	private int temperature=40;

	public Geyser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Geyser(String deviceName) {
		super(deviceName);
		// TODO Auto-generated constructor stub
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public void increaseTemp() {
		temperature++;
	}
	@Override
	public void decreaseTemperature() {
		temperature--;
	}

	@Override
	public String getDeviceType() {
		// TODO Auto-generated method stub
		return "Geyser";
	}
	
	
	
}
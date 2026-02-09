package model.devices;

import model.interfaces.KitchenAppliance;
import model.interfaces.TemperatureControlDevice;

public class Fridge extends Device implements TemperatureControlDevice, KitchenAppliance {

	private int temperature=5;

	public Fridge(String deviceName) {
		super(deviceName);
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public void increaseTemperature() {
		// TODO Auto-generated method stub
		temperature++;
		
	}

	@Override
	public void decreaseTemperature() {
		// TODO Auto-generated method stub
		temperature--;
		
	}

	@Override
	public String getDeviceType() {
		// TODO Auto-generated method stub
		return "Fridge";
	}
	
	
	
	
}
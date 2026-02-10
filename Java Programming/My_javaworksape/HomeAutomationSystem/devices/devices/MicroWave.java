package model.devices;

import model.interfaces.KitchenAppliance;
import model.interfaces.ModeChangeable;
import model.interfaces.TemperatureControlDevice;

public class MicroWave extends Device implements ModeChangeable,KitchenAppliance, TemperatureControlDevice 
{

    private int temperature = 180;

    public MicroWave(String deviceName) {
        super(deviceName);
    }

    @Override
    public void increaseTemperature() {
        temperature += 10;
    }

    @Override
    public void decreaseTemperature() {
        temperature -= 10;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String getDeviceType() {
        return "Microwave";
    }

	@Override
	public void changeMode(String mode) {
		// TODO Auto-generated method stub
		
	}
}

package model.devices;

import model.interfaces.BedRoomAppliance;
import model.interfaces.KitchenAppliance;
import model.interfaces.LivingRoomAppliance;
import model.interfaces.ModeChangeable;
import model.interfaces.TemperatureControlDevice;
public class AC extends Device implements ModeChangeable,TemperatureControlDevice,KitchenAppliance,BedRoomAppliance,LivingRoomAppliance
{
	private int temperature=24;
	private String mode="Cool";
	public AC() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AC(String deviceName) 
	{
		super(deviceName);
		
	}
	
	public int getTemperature() 
	{
		return temperature;
	}
	
	public void setTemperature(int temperature) 
	{
		this.temperature = temperature;
	}
	
	public String getMode() 
	{
		return mode;
	}
	
	public void setMode(String mode) 
	{
		this.mode = mode;
	}
	
	public void increaseTemperature() 
	{
		temperature++;
	}
	
	public void decreaseTemperature() 
	{
		temperature--;
	}
	
	public void changeMode(String mode) 
	{
		this.mode=mode;
	}
	@Override
	public String getDeviceType() {
		// TODO Auto-generated method stub
		return "AC";
	}
	
	
	
	
	
	
}
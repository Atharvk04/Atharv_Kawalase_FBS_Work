package model.devices;
import model.interfaces.BedRoomAppliance;
import model.interfaces.ColorChangeable;
import model.interfaces.KitchenAppliance;
import model.interfaces.LivingRoomAppliance;
import model.interfaces.WashRoomAppliance;

public class Light extends Device implements ColorChangeable, BedRoomAppliance, KitchenAppliance ,LivingRoomAppliance,
WashRoomAppliance{
	private String color="White";

	public Light() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Light(String deviceName) {
		super(deviceName);
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void changeColor(String color) {
		setColor(color);
	}

	@Override
	public String getDeviceType() {
		return "Light";
	}
	
	
	
}
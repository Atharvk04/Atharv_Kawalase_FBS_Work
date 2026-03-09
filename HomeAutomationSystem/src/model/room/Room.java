package model.room;

import java.util.ArrayList;
import java.util.List;

import model.devices.Device;
import model.interfaces.BedRoomAppliance;
import model.interfaces.KitchenAppliance;
import model.interfaces.LivingRoomAppliance;
import model.interfaces.WashRoomAppliance;

public class Room {
	private int roomId;
	private String roomName;
	private List<Device>devices;
	
	// Constructors
	public Room(int RoomId,String name){
		this.roomId = RoomId;
		this.roomName = name;
		this.devices = new ArrayList<>();
		
	}
	
	public Room() {
		this.devices = new ArrayList<>();
	}
	
	// getter and setters
	public int getRoomId() {
		return roomId;
	}

	void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	
	public String getRoomName() {
		return roomName;
	}

	void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		if(devices != null) {
		this.devices = devices;
	  }
	}
	
	// Devices restriction logic
	public boolean canDeviceBeAdded(Device device) {
		if(devices == null || roomName == null) {
			return false;
		}
		
		switch(roomName.toLowerCase().replace(" ","").trim()) {
		
		case "livingroom":
		    return device instanceof LivingRoomAppliance;
		
		case "kitchen":
			return device instanceof KitchenAppliance;
			
		case "washroom":
			return device instanceof WashRoomAppliance;
			
		case "bedroom":
			return device instanceof BedRoomAppliance;
		

			
		default:
			return true; // corridor,dining,etc.
				
		}
	}
	
	// add device
	public boolean addDevice(Device device) {
		if(device == null) {
			return false; 
		}
		if(canDeviceBeAdded(device)) {
			devices.add(device);
			return true;	
		}
		return false;
	}
	
	//get device by name
	public Device getDevice(String deviceName) {
		for(Device d : devices) {
			if(d.getDeviceName().equalsIgnoreCase(deviceName)) {
				return d;
			}
		}
		return null;
	}
	
	// Remove device
	public boolean removeDevice(String deviceName) {
		Device d = getDevice(deviceName);
		if(d != null) {
			devices.remove(d);
			return true;
		}
		return false;
	}
	
	// turn ON device
	public boolean turnOnDevice(String deviceName) {
		for(Device d : devices) {
			if(d.getDeviceName().equalsIgnoreCase(deviceName)) {
				d.turnOn();
				return true;
			}
		}
		return false;
	}
	
	// turn OFF device
	public boolean turnOffDevice(String deviceName) {
		for(Device d:devices) {
			if(d.getDeviceName().equalsIgnoreCase(deviceName)) {
				d.turnOff();
				return true;
			}
		}
		return false;
	}

	public void showStatus() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
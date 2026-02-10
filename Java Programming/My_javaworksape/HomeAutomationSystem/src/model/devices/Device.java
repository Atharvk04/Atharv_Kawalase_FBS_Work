package model.devices;

import java.time.LocalDateTime;



public abstract class Device {
	String deviceName;
	int deviceId;
	boolean isOn;
	LocalDateTime stateChangedTime;
	
	
	public Device() {
		
	}

	public Device(String deviceName, int deviceId) {
		super();
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.isOn = false;
		this.stateChangedTime = LocalDateTime.now();
	}

	public int getDeviceId() {
		return deviceId;
	}	

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public boolean getIsOn() {
		return isOn;
	}
	public void setIsOn(boolean isOn) {
		this.isOn = isOn;
	}
	public LocalDateTime getStateChangedTime() {
		return stateChangedTime;
	}
	public void setStateChangedTime(LocalDateTime stateChangedTime) {
		this.stateChangedTime = stateChangedTime;
	}
	
	public void turnOn() {
		if(!isOn) {
			setIsOn(true);
			stateChangedTime=LocalDateTime.now();
		}
	}
	public void turnOff() {
		if(isOn) {
			setIsOn(false);
			stateChangedTime=LocalDateTime.now();
		}
		
		
	}
	
	
	public long getTimeInCurrentState() {
		
		  return java.time.Duration.between(stateChangedTime, LocalDateTime.now()).toMinutes();

	}
	 public abstract String getDeviceType();
	 
	 public String showStatus() {
		    return deviceName + " → " +
		           (isOn ? "ON" : "OFF") +
		           " | Time in state: " +
		           getTimeInCurrentState() + " minutes";
		}


	public void increaseTemperature() {
		// TODO Auto-generated method stub
		
	}

	public void increaseSpeed() {
		// TODO Auto-generated method stub
		
	}

	public void decreaseSpeed() {
		// TODO Auto-generated method stub
		
	}
	 	
}
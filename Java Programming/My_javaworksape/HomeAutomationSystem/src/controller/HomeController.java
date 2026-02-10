package controller;

import java.util.ArrayList;

import model.DAO.HomeDAO;
import model.devices.Device;
import model.room.Room;


public class HomeController 
{
	private HomeDAO dao = new HomeDAO();
	
	public boolean addRoom(int roomId,int roomType)
	{
		return dao.addRoom(roomId,roomType);
	}

	public boolean addDevice(int roomId, int deviceId, int deviceType) 
	{
		
		return dao.addDevice(roomId,deviceId,deviceType);
	}

	public boolean turnOnDevice(int roomId, int deviceId) 
	{
	    return dao.turnOnDevice(roomId, deviceId);
	}

	
	public boolean turnOffDevice(int roomId, int deviceId) 
	{
	    return dao.turnOffDevice(roomId, deviceId);
	}
	
	public ArrayList<Room> getAllRooms() {
	    return dao.getAllRooms();
	}

	
	public void showStatus() {
	    dao.showStatus();
	}


	public Device getDevice(int roomId, int deviceId) {
	    return dao.getDeviceByRoomAndId(roomId, deviceId);
	}

	
	public boolean removeDevice(int roomId, int deviceId) {
	    return dao.removeDevice(roomId, deviceId);
	}

}

package controller;

import model.DAO.HomeDAO;


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

	public boolean turnOnDevice(int roomType, int deviceType) 
	{
	
		return dao.turnOnDevice(roomType,deviceType);
	}
	
	public boolean turnOffDevice(int roomType, int deviceType) 
	{
	
		return dao.turnOffDevice(roomType,deviceType);
	}
	
	public void showStatus() {
	    dao.showStatus();
	}



	
	public boolean removeDevice(int roomId, int deviceId) {
	    return dao.removeDevice(roomId, deviceId);
	}

}

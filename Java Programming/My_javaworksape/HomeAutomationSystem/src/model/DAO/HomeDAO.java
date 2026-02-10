package model.DAO;

import java.util.ArrayList;

import model.devices.AC;
import model.devices.Device;
import model.devices.Fan;
import model.devices.Geyser;
import model.devices.Light;
import model.devices.MusicPlayer;
import model.devices.MicroWave;
import model.devices.Fridge;
import model.devices.TV;
import model.devices.WashingMachine;
import model.room.Bedroom;
import model.room.Corridor;
import model.room.DinningHall;
import model.room.Kitchen;
import model.room.Room;
import model.room.Washroom;
import model.room.livingroom;

public class HomeDAO 
{
	
	
	ArrayList<Room> rooms = new ArrayList<Room>();


	public boolean addRoom(int roomId, int roomName) {

	    for (Room r : rooms) {
	        if (r.getRoomId() == roomId)
	            return false;
	    }

	    Room room = null;

	    if (roomName == 1) room = new livingroom(roomId);
	    else if (roomName == 2) room = new Bedroom(roomId);
	    else if (roomName == 3) room = new Kitchen(roomId);
	    else if (roomName == 4) room = new DinningHall(roomId);
	    else if (roomName == 5) room = new Corridor(roomId);
	    else if (roomName == 6) room = new Washroom(roomId);
	    else return false;

	    rooms.add(room);
	    return true;
	}



	public boolean addDevice(int roomId, int deviceId, int deviceType) {

	    Room room = null;

	    for (Room r : rooms) {
	        if (r.getRoomId() == roomId) {
	            room = r;
	            break;
	        }
	    }

	    if (room == null) {
	        return false; // room not found
	    }

	    Device device = null;

	    if (deviceType == 1) device = new Light(deviceId);
	    else if (deviceType == 2) device = new Fan(deviceId);
	    else if (deviceType == 3) device = new AC(deviceId);
	    else if (deviceType == 4) device = new TV(deviceId);
	    else if (deviceType == 5) device = new Fridge(deviceId);
	    else if (deviceType == 6) device = new WashingMachine(deviceId);
	    else if (deviceType == 7) device = new Geyser(deviceId);
	    else if (deviceType == 8) device = new MicroWave(deviceId);
	    else if (deviceType == 9) device = new MusicPlayer(deviceId);
	    

	    if (device == null) {
	        return false;
	    }
	    
	    if (!room.canDeviceBeAdded(device)) {
	        return false;
	    }

	    // duplicate device ID check
	    for (Device d : room.getDevices()) {
	        if (d.getDeviceId() == deviceId) {
	            return false;
	        }
	    }

	    
	   room.addDevice(device); 
	   return true;
	}


	public boolean removeDevice(int roomId, String deviceName) {

	    for (Room room : rooms) {

	        if (room.getRoomId() == roomId) {

	            return room.removeDevice(deviceName); 
	        }
	    }
	    return false;
	}


	public boolean turnOnDevice(int roomId, int deviceId) 
	{

	    for (Room room : rooms) 
	    {

	        if (room.getRoomId() == roomId) {

	            for (Device d : room.getDevices()) 
	            {

	                if (d.getDeviceId() == deviceId) 
	                {
	                    d.turnOn();
	                    return true;
	                }
	            }
	            return false;
	        }
	    }
	    return false;
	}


	
	public boolean turnOffDevice(int roomId, int deviceId) 
	{

	    for (Room room : rooms) 
	    {

	        if (room.getRoomId() == roomId) 
	        {

	            for (Device d : room.getDevices()) 
	            {

	                if (d.getDeviceId() == deviceId) 
	                {
	                    d.turnOff();
	                    return true;
	                }
	            }
	            return false; 
	        }
	    }
	    return false; 
	}



	
	public void showStatus() {

	    if (rooms.isEmpty()) {
	        System.out.println("No rooms or devices found");
	        return;
	    }

	    System.out.println("\n================ HOME STATUS ================");

	    for (Room room : rooms) {

	        // Room header (single line)
	        System.out.println("\nRoom ID   : " + room.getRoomId());
	        System.out.println("Room Name : " + room.getRoomName());
	        System.out.println("--------------------------------------------");

	        if (room.getDevices().isEmpty()) {
	            System.out.println("No devices in this room");
	        } else {

	            // Devices printed vertically
	            int count = 1;
	            for (Device d : room.getDevices()) {
	                System.out.println(count + ". " + d.showStatus());
	                count++;
	            }
	        }
	    }

	    System.out.println("\n============================================");
	}





	public boolean removeDevice(int roomId, int deviceId) {

	    for (Room room : rooms) {
	        if (room.getRoomId() == roomId) {

	            for (Device d : room.getDevices()) {
	                if (d.getDeviceId() == deviceId) {
	                    room.getDevices().remove(d);
	                    return true;
	                }
	            }
	        }
	    }
	    return false;
	}

	
	public Device getDeviceByRoomAndId(int roomId, int deviceId) {

	    for (Room room : rooms) {
	        if (room.getRoomId() == roomId) {
	            for (Device d : room.getDevices()) {
	                if (d.getDeviceId() == deviceId) {
	                    return d;
	                }
	            }
	        }
	    }
	    return null;
	}




	@SuppressWarnings("unused")
	private boolean roomMatchesType(Room room, int roomId) 
	{

	    if(roomId == 1 && room instanceof livingroom) return true;
	    if(roomId == 2 && room instanceof Bedroom) return true;
	    if(roomId == 3 && room instanceof Kitchen) return true;
	    if(roomId == 4 && room instanceof DinningHall) return true;
	    if(roomId == 5 && room instanceof Corridor) return true;
	    if(roomId == 6 && room instanceof Washroom) return true;

	    return false;
	}

	
	@SuppressWarnings("unused")
	private boolean deviceMatchesType(Device device, int deviceId) {

	    if(deviceId == 1 && device instanceof Light) return true;
	    if(deviceId == 2 && device instanceof Fan) return true;
	    if(deviceId == 3 && device instanceof AC) return true;
	    if(deviceId == 4 && device instanceof TV) return true;
	    if(deviceId == 5 && device instanceof Fridge) return true;
	    if(deviceId == 6 && device instanceof WashingMachine) return true;
	    if(deviceId == 7 && device instanceof Geyser) return true;        
	    if(deviceId == 8 && device instanceof MicroWave) return true;     
	    if(deviceId == 9 && device instanceof MusicPlayer) return true;   

	    return false;
	}

	
	


}

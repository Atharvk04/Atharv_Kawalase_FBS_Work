package model.house;

import java.util.ArrayList;
import java.util.List;

import model.room.Room;

public class House {
	
	//List of rooms
	private List<Room>rooms = new ArrayList<>();
	
	// add a room to the house
	public void addRoom(Room room) {
		if(room!= null) {
			rooms.add(room);
		}
		
	}
	
	//get all rooms
	public List<Room>getRooms(){
		return rooms;
	}
	
	// get room by name
	public Room getRoom(String roomName) {
		for(Room room : rooms) {
			if(room != null && room.getRoomName().equalsIgnoreCase(roomName)) {
				return room;  // room found
			}
			
		}
		return null;   // room not found
	}
	
	// turn ON a device in a room
	public void turnOn(String roomName, String deviceName) {
		Room room = getRoom(roomName);
		if(room != null) {
			room.turnOnDevice(deviceName);
		}else {
			System.out.println("Room "+roomName + "not found");
		}
	}
	
	// turnOff a device in a room
	public void turnOff(String roomName,String deviceName) {
		Room room = getRoom(roomName);
		if(room != null) {
			room.turnOffDevice(deviceName);
		}else {
			System.out.println("Room "+ roomName + "not found");
		}
	}
	
	// show status of all rooms
	public void showAllStatus() {
		for(Room room : rooms) {
			room.showStatus();
		}
	}
	
	
	

}
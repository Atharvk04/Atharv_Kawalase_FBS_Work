package view;

import controller.HomeController;
import model.devices.Device;

import java.util.Scanner;

public class HomeView {

    private Scanner sc = new Scanner(System.in);
    private HomeController controller = new HomeController();

    public void start() {

        int choice;
        do {

            // ===== Menu Header =====
            System.out.println("\n============================================================");
            System.out.println("                 SMART HOME AUTOMATION SYSTEM               ");
            System.out.println("============================================================");

            // ===== Menu Options =====
            System.out.println("1. Add Room");
            System.out.println("2. Add Device");
            System.out.println("3. Manage Device (ON / OFF)");
            System.out.println("4. Show Status");
            System.out.println("5. Remove Device");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            // ===== Menu Routing =====
            switch (choice) {

                case 1:
                    addRoomView();
                    break;

                case 2:
                    addDeviceView();
                    break;

                case 3:
                    toggleDeviceView();
                    break;

                case 4:
                    showStatusView();
                    break;

                case 5:
                    removeDeviceView();
                    break;

                case 6:
                    System.out.println("\nThank you for using Smart Home System!");
                    break;

                default:
                    System.out.println("\nInvalid choice! Please try again.");
            }

        } while (choice != 6); // loop continues until Exit
    }

    // ================= ROOM =================

    private void addRoomView() {

        System.out.println("\n---------------- ADD ROOM ----------------");
        System.out.print("Enter Room ID: ");
        int roomId = sc.nextInt();

        System.out.println("Select Room Type:");
        System.out.println("1. Living Room");
        System.out.println("2. Bedroom");
        System.out.println("3. Kitchen");
        System.out.println("4. Dining Hall");
        System.out.println("5. Corridor");
        System.out.println("6. Washroom");
        System.out.print("Choice: ");

        int roomType = sc.nextInt();

        boolean added = controller.addRoom(roomId, roomType);

        System.out.println(added ? 
            "✔ Room added successfully" : 
            "✖ Room already exists");
    }

    // ================= DEVICE =================

    private void addDeviceView() {

        System.out.println("\n---------------- ADD DEVICE ----------------");
        System.out.print("Enter Room ID: ");
        int roomId = sc.nextInt();

        System.out.print("Enter Device ID: ");
        int deviceId = sc.nextInt();

        System.out.println("Select Device Type:");
        System.out.println("1. Light");
        System.out.println("2. Fan");
        System.out.println("3. AC");
        System.out.println("4. TV");
        System.out.println("5. Fridge");
        System.out.println("6. Washing Machine");
        System.out.println("7. Geyser");
        System.out.println("8. MicroWave");
        System.out.println("9. Music Player");
        System.out.print("Choice: ");

        int deviceType = sc.nextInt();

        boolean added = controller.addDevice(roomId, deviceId, deviceType);

        System.out.println(added ? 
            "✔ Device added successfully" : 
            "✖ Device not allowed or already exists");
    }

    // ================= STATUS =================

    private void showStatusView() {
        System.out.println("\n");
        controller.showStatus();   // only prints status
    }

    // ================= REMOVE =================

    private void removeDeviceView() {

        System.out.println("\n------------- REMOVE DEVICE ----------------");
        System.out.print("Enter Room ID: ");
        int roomId = sc.nextInt();

        System.out.print("Enter Device ID: ");
        int deviceId = sc.nextInt();

        boolean removed = controller.removeDevice(roomId, deviceId);

        System.out.println(removed ? 
            "✔ Device removed successfully" : 
            "✖ Device not found");
    }
    
    private void toggleDeviceView() {

        var rooms = controller.getAllRooms();

        if (rooms.isEmpty()) {
            System.out.println("No rooms available");
            return;
        }

        // -------- Step 1: Select Room --------
        System.out.println("\nSelect Room:");
        for (int i = 0; i < rooms.size(); i++) {
            System.out.println((i + 1) + ". " + rooms.get(i).getRoomName());
        }
        
        System.out.println("Enter Your Choice: ");
        int roomChoice = sc.nextInt();

        
        if (roomChoice < 1 || roomChoice > rooms.size()) {
            System.out.println("Invalid room choice");
            return;
        }

        var selectedRoom = rooms.get(roomChoice - 1);

        if (selectedRoom.getDevices().isEmpty()) {
            System.out.println("No devices in this room");
            return;
        }

        // -------- Step 2: Select Device --------
        System.out.println("\nDevices in " + selectedRoom.getRoomName() + ":");
        for (int i = 0; i < selectedRoom.getDevices().size(); i++) {
            Device d = selectedRoom.getDevices().get(i);
            System.out.println((i + 1) + ". " + d.getDeviceName() +
                    " (" + (d.getIsOn() ? "ON" : "OFF") + ")");
        }
        
        System.out.println("Enter Your Choice: ");

        int deviceChoice = sc.nextInt();
        if (deviceChoice < 1 || deviceChoice > selectedRoom.getDevices().size()) {
            System.out.println("Invalid device choice");
            return;
        }

        Device device = selectedRoom.getDevices().get(deviceChoice - 1);

        // -------- Step 3: Toggle --------
        System.out.println("\n" + device.getDeviceName() +
                " is currently " + (device.getIsOn() ? "ON" : "OFF"));

        if (device.getIsOn()) {
            System.out.println("1. Turn OFF");
        } else {
            System.out.println("1. Turn ON");
        }
        System.out.println("2. Cancel");
        
        System.out.println("Enter Your Choice: ");

        int action = sc.nextInt();

        if (action == 1) {
            if (device.getIsOn()) {
                device.turnOff();
                System.out.println("Device turned OFF");
            } else {
                device.turnOn();
                System.out.println("Device turned ON");
            }
        } else {
            System.out.println("Operation cancelled");
        }
    }

}

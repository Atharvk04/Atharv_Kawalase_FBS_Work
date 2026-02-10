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
    
    @SuppressWarnings("unused")
	private void toggleDeviceView() {

        System.out.print("Enter Room ID: ");
        int roomId = sc.nextInt();

        System.out.print("Enter Device ID: ");
        int deviceId = sc.nextInt();

        Device device = controller.getDevice(roomId, deviceId);

        if (device == null) {
            System.out.println("Room or Device not found");
            return;
        }

        System.out.println("\nDevice: " + device.getDeviceName());
        System.out.println("Current Status: " + (device.getIsOn() ? "ON" : "OFF"));

        if (device.getIsOn()) {
            System.out.println("1. Turn OFF");
        } else {
            System.out.println("1. Turn ON");
        }
        System.out.println("2. Cancel");

        int choice = sc.nextInt();

        if (choice == 1) {
            if (device.getIsOn()) {
                controller.turnOffDevice(roomId, deviceId);
            } else {
                controller.turnOnDevice(roomId, deviceId);
            }
        } else {
            System.out.println("Operation cancelled");
        }
    }

}

public class Main {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     HOTEL OPERATIONS TEST");
        System.out.println("=================================");

        // Test Room Class
        Room room101 = new Room(2, 150.00, false, false);

        System.out.println("\nROOM TEST");
        System.out.println("Beds: " + room101.getNumberOfBeds());
        System.out.println("Price: $" + room101.getPrice());
        System.out.println("Available: " + room101.isAvailable());

        room101.checkIn();

        System.out.println("\nAfter Check-In");
        System.out.println("Occupied: " + room101.isOccupied());
        System.out.println("Dirty: " + room101.isDirty());
        System.out.println("Available: " + room101.isAvailable());

        room101.checkOut();

        System.out.println("\nAfter Check-Out");
        System.out.println("Occupied: " + room101.isOccupied());
        System.out.println("Dirty: " + room101.isDirty());
        System.out.println("Available: " + room101.isAvailable());

        room101.cleanRoom();

        System.out.println("\nAfter Cleaning");
        System.out.println("Occupied: " + room101.isOccupied());
        System.out.println("Dirty: " + room101.isDirty());
        System.out.println("Available: " + room101.isAvailable());

        // Test Employee Class
        Employee employee1 = new Employee(
                "03262016",
                "Jada Keels",
                "Mobile Developer",
                52.50
        );

        System.out.println("\nEMPLOYEE TEST");

        employee1.punchIn(8.0);
        employee1.punchOut(17.0);

        System.out.println("Employee: " + employee1.getName());
        System.out.println("Department: " + employee1.getDepartment());
        System.out.println("Hours Worked: " + employee1.getHoursWorked());
        System.out.println("Pay Rate: $" + employee1.getPayRate());
        System.out.println("Total Pay: $" + employee1.getTotalPay());

        System.out.println("\n=================================");
        System.out.println("       TEST COMPLETE");
        System.out.println("=================================");
    }
}
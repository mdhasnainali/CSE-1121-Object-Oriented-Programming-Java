// Class 2 : Data Types and Variables

public class Class2{
    public static void main(String[] args) {

        System.out.println("Java Rocks!");


        // Always write the full name of the variable
        // First letter of the variable must be small letter
        // Upper Camel Case : Class
        // Lower Camel Case : Variable/ Property , Methode


        int passengers;
        passengers = 0;
        passengers = passengers + 10;
        passengers = passengers - 4;
        passengers = passengers + 1;

        System.out.println("Passengers: " + passengers);


        // Working With basic Strings

        String driver;
        driver = "Hasnain";
        int letters = driver.length();
        System.out.println("Driver's Name: " + driver);
        System.out.println("Driver Name's Letter: " + letters);
        String driverNameInUpperCase = driver.toUpperCase();
        System.out.println("Driver's Name in Upper Case: " + driverNameInUpperCase);

        String firstName, lastName, fullName;
        firstName = "Hasnain";
        lastName = "Ali";
        fullName = firstName + " " + lastName;

        System.out.println(fullName.toUpperCase());
    }
}

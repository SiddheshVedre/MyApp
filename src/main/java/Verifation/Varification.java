package Verifation;

import java.io.*;
import java.util.Scanner;

public class Varification {

    // Hardcoded username for simplicity
    private static String storedUsername = "Siddhesh";
    private static String storedPassword;

    // Static block to read the password from the file when the program starts
    static {
        try (BufferedReader br = new BufferedReader(new FileReader("password.txt"))) {
            storedPassword = br.readLine(); // Read the password from file
        } catch (IOException e) {
            storedPassword = "password123"; // Default if file doesn't exist
            System.out.println("Password file not found. Using default password.");
        }
    }

    // Validate login credentials
    public boolean validateLogin(String username, String password) {
        return storedUsername.equals(username) && storedPassword.equals(password);
    }
    
    public boolean validateLogin(String password) {
        return storedPassword.equals(password);
    }

    // Change password
    public String changePassword(String currentPassword, Scanner sc) {
        if (storedPassword.equals(currentPassword)) {
            System.out.print("Enter new password: ");
            String newPassword = sc.next();
            setStoredPassword(newPassword); // Update the password using setter
            return "Password changed successfully!";
        } else {
            return "Incorrect current password.";
        }
    }

    // Setter for the stored password and save it to file
    public static void setStoredPassword(String newPassword) {
        storedPassword = newPassword;
        // Write the updated password to the file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("password.txt"))) {
            bw.write(storedPassword);
        } catch (IOException e) {
            System.out.println("Error saving password.");
        }
    }

    // Getter methods for stored username and password (optional)
    public static String getStoredUsername() {
        return storedUsername;
    }

    public static String getStoredPassword() {
        return storedPassword;
    }
}

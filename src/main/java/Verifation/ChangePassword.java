package Verifation;

import java.util.Scanner;

public class ChangePassword{
	
	   // Method to change the password
 public static void changePassword(Scanner sc) {
     System.out.print("Enter your current password: ");
     String currentPassword = sc.next();

     Varification varify = new Varification(); // Use the new class name here

     // Call changePassword from Varification class
     String message = varify.changePassword(currentPassword, sc);
     System.out.println(message);
 }
}

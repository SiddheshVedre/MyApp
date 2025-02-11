package MainFunction;
import java.util.Scanner;

import Module2.ImpFiles;
import Verifation.ChangePassword;
import Verifation.Varification;





public class MyApp {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        
// Modeule 1 :
        // Step 1: Login Validation
        System.out.print("Enter username: ");
        String username = sc.next();
        System.out.print("Enter password: ");
        String password = sc.next();

        Varification varify = new Varification(); // Use the new class name here

        // Validate login credentialsi
        if (varify.validateLogin(username, password)) {
            System.out.println("Login successful!");
            
            // Greeting to the user
            System.out.println("Hello, " + username ); 

            // Step 2: Option to change password
            System.out.print("Would you like to change your password? (yes/no): ");
            String response = sc.next();

            if (response.equalsIgnoreCase("yes")) {
            	
            	ChangePassword changep = new ChangePassword();
            	changep.changePassword(sc);
                
            }
        
         
// Module 2 : 
        
        	System.out.println("Do you want to open Module 2 ? (yes/no): ");
        	String input = sc.next();
        	
        	if(input.equalsIgnoreCase("Yes")) {
              
                System.out.print("Enter password: ");
                String password1 = sc.next();
                
                // Validate login credentials
                if (varify.validateLogin(password1)) {            
                   
                	ImpFiles imp = new ImpFiles();
                	imp.Files();
                	
                	

        		
        	    } else {
        	    System.out.println("Invalid username or password.");
        	    
        	   }
           
        	 } else {
        	   System.out.println("Logout successful "); 
        	 }
        	
        } else {
            System.out.println("Invalid username or password.");
        }
     
        	sc.close();
        	
   }

}



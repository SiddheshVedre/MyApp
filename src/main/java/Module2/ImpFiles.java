package Module2;


import java.time.LocalDate;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;





public class ImpFiles {
	
	public static WebDriver driver;
	
	 
	public static void Files() {	
		
		System.out.println("I dont have idea right now");
		
		
		LocalDate date = LocalDate.now();
		System.out.println(date.getDayOfMonth() + "/" + date.getMonthValue() + "/" + date.getYear());
		
		// Create a Scanner object to take input
		Scanner scanner = new Scanner(System.in);
		
		// Prompt user for the URL
		System.out.print("Enter the URL to navigate to: ");
		String url = scanner.nextLine();
	   
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// Navigate to the provided URL
		driver.get(url);

       // Print the page title
       System.out.println("Page title is: " + driver.getTitle());

       // Close the browser after operations
       driver.quit();
       
       
	   }
}

import java.util.Scanner;

public class WifiDiagnostic {
	
	public static void main(String[] args) {
		
		String input;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Wifi Diagnostic Test");
		
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
		
		System.out.println("\nFirst step: reboot your computer\nAre you able to connect with the internet? (yes or no)");
		
		input = keyboard.next();
		
		if (input.equals("yes")) {
			
			System.out.println("rebooting your compouter seemed to work");
			
		} else {
			
			System.out.println("Second step: reboot your router\nNow are you able to connect to the internet? (yes or no)");
			
			input = keyboard.next();
			
			if (input.equals("yes")) {
				
				System.out.println("rebooting your router seemed to work");
				
			} else {
				
				System.out.println("Third step: Make sure the cables connecting the router are firmly plugged in and power is getting to the router\nNow are you able to connect to the internet? (yes or no)");
				
				input = keyboard.next();
				
				if (input.equals("yes")) {
					
					System.out.println("checking your router cables seemed to work");
					
				} else {
					
					System.out.println("Fourth step: Move the computer closer to the router\nNow are you able to connect to the internet? (yes or no)");
					
					input = keyboard.next();
					
					if (input.equals("yes")) {
						
						System.out.println("moving your computer closer to your router seemed to work");
						
					} else {
						
						System.out.println("Wifi diagnostic unsuccesful. contact your ISP for further assistance.");
						
						input = keyboard.next();
						
					}
					
				}
				
			}
			
		}
		
	
		System.out.println("\nProgram designed and coded by Luke Wonnacott");
		
	}
}

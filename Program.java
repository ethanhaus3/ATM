package edu.sbcc.cs105;

//import java.util.Scanner;

public class Program {
	public static void main(final String[] args) {
		//Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Enter the correct password:"); String rightPass =
		 * sc.nextLine(); System.out.println("Enter a password:"); String passAtempt =
		 * sc.nextLine();
		 */
		AtmPin atm = new AtmPin("123");
		System.out.println(atm.verifyPinCode("456")); //not sure how to fit methods
		
//		if(atm.lastAttemptFailed()) {
//			if(atm.isBlocked()) {
//				System.out.println("You've tried too many times, enter -1 to reset counter");
//				String reset = sc.nextLine();
//				if(reset.equals("-1")) {
//					atm.resetPasswordAttempts();
//				}else {
//					System.out.println("Sorry, out of luck!");
//				}
//			}else {
//				System.out.println("Enter a new password:");
//			}
//		
//		}
	

}
}

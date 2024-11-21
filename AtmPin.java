package edu.sbcc.cs105;

public class AtmPin {
	private String AtmCode;
	private int counter;
	//private boolean blocked;
	//private boolean badPassword;
	
	private boolean lastAttemptFailed = false; 
	private boolean badCode = false; 
	
	
	public AtmPin(String actualCode) {
		// Creates an AtmPin object with the provided code as the actual PIN
		this.AtmCode = actualCode;
	}
	public boolean verifyPinCode(String code) {
		/*
		* Accepts a string which represents the user's entry of their pin code. 
		* If the string matches the actual code provided in the constructor and the account 
	    * is not blocked then the method returns true. Returns false when the code is
		 * bad OR when isAccountLocked() is true due to too many consecutive bad
		 * verification attempts. If an invalid code was passed or a valid code, but the
		 * account is blocked, the system will increment the number of bad password
		 * attempts. Requirement: DO NOT STORE the user's code when attempting to verify
		 */

		if(AtmCode.equals(code)) {
			badCode = false;}
		else {
			badCode = true;}

		if (isBadPassword() == false && isBlocked() == false) {
			resetPasswordAttempts(); 
			lastAttemptFailed = false; 
			return true; 
		}
		else
		{
			counter++;
			lastAttemptFailed = true; 
			return false; 
			
		}
		
		
		
//		if(AtmCode.equals(code)) {
//			counter++;
//		}
//		
//		// Returns false when the code is
//		//bad OR when isAccountLocked() is true due to too many consecutive bad
//		
//		if((AtmCode != code) || (blocked)) {
//			return false;
//		}else {
//			return true;
//		}
	}
	public boolean lastAttemptFailed() {
		
		return lastAttemptFailed; 
		
//		if(verifyPinCode(AtmCode)) {
//			//counter++;
//			return false;
//		}else {
//			return true;
//		}
	}
	public boolean isBlocked() {
		if(counter > 3) {
			
			return true;
		}else {
			
			return false;
		}
	}
	public void resetPasswordAttempts() {
		counter = 0;
	}
	public boolean isBadPassword() {
		
		return badCode; 
		
		//if(verifyPinCode(code) = false)
	}
	public boolean changePinCode(String newPinCode) {
		//this.code = newPinCode; //not sure how to use this variable
		
		if (lastAttemptFailed == false){
			this.AtmCode = newPinCode; 
			resetPasswordAttempts(); 
			return true; 
		}else
		{
			return false; 
		}
		
		
		
		
	}
	

}

import javax.swing.JOptionPane;

public class Message_box {
public static void main(String[] args) {
	// Copyright Wintriss Technical Schools 2014
	//import javax.swing.JOptionPane;

	/**
	 * Secret Message Box / Secure Messaging System
	 * 
	 * You want to leave a message on one of the Mac computers so that only your friend can read it.
	 * You set up the passcode and the secret message. 
	 * Your friend types in the passcode to retrieve the message.
	 * 
	 */
String s = JOptionPane.showInputDialog("What Is The Secret Password");
if(s.equals ("12%#$%gfu*496L5")){
	JOptionPane.showMessageDialog(null, "Hey Person Congradulations but, \n howd i get here???? \n well I like Pie, How 'bout you \n this gittin long yet\n TOOOOO BAD \n hellllloooooooooo guyyssss \n ill stop soon \n buttt noot this soon \n how's this for a long secrett massage \n ya want to live on the t=death star\n oh yoaaaaaaaaaaaaaaaaaa \n lASASAASAASSASDFRTSSSSSSSFYDRDDDDDDDDDJI˘Ò&^TI \n ok i'l stop now\n ok bye");
	
}else{
	try {
		Runtime.getRuntime().exec("say INTRUDER ALERT, INTRUDER ALERT").waitFor();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
} 
		// 0. Make a main method and put steps 1-5 inside it
		
		// 1. Set the passcode in a String variable
		
		// 2. Using a pop-up, ask for a secret message and store it in a variable

		// 3. Ask your friend for the passcode and store it in a variable

		// 4. If the passcode matches, show the secret message

		// 5. If the passcode does not match, pop-up "INTRUDER!!"

		// [optional] 6. Have your friend also enter a username, and make sure it is correct before releasing the secret message.

	}




}

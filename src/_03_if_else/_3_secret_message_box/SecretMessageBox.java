package _03_if_else._3_secret_message_box;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
		
	
	// 1. Set a password in a String variable
	String Password = "the password";
	// 2. Using a pop-up, ask the first person for a secret message and store it in a variable
	String input = JOptionPane.showInputDialog(null, "What do you want to tell the next person who can guess the password?");
	
	// 3. Now use a pop-up to tell the NEXT user that they can only see the secret message 
	//    if they can guess the passcode
	String inputt = JOptionPane.showInputDialog(null, "If you can guess the secret passcode you will be able to read what the last person to solve the passcode has said to you. Put the password in the answer section.");
	// 4. If their guess matches the password, show them the secret message
	if(inputt.equals(Password)) {
		JOptionPane.showMessageDialog(null,input);
	}
	// 5. If the password does not match, pop-up "INTRUDER!!"
	else {
	JOptionPane.showMessageDialog(null, "INTRUDER I REPEAT, THERE IS AN INTRUDER! ELIMINATE HIM AT ONCE!");
	}
	}
}

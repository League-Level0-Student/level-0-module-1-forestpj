package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "when's your birthday?");
		
		if(input.equals("10/12")) {
			JOptionPane.showMessageDialog(null,"Then happy birthday!");
			
	}
		else {
			JOptionPane.showMessageDialog(null,"Then happy unbirthday!");
		}
}
}
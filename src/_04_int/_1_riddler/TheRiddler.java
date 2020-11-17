package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String input = JOptionPane.showInputDialog(null,
				"I am not alive, but I grow;I don't have lungs, but I need air; I don't have a mouth, but water kills me. What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (input.equals("fire")) {
			JOptionPane.showMessageDialog(null, "correct!");

			score++;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "wrong.");
		}

		JOptionPane.showMessageDialog(null, "you have a score of " + score + ".");

		// 6. Add some more riddles
		String inputt = JOptionPane.showInputDialog(null,
				"I am something people love or hate. I change peoples appearances and thoughts. If a person takes care of themselves I will go up even higher. To some people I will fool htem. To others I am a mystery. Some people might want to try and hide me but I will show. No matter how hard people try I will never go down. What am I?");
		// 2. Make a pop up to show the score.
		if (inputt.equals("age")) {
			JOptionPane.showMessageDialog(null, "correct!");
		} else {
			JOptionPane.showMessageDialog(null, "wrong.");
		}

		JOptionPane.showMessageDialog(null, "you have a score of " + score + ".");
	}
}
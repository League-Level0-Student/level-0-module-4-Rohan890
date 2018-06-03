
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/* You MUST use the above boolean variables in your code */
		isWeekday = true;

		/*
		 * Ask the user for these values using a confirm dialog like the one below
		 * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head",
		 * JOptionPane.YES_NO_OPTION);
		 */
		int s = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		if (s == 1) {
			isWeekday = true;
		} else {
			isWeekday = false;
		}
		int v = JOptionPane.showConfirmDialog(null, "Is it a Vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		if (v == 1) {
			isVacation = true;
		} else {
			isVacation = false;
		}
		if(isWeekday == false||isVacation == true) {
			JOptionPane.showMessageDialog(null, "get up lazybones");
		}
		else {JOptionPane.showMessageDialog(null, "sleep in");}
		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
		 * in”.
		 */
	}
}

package no.hvl.dat100.h600871;

import static javax.swing.JOptionPane.showInputDialog;

public class Util {

	public static double queryDouble(String message) {
		return queryDouble(message, 0.0);
	}

	public static double queryDouble(String message, double d) {
		String input = showInputDialog(message);
		try {
			return Double.parseDouble(input);
		} catch (Exception e) {
			return d;
		}
	}

}

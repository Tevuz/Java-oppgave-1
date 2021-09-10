package no.hvl.dat100.h600871;

import static javax.swing.JOptionPane.*;

public class O3_faktorial {

	public static void main(String[] args) {
		int i = (int) Util.queryDouble("Regn ut faktorial av ");
		showMessageDialog(null, i + "! = " + factorial(i));
	}

	private static int factorial(int i) {
		if (i < 0)
			return 0;
		if (i <= 1)
			return 1;
		return i * factorial(i - 1);
	}

}

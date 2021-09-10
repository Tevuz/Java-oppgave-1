package no.hvl.dat100.h600871;

import static javax.swing.JOptionPane.*;

public class O1_trinnskatt {

	public static void main(String[] args) {
		double income = Util.queryDouble("Inntekt ?");

		double[] taxBracket = new double[] { 934050, 580650, 230950, 164100, 0 };
		double[] taxRate = new double[] { 14.52, 11.52, 2.41, 0.93, 0.0 };

		for (int i = 0; i < taxBracket.length; i++) {
			if (income > taxBracket[i]) {
				showMessageDialog(null,
						String.format("Du er i skattetrinn %d med %.2f skatt", taxBracket.length - i - 1, taxRate[i]));
				return;
			}
		}
	}
}

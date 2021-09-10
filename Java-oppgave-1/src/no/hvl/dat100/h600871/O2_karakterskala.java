package no.hvl.dat100.h600871;

import static javax.swing.JOptionPane.*;

public class O2_karakterskala {

	public static void main(String[] args) {
		final int[] gradeScores = new int[] { 40, 50, 60, 80, 90, 101 };
		final char[] gradeNames = new char[] { 'F', 'E', 'D', 'C', 'B', 'A' };
		
		for (int i = 1; i <= 10; i++) {
			int score = (int) Util.queryDouble("Poengsum for student nr " + i, -1);

			if (score < 0 || score > 100) {
				showMessageDialog(null, "Poengsummen er ikke et tall eller utenfor rekkevide mellom 0 og 100");
				i--;
				continue;
			}

			for (int j = 0; j < gradeScores.length; j++) {
				if (score < gradeScores[j]) {
					showMessageDialog(null, "Student nr " + i + " har karakter " + gradeNames[j]);
					break;
				}
			}
		}
	}
}

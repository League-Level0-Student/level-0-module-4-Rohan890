package extra;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String test = JOptionPane.showInputDialog("What is your test score?");
		double t = Double.parseDouble(test);
		if (t > 89) {
			JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
		}
		else if (t > 79) {
			JOptionPane.showMessageDialog(null,"https://wfa.kronostm.com/index.jsp?locale=en_US&INDEX=0&applicationName=InNOutBurgerNonReqExt&LOCATION_ID=159547061&SEQ=locationDetails");
		} 
		else {
			JOptionPane.showMessageDialog(null, "no comment");
		}
	}
}

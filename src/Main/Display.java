package Main;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Display extends JLabel {
	public Display() {
		JLabel label = new JLabel(" fucking whatever ");
		Border EtchedBorder = BorderFactory.createEtchedBorder();
		label.setBorder(EtchedBorder);
		
		add(label);
	}
}
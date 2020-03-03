package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];

		// use a switch statement to do something cool for each option
		switch (input) {
		case 0:
			JOptionPane.showMessageDialog(null, "you chose Sunday");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "you chose Monday");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "you chose Tuesday");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "you chose Wednesday");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "you chose Thursday");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "you chose Friday");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "you chose Saturday");
			break;

		}
	}
}

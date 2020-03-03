package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
static Zodiac zodiac = Zodiac.TAURUS;
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void horoscope(Zodiac z) {
		switch(z) {
		case ARIES:{
			JOptionPane.showMessageDialog(null, "you will get 1 dollar");
			break;
		}
		case TAURUS:{
			JOptionPane.showMessageDialog(null, "you will get 2 dollars");
			break;
		}
		case GEMINI:{
			JOptionPane.showMessageDialog(null, "you will die");
			break;
		}
		case CANCER:{
			JOptionPane.showMessageDialog(null, "you will get a house");
			break;
		}
		case LEO:{
			JOptionPane.showMessageDialog(null, "you will get a promotion");
			break;
		}
		case VIRGO:{
			JOptionPane.showMessageDialog(null, "you will get food");
			break;
		}
		case LIBRA:{
			JOptionPane.showMessageDialog(null, "you will fail a test");
			break;
		}
		case SCORPIO:{
			JOptionPane.showMessageDialog(null, "you will win at life");
			break;
		}
		case SAGITTARIUS:{
			JOptionPane.showMessageDialog(null, "you will stay the same");
			break;
		}
		case CAPRICORN:{
			JOptionPane.showMessageDialog(null, "you will be ok");
			break;
		}
		case AQUARIUS:{
			JOptionPane.showMessageDialog(null, "you will get 8 dollars");
			break;
		}
		case PISCES:{
			JOptionPane.showMessageDialog(null, "you will get a fish");
			break;
		}
		}
		
		
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		horoscope(zodiac);
	}
	
}

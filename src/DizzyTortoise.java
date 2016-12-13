import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;


public class DizzyTortoise {


	public static void main(String[] args) {
				 
		 // 2. Ask the user how dizzy you want the tortoise from 1-10, then spin that number of times.
String spinCount = JOptionPane.showInputDialog("on a kale of one to ten how dizzy do you want the carrot to be (it is totaly a carrot)");
int count = Integer.parseInt(spinCount);
 // 1. Use the dance method to make the Tortoise spin.
		 dance();


	}


	static void dance() {
		for (int i = 0; i < 2; i++) {
			Tortoise.turn(360);
		}
	}
}



import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class tortchoscolor {
	public static void main(String[] args) {
		Tortoise tort = new Tortoise();

		for (int i = 0; i < 20; i++) {

			// 3. ask the user what color they would like the tortoise to draw
			String color = JOptionPane.showInputDialog("red or blue");
			// 4. use an if/else statement to set the pen color that the user requested
			if (color.equals ("red")) {
				tort.setPenColor(Colors.Reds.Crimson);
			} else if (color.equals ("blue")) {
				tort.setPenColor(Colors.Blues.Blue);
			} else {
				tort.setPenColor(Colors.getRandomColor());
			}
			// 5. if the user doesn’t enter anything, choose a random color

			// 6. put a loop around your code so that you keep asking the user for more colors & drawing them

			// 2. set the pen width to 10
			tort.setSpeed(10);
			tort.setPenWidth(10);
			// 1. make the tortoise draw a shape (this will take more than one line of code)
			for (int o = 0; o < 4; o++) {
				tort.move(150);
				tort.turn(90);
			}
		}

	}
}

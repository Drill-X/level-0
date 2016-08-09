import javax.swing.JOptionPane;

public class ridle {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String ridle1 = JOptionPane.showInputDialog("Imagine you are in a dark room. How do you get out?");
		if (ridle1.equals("Stop imagining")) {
			JOptionPane.showMessageDialog(null, "Ding ding you are correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong the answer is, Stop imagining");
		}

		String ridle2 = JOptionPane.showInputDialog(
				"Jhonny's mother had three children. The first one was bob the second was joe what was the third one's name?");
		if (ridle2.equals("Jhonny")) {
			JOptionPane.showMessageDialog(null, "Ding ding you are correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong the answer is, Jhonny");
		}

		String ridle3 = JOptionPane
				.showInputDialog("If there are three apples and you take 2 away how maney apples do you have?");
		if (ridle3.equals("2")) {
			JOptionPane.showMessageDialog(null, "Ding ding you are correct");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "You are wrong the answer is, 2");
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		if (score == (3)) {
			JOptionPane.showMessageDialog(null, "YOU WIN THE GAME OV RIDLES");
		} else {
			JOptionPane.showMessageDialog(null, "YOU LOSE THE GAME OV RIDLES");
		}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.

	}
}

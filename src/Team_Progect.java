import javax.swing.JOptionPane;

public class Team_Progect {
	public static void main(String[] args) {

		int i = 0;
		for (int g = 0; i != 4; g++) {
			String s = JOptionPane.showInputDialog(null, "1-Add \n 2-calculate change\n 3-print massage \n 4-exit");
			i = Integer.parseInt(s);
			if (i == 1) {
				one();
			} else if (i == 2) {
				two();

			} else if (i == 3) {
				three();

			} else if (i == 4) {
				four();

			} else {
				JOptionPane.showMessageDialog(null, "ERROR");

			}
		}
	}

	static void one() {
		String v = JOptionPane.showInputDialog(null, "Give me a numba");
		String n = JOptionPane.showInputDialog(null, "Give me a numba");
		int g = Integer.parseInt(v);
		int j = Integer.parseInt(n);
		int h = g + j;
		JOptionPane.showMessageDialog(null, +h);

	}

	static void two() {
		String u = JOptionPane.showInputDialog(null, "Give me a price");
		String c = JOptionPane.showInputDialog(null, "Give me an amount paid");
		double y = Double.parseDouble(c);
		double m = Double.parseDouble(u);
		double z = y - m;

		if (z < 0) {
			JOptionPane.showMessageDialog(null, "HOW DARE YOU CHEAT ME");
			return;
		} else {
			JOptionPane.showMessageDialog(null, +z);

		}
	}

	static void three() {
		String k = JOptionPane.showInputDialog(null, "Give me a message");
		JOptionPane.showMessageDialog(null, "" + k);

	}

	static void four() {
		System.exit(0);

	}

}

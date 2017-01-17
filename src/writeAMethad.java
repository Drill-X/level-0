import javax.swing.JOptionPane;

public class writeAMethad {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("how old are you");
		int y = Integer.parseInt(s);
		int age = age(y);
		// iRock("ihaveasurpriseforyouitspoop");
		System.out.println("" + age);
		// repeatString(age);
		multiply(y, 2);
	}

	static void iRock(String x) {
		System.out.println("" + x + " Rocks");

	}

	static int age(int s) {

		return 2016 - s;
	}

	static void repeatString(int s) {
		for (int i = 0; i < s; i++) {
			System.out.println("pieissogreatandtasty");
		}

	}

	static void multiply(int s, int y) {
		int j = s * y;
		System.out.println("" + j);
	}
}

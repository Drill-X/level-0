import java.io.IOException;

public class Annoying {
	public static void main(String[] args) throws InterruptedException, IOException {
		String words = "I'm Cool da ba dee da ba daa da ba dee da ba daa da ba dee da ba dooo";

		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
			for (int i = 0; i < 99999; i++) {
				Runtime.getRuntime().exec("say " + words).waitFor();
			}
		}
	}
}

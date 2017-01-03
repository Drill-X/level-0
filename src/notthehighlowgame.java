import java.util.Random;

import javax.swing.JOptionPane;

public class notthehighlowgame {
public static void main(String[] args) {
	String s = JOptionPane.showInputDialog("choose a number (no words, bettween 1 and 100)");
int i = 	Integer.parseInt(s);
	Random random = new Random();
	int x= random.nextInt(100);
	int trys = 0;
	for (int j = 0; j < 99999; j++) {
		
	
	if(x==i){
		JOptionPane.showMessageDialog(null, "HAHA I guessed it, it took me "+trys+" trys though:(");
		
	}else{
		trys++;
		x= random.nextInt(100);
		
	}
		}
}
}

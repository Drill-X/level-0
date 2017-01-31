import java.util.Random;

import javax.swing.JOptionPane;

public class Hilogame2 {
public static void main(String[] args) {
Random g = new Random();
int pigs = g.nextInt(100)+1;
int pie = 0;
int c = 0;
for (int i = 0; i < 10 && c == 0; i++) {
	

String d = JOptionPane.showInputDialog("Pick a number between 1 and 100");
int b = Integer.parseInt(d);
if(b == pigs){
	JOptionPane.showMessageDialog(null, "You WON!!! It took you " + pie + " tries");
	c = 1;
	
}else if(b > pigs){
	JOptionPane.showMessageDialog(null, "Too High");
	pie++;
}else if(b < pigs){
	JOptionPane.showMessageDialog(null, "Too Low");
	pie++;
	
}

}
}
}

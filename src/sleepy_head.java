

import javax.swing.JOptionPane;

public class sleepy_head {

public static void main(String[] args) {
		
		boolean isWeekday, isVacation;
		String piza = "";
		
		
 int pizza =  JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
		 JOptionPane.YES_NO_OPTION);
		 if(pizza == 0){
			isWeekday = true;
			isVacation = false;
			 
		 }else{
		isVacation = true; 
		isWeekday = false; 
			 
		 }
		 if(isWeekday == true){
			 JOptionPane.showMessageDialog(null, "go to school");
			 
		 }else{
piza =	 JOptionPane.showInputDialog("go back to bed");
			 
		 }
if(piza.equals ("easter egg")){
	JOptionPane.showMessageDialog(null, "Type atari breakout into google and go to images for fun game");
	
}else if(piza.equals ("Easter egg")){
	JOptionPane.showMessageDialog(null, "Type zerg rush into google for dafunsy game");
	
}
		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
		 * print “get up lazybones!” If it is a weekday, and we are on vacation,
		 * print “sleep in”.
		 */
	}

}

import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthScrollBarUI;

public class gradeChart {
public static void main(String[] args) throws InterruptedException, IOException {
	for (int i = 0; i < 10; i=i) {}
		
	
	String h =JOptionPane.showInputDialog("give me a number between 0 and 100");
	
	int g =Integer.parseInt(h);
	
	if(g < 0){
		System.out.println("ERROR");
		
	}else if(g > 100 && g != 123){
		System.out.println("ERROR");
		
	}
	if(g >= 90 && g <= 100){
		System.out.println("Grade A");
		
	}else if(g >= 80 && g <= 89 ){
		System.out.println("Grade B");
		
	}else if(g >= 70 && g <= 79 ){
		System.out.println("Grade C");
		
	}else if(g >= 60 && g <= 69 ){
		System.out.println("Grade D");
		
	}else if(g >= 0 && g <= 59 ){
		System.out.println("Grade F");
		
	}else if(g == 123 ){
		String j =JOptionPane.showInputDialog("What do you want me to say");
		try {
			Runtime.getRuntime().exec("say " + j).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		
				Runtime.getRuntime().exec("say " + j).waitFor();
		
	
	
	}
}
}}

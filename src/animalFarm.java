import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class animalFarm {

	animalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that
		 * animal.
for		 */
		for (int i = 0; i < 10; i++) {
			
		
String s = JOptionPane.showInputDialog("what animal do you want (no caps)");
if(s.equals("duck")){
	playQuack();
	
}else if(s.equals("cow")){
	playMoo();
	
}else if(s.equals("dog")){
	playWoof();
	
}else if(s.equals("llama")){
	playLlama();
}else if(s.equals("keith")){
	try{
	Runtime.getRuntime().exec("say hello, i am keith").waitFor();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {

}
	playLlama();
}else{
		
			
			 try {
				Runtime.getRuntime().exec("say choose a different animal").waitFor();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}}
		/* 2. Make it so that the user can keep entering new animals. */
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	
	void playLlama(){
		playNoise(llamaFile);
	}

	  String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";


	/* Ignore this stuff */

	public void playNoise(String soundFile) {
    	try {
   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(3400);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}

	public static void main(String[] args) {
		new animalFarm();
	}

}



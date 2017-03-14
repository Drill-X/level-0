import javax.swing.JOptionPane;

public class HappyPets_are_not_happy {
	static String pets = "";
static	int happy = 0;
static int beat = 0;
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
pets = JOptionPane.showInputDialog("What pet do you want");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
for (int i = 0; i > -5; i++) {
	

			int task = JOptionPane.showOptionDialog(null, "What do you do to make you pet happy", "HAPPYPETS", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "CLEAN POOP", "FEED", "WALK","BEAT PET", "SHOW HAPPY" }, null);
if(task == 0){
	clenPoop();
	
}else if(task == 1){
	feed();
	
}else if(task == 2){
	walk();
	
}else if(task == 4){
	showHappy();
	
}else if(task == 3){
	beat();
	
}
if(happy == 500){

	JOptionPane.showMessageDialog(null, "Congradulations, you are now a wanted criminal for aculy like ing your " + pets + ". now you shall die");
	break;
	
}
if(beat == 5){
	JOptionPane.showMessageDialog(null, "your "+ pets+" has killed you");
	break;
} 

}
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void clenPoop(){
		JOptionPane.showMessageDialog(null, "Yaay you have escaped the Bio-decontamination zone and survived the toxic fumes of the poop");
		happy += 25;
	}
	static void showHappy(){
		JOptionPane.showMessageDialog(null, "HAPPYNESS = "+happy);
	}
	static void feed(){
		JOptionPane.showMessageDialog(null, "you ave escaped the evil clutches of your hungry " + pets + " and survived, yay you");
		happy +=5;
	}
	static void walk(){
		JOptionPane.showMessageDialog(null, "you have somehow managed to survive being draged across the street by your " + pets);
		happy +=5;
	}
	static void beat(){
		JOptionPane.showMessageDialog(null, "you have beat your " + pets);	
		happy-=25;
		beat += 1;
	}
}


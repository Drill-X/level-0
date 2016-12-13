
/** Copyright The League of Amazing Programmers 2013-2017
Level 0
Shape Spiral
Duration=.00
Platform=Eclipse
Type=Recipe
Objectives=Integer.parseInt()
Optional=Yes
*/

/** 

*/

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class ShapeSpiral {

    public static void main(String[] args) {
        Tortoise.setSpeed(10);
        // 3. Make a variable to hold the number of sides and set it to 0
        int sides= 8;
        // 4. Ask the user which spiral they would like (square, triangle, or pentagon)
   String h =     JOptionPane.showInputDialog("do you want a square, triangle, or pentagon");
        // 5. Set the number of sides depending on what the user entered (multiple lines of code)
        if (h.equalsIgnoreCase("pentagon") ){
        	sides = 5;
        	
        }else if(h.equalsIgnoreCase("square")){
        	sides = 4;
        	
        }else if(h.equalsIgnoreCase("triangle")){
        	sides = 3;
        	
        }else{
        	JOptionPane.showMessageDialog(null, "Sorry, I don't know how to draw a " + h);
        	
        }
        // 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
        
        // 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUOkn
        for (int i = 0; i < 80; i++) {
			Tortoise.move(sides*i);
			Tortoise.turn(360/sides);
		}
        // 2. Change your code to turn the square spiral into a triangle spiral
        
    }

}




															
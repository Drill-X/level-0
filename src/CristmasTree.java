import java.awt.Color;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;


public class CristmasTree {


	public static void main(String[] args) {
		CristmasTree ohChristmasTree = new CristmasTree();
		ohChristmasTree.drawTree();
	}
	void drawTree(){
		CristmasTree ohChristmasTree = new CristmasTree();
	ohChristmasTree.drawStar();
	ohChristmasTree.drawTreeBody();
	ohChristmasTree.drawTreeTrunk();
	}

	double treeWidth = 15;
	double scale = 1.1;	//This is how much the width of the tree increases with each layer down


	void drawTreeBody() {
		// 8. Change the color of the line the tortoise draws to forest green	
		Tortoise.setPenColor(PenColors.Greens.ForestGreen);
		Tortoise.setSpeed(5);
		// 1. Make a variable for turnAmount and set it to 175
int turn = 175;

		// 2. Start the Tortoise facing to the right
Tortoise.turn(90);

		// 5. Repeat steps 3 through 11, 11 times
for (int i = 0; i < 11; i++) {
	


			// 3. Move the tortoise the width of the tree
Tortoise.move(treeWidth);
			// 4. Turn the tortoise the current turnAmount to the right
Tortoise.turn(turn);
			// 6. Set the treeWidth to the current treeWidth times the scale
 treeWidth*= scale;
			// 7. Move the tortoise the width of a tree again
 Tortoise.move(treeWidth);
			// 9. Turn the tortoise the current turn amount to the LEFT
 Tortoise.turn(-turn);
			// 10. Set the treeWidth to the current treeWidth times the scale again
 treeWidth*= scale;
			// 11. Decrease turnAmount by 1
turn -= 1;
}
}
	
	void drawTreeTrunk() {
		// 1. Move the tortoise half the width of the tree
		Tortoise.move(treeWidth/2);

		// 2. Change the tortoise so that it is pointing straight down
		Tortoise.turn(90);

		// 4. Set the pen width to the tree width divided by 10
		Tortoise.setPenWidth(treeWidth/10);

		// 5. Change the color of the line the tortoise draws to brown
		Tortoise.setPenColor(PenColors.Browns.Brown);

		// 3. Move the tortoise a quarter the tree width
		Tortoise.move(treeWidth/4);
		Tortoise.penUp();
		Tortoise.moveTo(300,300);
		Tortoise.penDown();
		Tortoise.setPenWidth(1);
		Tortoise.setPenColor(PenColors.Blues.CornflowerBlue);
		int sides = 30;
		for (int i = 0; i < sides; i++) {
			Tortoise.move(100/sides);
			Tortoise.turn(360/sides);
		}
		

	}
	
	void drawStar() {
		// * Optional: Draw a red star on top of the tree. Hint: 144 degrees makes a star.
	for (int i = 0; i < 5; i++) {
		Tortoise.setPenColor(PenColors.Yellows.Gold);
		Tortoise.setSpeed(5);
		Tortoise.move(25);
		Tortoise.turn(144);
	}
	}


}



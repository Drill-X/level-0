import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
// *.625
public class Batman {
public static void main(String[] args) {
drawCube3D(100);
}

static void drawCube3D(int length){
	for (int l = 0; l < 10000; l++) {
		
	
	Robot bat = new Robot("batman");
int	k = length;
	double g = k*.625;

		

		bat.setSpeed(10);
		bat.penDown();
		if(g > 1000){
			bat.penUp();
			
		}
		for (int i = 0; i < 4; i++) {
			bat.move(k);
			bat.turn(90);
		}
		bat.turn(-45);
		bat.move((int)g);
		bat.turn(45);
		for (int j = 0; j < 4; j++) {
			bat.move(k);
			bat.turn(90);
		}
		bat.move(k);
		bat.turn(135);
		bat.move((int)g);
		bat.turn(-45);
		bat.move(k);
		bat.turn(-135);
		bat.move((int)g);
		bat.turn(-135);
		bat.move(k);
		bat.turn(-45);
		bat.move((int)g);
		bat.turn(45);
		bat.turn(180);
		
		

length=	length+50;
	}
}

}

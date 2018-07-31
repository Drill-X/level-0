import java.util.ArrayList;

import org.jointheleague.graphical.robot.Robot;

public class RobotRobot {
	Robot rob;
	ArrayList<Integer> shapeHolder;
	String imageURL;

	public static void main(String[] args) {
		RobotRobot bob = new RobotRobot("https://www.google.com/url?sa=i&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwiD0ILkl8jcAhVGR60KHWKHARMQjRx6BAgBEAU&url=http%3A%2F%2Fmentalfloss.com%2Farticle%2F88111%2F7-unattractive-facts-about-blobfish&psig=AOvVaw1eHnFUhQahpFqIX3IgIz9S&ust=1533086861907361");
	}

	public RobotRobot(String imageURL) {
		rob = new Robot();
		this.imageURL = imageURL;
		shapeHolder = new ArrayList();
		rob.changeRobot(imageURL);
	}

	void setURL(String set) {
		imageURL = set;
		rob.changeRobot(imageURL);
	}

	String getURL() {
		return imageURL;
	}

	void addShape(int shapesize) {
		shapeHolder.add(shapesize);
	}

	void draw() {
		for (int i = 0; i < shapeHolder.size(); i++) {
			int sides = shapeHolder.get(i);
			for (int y = 0; y < sides; y++) {
				rob.move(10);
				rob.turn(360 / sides);
			}
		}
	}
}

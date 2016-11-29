
public class SillyLoop {
public static void main(String[] args) {
	for (int i = 1; i < 500; i+=3) {
		System.out.println( i+ " is not divisible by three");
		System.out.println((i+1)+ " is not divisible by three");
		System.out.println((i+2)+ " is divisible by three");
	}
}
}

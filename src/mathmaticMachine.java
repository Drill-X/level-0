import javax.swing.JOptionPane;

public class mathmaticMachine {
public static void main(String[] args) {
String s =	JOptionPane.showInputDialog("pick a number");
int i = Integer.parseInt(s);
String x =	JOptionPane.showInputDialog("pick a number");
int z = Integer.parseInt(x);
int g = z+i;
JOptionPane.showMessageDialog(null, ""+i+  " + "  +z+" = "+g );
}
}

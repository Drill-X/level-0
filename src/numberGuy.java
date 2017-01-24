import javax.swing.JOptionPane;

public class numberGuy {
public static void main(String[] args) {
	String g =JOptionPane.showInputDialog("give me a number");
	String j =JOptionPane.showInputDialog("give me a number");
	String l =JOptionPane.showInputDialog("give me a number");
int n=	 Integer.parseInt(g);
int m=	 Integer.parseInt(j);
int r =	 Integer.parseInt(l);

if(m == 9 && r == 4 && n == 8){
	System.out.println("you are ment to eat the chocolate that comes from your dog's butt");
	
}
else if(n < m && n < r && r<m ){
		System.out.println(+n+" "+r+" "+m+" ");
	}else if(n < m && n < r && m<r ){
		System.out.println(+n+" "+m+" "+r);
	}else if(m < n && m < r && r<n ){
		System.out.println(+m+" "+r+" "+n);
	}else if(m < n && m < r && n<r ){
		System.out.println(+m+" "+n+" "+r);
	}else if(r < n && r < m && m<n ){
		System.out.println(+r+" "+m+" "+n);
	}else if(r < n && r < m && n<m ){
		System.out.println(+r+" "+n+" "+m);
	}

	 
	
}
}

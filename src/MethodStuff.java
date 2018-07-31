
public class MethodStuff {
public static void main(String[] args) {
System.out.println(containMethodC("Jeff", 'J'));
System.out.println(containMethodS("Jeff", "Jeff"));	
System.out.println(evenMethod(4));
System.out.println(oddMethod(4, "Jeff"));
}

static boolean containMethodC(String s, char c) {
	boolean returnValue = false;
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i) == c) {
			returnValue = true;
		}
	}
	return returnValue;
}

static boolean containMethodS(String a, String b) {
	boolean returnValue = false;
	if(a.equals(b)) {
		returnValue = true;
	}
	return returnValue;
}

static boolean evenMethod(int a) {
	boolean returnValue = false;
	if(a%2 == 0) {
		returnValue = true;
	}
	return returnValue;
}

static String oddMethod(int a, String s) {
	String returnValue;
	if(a%2 == 0) {
		returnValue = s.toUpperCase();
	}else {
		returnValue = flip(s);
	}
	return returnValue;
}

static String flip(String s){
	int leng = s.length() - 1;
	String fliped = "";
	char flipedC;
	for (int i = leng; i >= 0; i--) {
		flipedC = s.charAt(i);
		fliped += flipedC;
	}
	return fliped;
}
}

import java.util.Scanner;
public class MainClass {
	public static void main(String[] args) {
	convert convertObject = new convert();
	Scanner st = new Scanner(System.in);
	System.out.println("1. Day \n2. Night");
	int don = st.nextInt();
	System.out.println("What is the hour");
	int hr = st.nextInt();
	System.out.println("What is the minute");
	int mt = st.nextInt();
	System.out.println("What is the second");
	int sc = st.nextInt();
	convertObject.setTime(hr, mt, sc, don);
	System.out.println(convertObject.toMill());
	}	
}


package Part_13_Board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BoardObj {


	
	public static BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
	public static Scanner sc = new Scanner(System.in);
	public static String cmd;
	
	public static String r() {
		return sc.next();
	}
	
	public static String r(String comment) {
		So.t(comment + ":"); 
		return sc.next();
	}
	public static String rl(String comment) {
		So.t(comment + ":"); 

		try {
			return re.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	


//	public static 
}

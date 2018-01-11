package ie.gmit.sw.main;

import java.util.Scanner;

public class Menu {
	
	public static void main() throws Exception {
	
		Scanner read = new Scanner(System.in);
	
		//variables
		String file1;
		String file2;
	
		//user prompt to enter files
		System.out.println("Please Enter file 1: ");
		file1 = read.nextLine();
		
		System.out.println("Please Enter file 2: ");
		file2 = read.nextLine();
		
		//passing files to launcher
		Launcher.Launch(file1, file2);
	
		//close
		read.close();
	}
}

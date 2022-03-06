package utils;

import java.util.Scanner;

public class IOHandler {
	private final Scanner sc;
	
	public IOHandler(Scanner sc) {
		this.sc = sc;
	}
	
	public String enter() {
		return sc.nextLine();
	}
	
	public void printCommand(String command) {
		System.out.println(command);
	}
	
	public void printBlank() {
		System.out.println();
	}
}

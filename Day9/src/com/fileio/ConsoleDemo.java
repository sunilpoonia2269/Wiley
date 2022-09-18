package com.fileio;

import java.io.Console;

public class ConsoleDemo {

	public static void main(String[] args) {
		Console console = System.console();
		System.out.println("Enter your name : ");
		String user = console.readLine();
		System.out.println("Welcome " + user);
		

	}

}

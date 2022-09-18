package com.fileio;

import java.io.File;
import java.io.IOException;

// Byte hirearchy
// Character Hirearchy


public class Demo1 {

	public static void main(String[] args) {
		
		File f = new File("first.txt"); // It points towards a given file -> file can be or cannot be present
		try {
			if(!f.exists()) {
				f.createNewFile();  // Checked exception
				System.out.println("new file is created");
			}else {
				System.out.println("File is already present");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}

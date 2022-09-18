// Character Hierarchy
package com.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class Demo4 {

	public static void main(String[] args) {
		
		// Also can use try with resources
		try {
			FileWriter fs = new FileWriter("first.txt", true);
			fs.write(" Now i am appending");
			fs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

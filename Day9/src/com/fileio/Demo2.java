package com.fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) {
		// Write in file using byte hierarchy
		try(FileOutputStream fos = new FileOutputStream("first.txt", true);) {
			// Opening file into write mode -> It will going to open in byte mode
			
			byte[] data = "We are learning with io".getBytes();
			fos.write(data);
			System.out.println("data added into file");
			
		} catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

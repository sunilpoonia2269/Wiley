package com.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) {
//		File f = new File("first.txt");
//		FileInputStream fis = new FileInputStream("fist.txt");
//		FileInputStream fis = new FileInputStream(f);
//		FileInputStream fis = new FileInputStream(new File("fist.txt")); // Considered as best practice
		
		try(FileInputStream fis = new FileInputStream(new File("first.txt"));) {
			int i=0;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			
			
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}

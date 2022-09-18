package com.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo5 {

	public static void main(String[] args) {
		BufferedReader bufferReader = null;
		
		try {
			FileReader fr = new FileReader("first.txt");
			bufferReader = new BufferedReader(fr);
			String line;
			while((line = bufferReader.readLine()) != null) {
				System.out.println(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}

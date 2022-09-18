package com.serilize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student("Jay", 9.3, "wiley432");
		
		
		seriliazeStudent(student1);
		
		Student student2 = deserilizeStudent();
		System.out.println(student2);

	}

	private static Student deserilizeStudent() {
		Student s = null;
		try(FileInputStream fis = new FileInputStream(new File("student.txt"));ObjectInputStream ois = new ObjectInputStream(fis);) {
			s = (Student)ois.readObject();
			System.out.println("Deserilization happen");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}

	private static void seriliazeStudent(Student student1) {
		
		try(FileOutputStream fos = new FileOutputStream(new File("student.txt"));
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			
			
			oos.writeObject(student1);
			System.out.println("Object is serilized");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

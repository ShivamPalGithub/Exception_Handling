package com.in.chaked_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("d:/abc.txt");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("file not found");

		} finally {
			if (fis != null) {
				fis.close();
			}
		}
		System.out.println("file closed");
	}
}

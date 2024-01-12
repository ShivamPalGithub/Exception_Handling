package com.in.chaked_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
       try {
		FileInputStream fis=
				 new  FileInputStream("d:/ac.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}   
	}

}

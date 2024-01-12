package com.in.runtimee_exception;

public class JavaExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{  
		      int data=100/0;  
		   }catch(ArithmeticException e){System.out.println(e);}  
		   System.out.println("rest of the code...");  
		  }  

	}



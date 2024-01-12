package com.in.runtimee_exception;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a=100,b=2,c;
			c=a/b;
			System.out.println(c);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			System.out.println("i am finally block");
		}
	}

}

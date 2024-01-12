package com.in.runtimee_exception;

import java.util.Scanner;

public class Voting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age :");

		int age = sc.nextInt();
		try {
			if (age < 18) {
				throw new YoungerAgeException("you are not eligble to voting");
			} else {
				System.out.println("vote sucess");
			}

		} catch (YoungerAgeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("hello");
	}
}

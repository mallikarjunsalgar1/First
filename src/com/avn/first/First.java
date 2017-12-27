package com.avn.first;

import com.avn.second.Second;

public class First {
	public static void main(String[] args) {
		System.out.println("First-branch merged");
		Second s=new Second();
		s.display();
		System.out.println("third-branch merged");
	}
}
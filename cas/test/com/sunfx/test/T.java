package com.sunfx.test;

import org.jasig.cas.authentication.handler.DefaultPasswordEncoder;

public class T {

	public static void main(String[] args) {

		DefaultPasswordEncoder encode  = new DefaultPasswordEncoder("MD5");
		System.out.println(encode.encode("1"));
		
	}

}

package com.doganilbars.main;

//another way to remove a character
//bir karateri kaldýrmak için baþka bir yol
public class Example013RemoveLetter1 {
	public static void main(String[] args) {
		String str = "Gayret";
		
		str=str.substring(0, 3)+str.substring(4,str.length());
		System.out.println("After Removing 4th character "+str);

	}
}
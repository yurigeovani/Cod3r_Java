package com.ygtech.cod3r.exercisesAndTests.lambdas.ex14;

import java.util.Arrays;

class Palindrome implements Checker {

	@Override
	public boolean run(String str) {
		
		char [] word = str.toCharArray();
		char [] reverseWord = new char[word.length];
		for (int i = word.length; i >0 ; i--) {
			reverseWord[reverseWord.length-i] = word[i-1];
		}

//		if(Arrays.toString(word).equals(Arrays.toString(reverseWord)))
//			return true;
//		return false;
		
		//W3 suggestion
		return Arrays.toString(word).equals(Arrays.toString(reverseWord));
	}

}

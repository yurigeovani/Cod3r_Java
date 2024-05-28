package com.ygtech.cod3r.exercisesAndTests.lambdas.ex14;

class PalindromeW3 implements Checker {

	@Override
	public boolean run(String str) {
		String strReversed = new StringBuilder(str).reverse().toString();
		return strReversed.equals(str);
	}

}

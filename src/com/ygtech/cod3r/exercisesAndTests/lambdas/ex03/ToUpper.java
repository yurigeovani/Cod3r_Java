package com.ygtech.cod3r.exercisesAndTests.lambdas.ex03;

import java.util.List;

class ToUpper implements Convert {
	
//	My resolution:
//	@Override
//	public List<String> run(List<String> str) {
//		for (int i = 0; i < str.size(); i++) {
//			str.set(i, str.get(i).toUpperCase());
//		}
//		return str;
//	}

	@Override
	public List<String> run(List<String> str) {
		str.replaceAll(t -> t.toUpperCase());
		return str;
	}
}

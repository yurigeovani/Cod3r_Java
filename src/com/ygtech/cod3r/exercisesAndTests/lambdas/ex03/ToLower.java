package com.ygtech.cod3r.exercisesAndTests.lambdas.ex03;

import java.util.List;

class ToLower implements Convert{

//	My resolution:
//	@Override
//	public List<String> run(List<String> str) {
//		for (int i = 0; i < str.size(); i++) {
//			str.set(i, str.get(i).toLowerCase());
//		}
//		return str;
//	}

	@Override
	public List<String> run(List<String> str) {
		str.replaceAll(t -> t.toLowerCase());
		return str;
	}
}

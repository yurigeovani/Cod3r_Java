package exercisesAndTests.lambdas.ex03;

import java.util.List;

class ToUpper implements Convert {

	@Override
	public List<String> run (List<String> str) {
		for (String string : str) {
			string = string.toUpperCase();
		}
		return str;
	}

}

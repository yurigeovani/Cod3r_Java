package exercisesAndTests.lambdas.ex05;

import java.util.List;

class AlphabeticalOrder implements Sorter {

	@Override
	public List<String> run (List<String> strings) {
		strings.sort((a,b) -> a.compareToIgnoreCase(b));
		return strings;
	}
}

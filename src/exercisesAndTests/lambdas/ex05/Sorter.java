package exercisesAndTests.lambdas.ex05;

import java.util.List;

@FunctionalInterface
interface Sorter {
	List<String> run (List<String> strings);
}

package exercisesAndTests.lambdas.ex04;

import java.util.List;

@FunctionalInterface
interface Filter {

	List<Integer> run(List<Integer> numbers);
}

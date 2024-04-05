package exercisesAndTests.lambdas.ex03;

import java.util.List;

@FunctionalInterface
interface Convert {
	List<String> run(List<String> str);
}

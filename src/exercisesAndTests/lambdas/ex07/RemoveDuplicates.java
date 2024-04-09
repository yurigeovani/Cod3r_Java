package exercisesAndTests.lambdas.ex07;

import java.util.ArrayList;
import java.util.List;

class RemoveDuplicates implements Numbers {

	@Override
	public List<Integer> run(List<Integer> numbers) {
		
		List<Integer> listNumbers = new ArrayList<Integer>();
		
		numbers
			.stream()
			.distinct()
			.forEach(listNumbers::add);
		
		return listNumbers;
	}
}

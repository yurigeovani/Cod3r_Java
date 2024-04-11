package exercisesAndTests.lambdas.ex12;

import java.util.Iterator;
import java.util.List;

class Sum implements Numbers{

	@Override
	public int run(List<Integer> numbers) {
		Iterator<Integer> i = numbers.iterator();
		int result = 0;
		
		while (i.hasNext()) {
			result += i.next();
		}
		
		return result;
	}

}

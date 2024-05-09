package s09_StreamAPI.a207;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

class Reduce1 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac+n;
		
		//Stream simples: deve usar o .get no fim.
		Integer total1 = nums.stream().reduce(soma).get();
		System.out.println(total1);

		//Stream com acumulador: o valor passado como acumulador é usado como start
		Integer total2 = nums.stream().reduce(100, soma);
		System.out.println(total2);

		//Stream paralela: o valor passado como acumulador é aplicado pra todos os casos
		Integer total3 = nums.parallelStream().reduce(100, soma);
		System.out.println(total3);

		
		//Resultado foi um Optional<Integer>
		nums.stream()
			.filter(n -> n>5)
			.reduce(soma)
			.ifPresent(System.out::print);
		
	}

}

package s08_Lambdas.a184;

import java.util.function.Predicate;

class PredicadoComposicao {

	public static void main(String[] args) {

		Predicate<Integer> isPar = num -> num%2==0;
		
		Predicate<Integer> isTresDigitos = num -> num>=100 & num<=999;
		
		System.out.println(isPar.test(22));
		System.out.println(isTresDigitos.test(212));
		
		System.out.println(isPar.and(isTresDigitos).negate().test(224));
		System.out.println(isPar.or(isTresDigitos).test(23));
		
	}
}

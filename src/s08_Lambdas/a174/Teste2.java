package s08_Lambdas.a174;

import java.util.function.BinaryOperator;

public class Teste2 {

	public static void main(String[] args) {

		// Pode ser escrito assim
		Calculo calculo1 = (x, y) -> {
			return x+y;
		};
		
		System.out.println(calculo1.executar(2, 5));
		
		// Ou assim
		Calculo calculo2 = (x, y) -> { return x*y; };
		
		System.out.println(calculo2.executar(2, 5));
		
		// Ou assim
		calculo2 = (x,y) -> x*y;
		System.out.println(calculo2.executar(5, 5));
		
		System.out.println(calculo2.legal());
		System.out.println(Calculo.muitoLegal());
		
		BinaryOperator<Double> calc1 = (x, y) -> { return x+y; };
		System.out.println(calc1.apply(2.0, 5.0));
		calc1 = (x,y) -> x*y;
		System.out.println(calc1.apply(2.0, 5.0));
		
		BinaryOperator<Integer> calc2 = (x,y) -> x*y;
		System.out.println(calc2.apply(2, 5));
	}
}

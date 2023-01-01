package s3_Fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {

//		My resolution:
		
//		double exp1 = (Math.pow((6*(3+2)), 2))/(3*2);
//		double exp2 = Math.pow(((1-5)*(2-7))/2,2);
//		
//		double result = Math.pow(exp1-exp2, 3)/Math.pow(10, 3);
//		
//		System.out.println(result);
		
//		Sugestão do professor mas com minha resolução:
		
		double numA = Math.pow(6*(3+2), 2);
		double denA = 3*2;
		
		double numB = (1-5)*(2-7);
		double denB = 2;

		double superiorA = numA/denA;
		double superiorB = Math.pow(numB/denB, 2);
		
		double superior = Math.pow(superiorA-superiorB, 3);
		double inferior = Math.pow(10,3);
		
		double resultado = superior/inferior;
		
		System.out.println(resultado);
	}
}
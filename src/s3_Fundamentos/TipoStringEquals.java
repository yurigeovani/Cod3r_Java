package s3_Fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {

		System.out.println("2" == "2");

		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1)); // equals compara o conteudo
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim()); // funcao trim remove os espaços em branco
		System.out.println("2".equals(s2.trim()));
		
		//Em caso de comparacao de strings, usar o .equals
		entrada.close();

	}

}

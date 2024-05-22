package s10_Erros.a224;

import java.util.Scanner;

class Finally {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		try {			
			System.out.println( 7 / entrada.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally 1!");
		}
		
		try {			
			System.out.println( 7 / entrada.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally 2!");
			entrada.close();			
		}
		
		System.out.println("Fim!");
	}

}

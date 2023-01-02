package s5_ClassesEMetodos.a111;

public class Data {
	
	int dia;
	int mes;
	int ano;

	Data() {
		this(1, 1, 1970);
		//posso usar o THIS para chamar outros construtores
	}

	Data(int diaInicial, int mesInicial, int anoInicial) {

		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}

	String obterDataFormatada() {
		return String.format("%02d/%02d/%04d", dia, mes, ano);
	}

}

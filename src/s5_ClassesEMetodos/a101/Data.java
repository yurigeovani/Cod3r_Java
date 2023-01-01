package s5_ClassesEMetodos.a101;

public class Data {
	int dia;
	int mes;
	int ano;

	Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
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

package s05_ClassesEMetodos.a097;

class Data {
	int dia;
	int mes;
	int ano;

	String obterDataFormatada() {
		return String.format("%02d/%02d/%04d", dia, mes, ano);
	}
}

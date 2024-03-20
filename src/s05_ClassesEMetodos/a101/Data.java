package s05_ClassesEMetodos.a101;

class Data {
	public int dia;
	public int mes;
	public int ano;

	public Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}

	public Data(int diaInicial, int mesInicial, int anoInicial) {

		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}

	public String obterDataFormatada() {
		return String.format("%02d/%02d/%04d", dia, mes, ano);
	}
}

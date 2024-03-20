package s05_ClassesEMetodos.a108;

class ValorVsReferencia {

	public static void main(String[] args) {

		int a = 2;
		int b = a;
		
		System.out.printf("A: %d\nB: %d\n", a, b);
		
		a++;
		
		System.out.printf("A: %d\nB: %d\n", a, b);
		
		b--;
		
		System.out.printf("A: %d\nB: %d\n", a, b);
		
		Data data1 = new Data(3,3,2022);
		Data data2 = data1;
		
		System.out.printf("Data 1: %s\nData 2: %s\n", data1.obterDataFormatada(), data2.obterDataFormatada());
		
		//Data data2 = new Data();
		data2.dia = 10;
		data2.mes = 12;
		data2.ano = 1990;
		
		System.out.printf("Data 1: %s\nData 2: %s\n", data1.obterDataFormatada(), data2.obterDataFormatada());
		
		data1.dia = 25;
		data1.mes = 9;
		data1.ano = 2013;
		
		System.out.printf("Data 1: %s\nData 2: %s\n", data1.obterDataFormatada(), data2.obterDataFormatada());
		
		voltarDataParaValorPadrao(data2);
		
		System.out.printf("Data 1: %s\nData 2: %s\n", data1.obterDataFormatada(), data2.obterDataFormatada());
		
		System.out.printf("A: %d\nB: %d\n", a, b);
		
		alterarPrimitivo(a);
				
		System.out.printf("A: %d\nB: %d\n", a, b);

	}
	
		static void voltarDataParaValorPadrao (Data d) {
			d.dia = 1;
			d.mes = 1;
			d.ano = 1970;
		}
		
		static void alterarPrimitivo(int a) {
			a++;
		}

}

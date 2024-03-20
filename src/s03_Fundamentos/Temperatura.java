package s03_Fundamentos;

class Temperatura {

	public static void main(String[] args) {
	
		double tempF = 86;
		final int AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		
		double tempC = (tempF - AJUSTE) * FATOR;
		
		System.out.println("Temperatura em Celcius: " + tempC + "°C");
	}
}
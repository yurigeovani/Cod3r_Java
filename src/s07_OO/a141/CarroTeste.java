package s07_OO.a141;

public class CarroTeste {

	public static void main(String[] args) {

		Carro c1 = new Carro();
		System.out.println(c1.estaLigado());
		
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println(c1.motor.giros());
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		System.out.println(c1.motor.giros());
		
		// Relação bi direcional
		// Não é preciso fazer todos esses relacionamentos, é apenas para exemplificar que é possível
		System.out.println(c1.motor.carro.motor.carro.motor.carro.motor.carro.motor.carro.motor.carro.motor.giros());
	}

}

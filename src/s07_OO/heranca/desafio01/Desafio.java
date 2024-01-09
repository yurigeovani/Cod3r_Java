package s07_OO.heranca.desafio01;

public class Desafio {

    public static void main(String[] args) {
        Civic civic = new Civic();
        Fusca fusca = new Fusca();

        civic.acelerar();
        fusca.acelerar();

        System.out.println("Civic: " + civic);
        System.out.println("Fusca: " + fusca);

        civic.acelerar();
        civic.acelerar();
        fusca.acelerar();
        fusca.acelerar();
        fusca.acelerar();

        civic.frear();
        civic.frear();
        fusca.frear();
        fusca.frear();
        fusca.frear();
        fusca.frear();
        fusca.frear();
        fusca.frear();
        fusca.frear();
        fusca.frear();
        fusca.frear();
        fusca.frear();
        fusca.frear();
        fusca.frear();
        System.out.println("Civic: " + civic);
        System.out.println("Fusca: " + fusca);
    }
}

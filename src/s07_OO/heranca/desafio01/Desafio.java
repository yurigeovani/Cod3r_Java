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

        civic.freiar();
        civic.freiar();
        fusca.freiar();
        fusca.freiar();
        fusca.freiar();
        fusca.freiar();
        fusca.freiar();
        fusca.freiar();
        fusca.freiar();
        fusca.freiar();
        fusca.freiar();
        fusca.freiar();
        fusca.freiar();
        fusca.freiar();
        System.out.println("Civic: " + civic);
        System.out.println("Fusca: " + fusca);
    }
}

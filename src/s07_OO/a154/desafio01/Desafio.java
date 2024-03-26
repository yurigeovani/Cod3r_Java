package s07_OO.a154.desafio01;

class Desafio{

    public static void main (String[] args) {
        Civic civic = new Civic();
        Fusca fusca = new Fusca();

        civic.acelerar();
        fusca.acelerar();

        System.out.println("Civic: " + civic);
        civic.acelerar();
        civic.acelerar();

        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
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
        fusca.acelerar();
        fusca.acelerar();
        fusca.acelerar();
        fusca.acelerar();
        fusca.acelerar();
        System.out.println("Fusca: " + fusca);

        /* civic.frear();
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
        fusca.frear(); */
    }
}

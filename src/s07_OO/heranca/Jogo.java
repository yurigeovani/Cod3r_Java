package s07_OO.heranca;

public class Jogo {

    public static void main(String[] args) {

        Jogador j1 = new Jogador();
        j1.x = 10;
        j1.y = 20;
        
        j1.andar("norte");
        j1.andar("norte");
        j1.andar("norte");
        j1.andar("norte");
        j1.andar("norte");

        System.out.println(j1.y);

    }
}

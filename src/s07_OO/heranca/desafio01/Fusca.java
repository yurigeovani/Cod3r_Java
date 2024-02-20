package s07_OO.heranca.desafio01;

public class Fusca extends Carro{

<<<<<<< HEAD
    Fusca(){
        super(150);
        super.delta = 35;
    }
=======
    Fusca() {
        this(315);
    }

    Fusca(int velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 215;
    }

/*     @Override
    void acelerar() {
        velocidadeAtual += 15;
    } */

>>>>>>> 2513ebf43126a7a04a3c1dd344ce10923c443e2a
}

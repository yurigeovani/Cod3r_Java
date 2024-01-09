package s07_OO.heranca.desafio01;

public class Fusca extends Carro{

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

}

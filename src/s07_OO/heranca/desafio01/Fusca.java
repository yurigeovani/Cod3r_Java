package s07_OO.heranca.desafio01;

public class Fusca extends Carro{

    public Fusca(){
        super(150);
        super.delta = 35;
    }

    public Fusca(int velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 215;
    }
}

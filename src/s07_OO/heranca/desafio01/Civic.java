package s07_OO.heranca.desafio01;

public class Civic extends Carro{

    @Override
    int acelerar(){
        velocidadeAtual += 10;
        return velocidadeAtual;
    }
}

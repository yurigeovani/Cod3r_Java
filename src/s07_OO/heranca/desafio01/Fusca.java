package s07_OO.heranca.desafio01;

public class Fusca extends Carro{

    @Override
    int acelerar() {
        // TODO Auto-generated method stub
        velocidadeAtual += 15;
        return velocidadeAtual;
    }

}

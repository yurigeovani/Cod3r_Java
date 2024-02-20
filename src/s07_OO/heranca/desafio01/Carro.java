package s07_OO.heranca.desafio01;

public class Carro {

    int velocidadeAtual;
    final int VELOCIDADE_MAXIMA;
    int delta = 5;

    Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar(){
        if(velocidadeAtual+delta >= VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += delta;
        }
    }

    int frear(){
        if(velocidadeAtual>=delta){
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
        return velocidadeAtual;
    }

    @Override
    public String toString() {
        return "Velocidade atual é " + velocidadeAtual + " Km/h.";
    }

    
}
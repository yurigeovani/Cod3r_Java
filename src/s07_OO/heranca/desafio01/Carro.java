package s07_OO.heranca.desafio01;

public class Carro {

    int velocidadeAtual;

    int acelerar(){
        velocidadeAtual += 5;
        return velocidadeAtual;
    }

    int freiar(){
        if(velocidadeAtual>=5){
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

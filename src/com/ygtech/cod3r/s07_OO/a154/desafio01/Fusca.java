package com.ygtech.cod3r.s07_OO.a154.desafio01;

class Fusca extends Carro{

    public Fusca(){
        super(150);
        super.delta = 35;
    }

    public Fusca(int velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 215;
    }
}

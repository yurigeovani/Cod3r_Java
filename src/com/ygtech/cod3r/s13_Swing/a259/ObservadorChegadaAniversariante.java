package com.ygtech.cod3r.s13_Swing.a259;

//Por ter apenas um único método, posso usar como Interface Funciona:
// Assim, não precisaria criar a classe namorada e passar apenas um lambda

@FunctionalInterface
interface ObservadorChegadaAniversariante {
	public void chegou(EventoChegadaAniversariante e);
}

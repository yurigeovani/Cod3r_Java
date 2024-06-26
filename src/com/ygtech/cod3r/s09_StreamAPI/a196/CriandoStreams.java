package com.ygtech.cod3r.s09_StreamAPI.a196;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

class CriandoStreams {

	public static void main(String[] args) {

		Consumer<Object> print = System.out::print;
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		
		langs.forEach(print);
		
		String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
		
		Stream.of(maisLangs).forEach(print);
		
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 0, 4).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		//Gerar uma Stream infinita
		//Stream.generate(() -> "a"	).forEach(print);
		//Stream.iterate(0, n -> n+1).forEach(print);
	}
}

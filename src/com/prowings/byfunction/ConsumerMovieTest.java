package com.prowings.byfunction;

import java.util.function.Consumer;

public class ConsumerMovieTest {

	
	public static void main(String[] args) {
		
		Consumer<Movie> c1=m->System.out.println(m.name+": Movie is Good");
		Consumer<Movie> c2=m->System.out.println(m.name+": Movie is Flop");
		Consumer<Movie> c3=m->System.out.println(m.name+": Movie is Boring");
		
		
		Consumer<Movie> cc=c1.andThen(c2).andThen(c3);
		
		Movie movie = new Movie("SpiderMan");
		cc.accept(movie);
	}
}

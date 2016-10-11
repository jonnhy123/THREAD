package br.univel;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world with Thread");
		
		final Contador contador = new Contador(10);
		final Contador contador2 = new Contador(10);
		contador.start();
		contador2.start();
		
		System.out.println("Hello world finished");
	}
}

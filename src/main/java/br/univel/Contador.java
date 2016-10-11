package br.univel;

public class Contador extends Thread{
	private final Integer contarAte;
	
	public Contador(final Integer contarAte){
		this.contarAte = contarAte;
	}
	
	public void contar(){
		Integer contato = 0;
		while (contato < this.contarAte) {
			System.out.println("Número atual: " + contato);
			contato++;
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		super.run();
		this.contar();
	}
}

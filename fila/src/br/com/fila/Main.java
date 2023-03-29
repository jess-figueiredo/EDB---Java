package br.com.fila;

public class Main {

	public static void main(String[] args) {
	
		Fila<String> minhaFila = new Fila<>();
		
		minhaFila.enqueue("primeiro");
		minhaFila.enqueue("Segundo");
		minhaFila.enqueue("Terceiro");
		minhaFila.enqueue("quarto");
		
		
		System.out.println(minhaFila); 
		//tirar o primeiro da fila
		System.out.println(minhaFila.dequeue());
		System.out.println(minhaFila);
		//criando o últmo da fila
		minhaFila.enqueue("último");
		
		System.out.println(minhaFila);
		System.out.println(minhaFila.first());
		
	}

}

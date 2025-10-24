package Lista22;

public class gato {

	String nome;
	String raca;
	int idade;
	
	void miar() {
		System.out.println("Miau!");
	}
	void comer() {
		System.out.println(nome + " está comendo");
	}
	void mostrarInformacoes() {
		System.out.println("A raça doª "+ nome + " é "+ raca + " e eleª tem "+ idade +" anos");
	}

}

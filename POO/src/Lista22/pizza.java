package Lista22;

public class pizza {
	
	String sabor;
	String tamanho;
	boolean bordaRecheada;
	
	void preparar() {
		System.out.println("Preparando pizza de "+sabor);
	}
	void assando() {
		System.out.println("Assando pizza tamanho "+ tamanho);
	}
	void mostrarInformacoes() {
        System.out.println("Sabor: " + sabor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Borda recheada: " + (bordaRecheada ? "Sim" : "Não"));
    }
}

package modelo2;

public class Aluno {

	String nome;
	String ra;

	Falta[] faltas = new Falta[100];
	int totalFaltas = 0;

	public Aluno(String nome, String ra) {
		this.nome = nome;
		this.ra = ra;
	}

	public void adicionarFalta(String data, String materia) {
		faltas[totalFaltas++] = new Falta(data, materia);
	}

	public Falta buscarFaltaPorData(String data) {
		for (int i = 0; i < totalFaltas; i++) {
			if (faltas[i].data.equals(data)) {
				return faltas[i];
			}
		}
		return null;
	}
}

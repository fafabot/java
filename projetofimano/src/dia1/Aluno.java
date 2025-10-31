package dia1;

public class Aluno {
    String nome;
    String turma;
    String matricula;
    int totalFaltas = 0;
    Falta[] faltas = new Falta[10]; // máximo de 10 faltas
    int indiceFalta = 0;

    public Aluno(String nome, String turma, String matricula) {
        this.nome = nome;
        this.turma = turma;
        this.matricula = matricula;
    }

    public void registrarFalta(String data, String motivo) {
        if (indiceFalta < faltas.length) {
            faltas[indiceFalta] = new Falta(data, motivo);
            indiceFalta++;
            totalFaltas++;
            System.out.println("✅ Falta registrada com sucesso!");
        } else {
            System.out.println("⚠️ Limite de faltas atingido!");
        }
    }

    public void mostrarHistorico() {
        System.out.println("\n📋 Histórico de " + nome + ":");
        if (totalFaltas == 0) {
            System.out.println("Nenhuma falta registrada.");
        } else {
            for (int i = 0; i < indiceFalta; i++) {
                faltas[i].mostrarFalta();
            }
            System.out.println("Total de faltas: " + totalFaltas);
        }
    }
}
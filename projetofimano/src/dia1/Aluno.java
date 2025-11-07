package dia1;

public class Aluno {
    private String nome;
    private String turma;
    private String matricula;
    private int totalFaltas = 0;
    private Falta[] faltas = new Falta[10];
    private int indiceFalta = 0;

    // GETTERS e SETTERS
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTurma() { return turma; }
    public void setTurma(String turma) { this.turma = turma; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public int getTotalFaltas() { return totalFaltas; }

 
    public void settotalFaltas(int totalFaltas) { this.totalFaltas = totalFaltas; }
 
    public void adicionarFalta(Falta f) {
        if (indiceFalta < faltas.length) {
            faltas[indiceFalta] = f;
            indiceFalta++;
            totalFaltas++;
        } else {
            System.out.println("⚠ Limite máximo de faltas atingido!");
        }
    }

   
    public void mostrarAluno() {
        System.out.println("Aluno: " + nome);
        System.out.println("Turma: " + turma);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Total de Faltas: " + totalFaltas);
    }

  
    public void mostrarFaltas() {
        if (totalFaltas == 0) {
            System.out.println("Nenhuma falta registrada.");
            return;
        }

   
    }
}

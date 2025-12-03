package modelo2;

public class Sistema {

    Aluno[] alunos = new Aluno[50];
    int totalAlunos = 0;

    Professor[] professores = new Professor[10];
    int totalProfessores = 0;

    public Sistema() {
        
        alunos[totalAlunos++] = new Aluno("Rafael de Aquino", "123");
        alunos[totalAlunos++] = new Aluno("Matheus Luiz", "456");

        professores[totalProfessores++] = new Professor("Juliana", "1234");
        professores[totalProfessores++] = new Professor("Washington", "1234");
    }

    public Aluno buscarAluno(String ra) {
        for (int i = 0; i < totalAlunos; i++) {
            if (alunos[i].ra.equals(ra)) return alunos[i];
        }
        return null;
    }

    public Professor loginProfessor(String nome, String senha) {
        for (int i = 0; i < totalProfessores; i++) {
            if (professores[i].nome.equals(nome) && professores[i].senha.equals(senha)) {
                return professores[i];
            }
        }
        return null;
    }
}
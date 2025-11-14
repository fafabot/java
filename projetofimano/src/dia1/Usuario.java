package dia1;

public class Usuario {
    private String cpfOuEmail;
    private String senha;
    private String nome;
    private String turma;
    private String dataFalta;

    public String getCpfOuEmail() {
        return cpfOuEmail;
    }

    public void setCpfOuEmail(String cpfOuEmail) {
        this.cpfOuEmail = cpfOuEmail;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getDataFalta() {
        return dataFalta;
    }

    public void setDataFalta(String dataFalta) {
        this.dataFalta = dataFalta;
    }
}

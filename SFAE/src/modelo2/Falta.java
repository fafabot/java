package modelo2;

public class Falta {
    String data;
    String materia;
    boolean justificada = false;
    String justificativa = "";

    public Falta(String data, String materia) {
        this.data = data;
        this.materia = materia;
    }
}
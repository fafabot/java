package dia1;

public class Falta {
    String data;
    String motivo;

    public Falta(String data, String motivo) {
        this.data = data;
        this.motivo = motivo;
    }

    public void mostrarFalta() {
        System.out.println("- Data: " + data + " | Motivo: " + motivo);
    }
}
package dia1;

public class Falta {
    private String data;
    private String motivo;

   public void criarFalta(int i) {
	   System.out.println(i+" Falta registrada");
   }


   
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }

 
    public void mostrarFalta() {
        System.out.println("Data: " + data);
        System.out.println("Motivo: " + motivo);
    }
}

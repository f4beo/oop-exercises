package aulaRecurso;
import java.util.ArrayList;
import java.util.Date;


public class Aula {
    private static int contadorId = 0;
    private int idAula;
    private String objetivo;
    private Date data;
    private ArrayList<Recurso> recursos;

    public Aula (String objetivo, Date data) {
        this.idAula = ++ contadorId;
        this.objetivo = objetivo;
        this.data = data;
        this.recursos = new ArrayList<Recurso>();
    }

    public int getIdAula() {
        return idAula;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ArrayList<Recurso> getRecursos() {
        return recursos;
    }

    public boolean adicionarRecurso(Recurso r){
        if (!this.recursos.contains(r)){
            this.recursos.add(r);
            return true;
        }
        return false;
    }

    public boolean removerRecurso(Recurso r){
        if (this.recursos.contains(r)){
            this.recursos.remove(r);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Aula" +
                "\n |ID      :" + idAula +
                "\n |Objetivo:'" + objetivo + '\'' +
                "\n |Data    :" + data +
                "\n |Recursos: " + recursos;
    }
}

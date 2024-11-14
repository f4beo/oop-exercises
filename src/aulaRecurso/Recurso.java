package aulaRecurso;
public class Recurso {
    private static int contadorId = 1000;
    private int idRecurso;
    private String descricao;
    private char tipo;

    public Recurso(char tipo, String descricao) {
        this.idRecurso = ++contadorId;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public int getIdRecurso() {
        return idRecurso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\n\n|Recurso" +
                "\n|idRecurso = " + idRecurso +
                "\n|descricao ='" + descricao + '\'' +
                "\n|tipo      = " + tipo;
    }
}


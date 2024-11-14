package livroMidiaEdicao;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AppLivro {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Midia papel = new Midia(1001, "Livro Físico");
        Midia pdf = new Midia(1002, "Livro Digital");
        Midia audio = new Midia(1003, "Audiobook");

        Livro livro1 = new Livro(1234, "Livro 1", "Classes java");
        Livro livro2 = new Livro(4321, "Livro 2", "Objetos");
        Livro livro3 = new Livro(1423, "Livro 3", "Métodos");

        Edicao[] edicao = new Edicao[5];
        edicao[0] = new Edicao(9876, 2006, livro1, pdf);
        edicao[1] = new Edicao(6543, 2001, livro1, audio);
        edicao[2] = new Edicao(3456, 2000, livro2, papel);
        edicao[3] = new Edicao(6789, 1995, livro3, pdf);
        edicao[4] = new Edicao(1092, 1994, livro3, papel);


        mostrarEdicao(edicao[0]);
        mostrarEdicao(edicao[1]);
        mostrarEdicao(edicao[2]);
        mostrarEdicao(edicao[3]);
        mostrarEdicao(edicao[4]);

        Date dataEmprestimo = formato.parse("02/03/2004");
        if(edicao[0].emprestimo(dataEmprestimo)){
            System.out.println("Exemplar emprestado");
        }
        else{
            System.out.println("Emprestimo nao realizado");
        }

        mostrarEdicao(edicao[0]);
    }

    public static void mostrarEdicao(Edicao edicao){

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Titulo                   : " + edicao.getLivro().getTitulo());
        System.out.println("Assunto do livro         : " + edicao.getLivro().getAssunto());
        System.out.println("Ano do exemplar          : " + edicao.getAno());
        System.out.println("Situacao do exemplar     : " + edicao.getSituacao());
        System.out.println("Descricao da midia       : " + edicao.getMidia().getDescricao());
        if(edicao.getUltimoEmprestimo() != null){
            String dtEmprestimo = formato.format(edicao.getUltimoEmprestimo());
            System.out.println("Data do ultimo emprestimo: " + dtEmprestimo);
        }
        System.out.println();
    }
}
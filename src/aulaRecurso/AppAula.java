package aulaRecurso;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/*
    Fazer uma aplicação que disponibilize um menu para:
    1. Cadastrar recurso: Cadastrar recurso em uma lista de recurso.
    2. Cadastrar aula: Cadastrar aula em uma lista de aula.
    3. Registrar recurso em aula: Inserir recurso em aula, conforme regras do item 5 do desafio extra.
    4. Remover recurso de aula: Exclui recurso de aula, conforme regras do item 6 do desafio extra.
    5. Consultar aula: Recebe o id de uma aula, se a aula existir, mostrar (estilo consulta) os dados da
    aula e mostrar (no estilo listagem) os dados dos recursos inseridos na aula.
    6. Excluir aula: Exclui uma aula da lista de aulas.
    7. Listar aulas: Mostrar o id, a data e o objetivo da aula em forma de listagem.
*/
public class AppAula {
    public static void main(String[] args) throws ParseException {
        Scanner read = new Scanner(System.in); //Usado para textos
        Scanner sc = new Scanner(System.in);   //Usado para caracteres e numeros
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Recurso> r = new ArrayList<Recurso>();
        ArrayList<Aula> a = new ArrayList<Aula>();
        Aula aula;
        Recurso recurso;
        int id;

        int opcao = 0;

        System.out.println("==========================================================");
        System.out.println("|             Sistema de Cadastro de aulas               |");
        System.out.println("|  OPÇÕES:                                               |");
        System.out.println("|  1) Cadastrar Recurso                                  |");
        System.out.println("|  2) Cadastrar Aula                                     |");
        System.out.println("|  3) Registrar recurso em aula                          |");
        System.out.println("|  4) Remover recurso de aula                            |");
        System.out.println("|  5) Consultar aula                                     |");
        System.out.println("|  6) Excluir aulas                                      |");
        System.out.println("|  7) Listar aulas                                       |");
        System.out.println("|  8) SAIR                                               |");
        System.out.println("==========================================================");

        do {
            System.out.print("INSIRA A OPCAO :");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("1) Cadastrar recurso");
                    System.out.print("Digite o Tipo do Recurso[D = digital e F = Fisico]:");
                    char tipo = sc.next().charAt(0);
                    tipo = Character.toUpperCase(tipo);
                    read.reset();
                    System.out.print("Escreva a descrição do Recurso: ");
                    String rDescricao = read.nextLine();

                    recurso = new Recurso(tipo, rDescricao);
                    r.add(recurso);
                    System.out.println("Recurso cadastrado!");
                    System.out.println("==========================================================");
                    break;

                case 2:
                    System.out.println("2) Cadastrar aula");
                    System.out.print("Descreva o objetivo da aula: ");
                    String objetivo = read.nextLine();
                    System.out.print("Insira a data da aula [dd/mm/aaaa]:");
                    String sDataAula = read.nextLine();
                    Date dataAula = sdf.parse(sDataAula);
                    aula = new Aula(objetivo, dataAula);
                    a.add(aula);

                    System.out.println("Aula cadastrada!");
                    System.out.println("==========================================================");
                    break;

                case 3:
                    System.out.println("3) Registrar recurso em aula");
                    System.out.print("Digite o ID da aula: ");
                    id = sc.nextInt();
                    aula = pesquisarIdAula(a, id);
                    if (aula == null) {
                        System.out.println("Aula não encontrada!");
                        System.out.println("==========================================================");
                        break;
                    }
                    System.out.println("Aula encontrada");
                    System.out.println("Registrando recurso na aula ID " + aula.getIdAula());
                    System.out.print("Digite o ID do recurso: ");
                    id = sc.nextInt();
                    recurso = pesquisarIdRecurso(r, id);
                    if (recurso == null){
                        System.out.println("Recurso não encontrado!");
                        System.out.println("==========================================================");
                        break;
                    }
                    if(aula.getRecursos().contains(recurso)){
                        System.out.println("Recurso já inserido na aula!");
                        System.out.println("==========================================================");
                        break;
                    }
                    aula.adicionarRecurso(recurso);
                    System.out.println("Recurso registrado");
                    System.out.println("==========================================================");
                    break;

                case 4:
                    System.out.println("4)Remover recurso em aula");
                    System.out.print("Digite o ID da aula: ");
                    id = sc.nextInt();
                    aula = pesquisarIdAula(a, id);
                    if (aula == null) {
                        System.out.println("Aula não encontrada!");
                        System.out.println("==========================================================");
                        break;
                    }
                    System.out.println("Aula encontrada");
                    System.out.println("Excluindo recurso na aula ID " + aula.getIdAula());
                    System.out.print("Digite o ID do recurso: ");
                    id = sc.nextInt();
                    recurso = pesquisarIdRecurso(r, id);
                    if (recurso == null){
                        System.out.println("Recurso não encontrado na lista de recursos!");
                        System.out.println("==========================================================");
                        break;
                    }
                    if (!aula.getRecursos().contains(recurso)){
                        System.out.println("Recurso não está na lista de recursos da aula ou já foi excluido!");
                        System.out.println("==========================================================");
                    }
                    aula.removerRecurso(recurso);
                    System.out.println("Recurso Excluido");
                    System.out.println("==========================================================");
                    break;
                case 5:
                    System.out.println("5)Consultar aula");
                    System.out.print("Digite o ID da aula: ");
                    id = sc.nextInt();
                    aula = pesquisarIdAula(a, id);
                    if (aula == null) {
                        System.out.println("Aula não encontrada!");
                        System.out.println("==========================================================");
                        break;
                    }
                    mostrarDados(aula);
                    System.out.println("==========================================================");
                    break;
                case 6:
                    System.out.println("6) Excluir Aula");
                    System.out.print("Digite o ID da aula: ");
                    id = sc.nextInt();
                    aula = pesquisarIdAula(a, id);
                    if (aula == null) {
                        System.out.println("Aula não encontrada!");
                        System.out.println("==========================================================");
                        break;
                    }
                    a.remove(aula);
                    System.out.println("Aula excluida");
                    System.out.println("==========================================================");
                    break;
                case 7:
                    System.out.println("7) Listar aulas");
                    System.out.println("Aula| ID |   Data   |     Objetivo     |");
                    for (Aula aula1 : a){
                        System.out.printf("    |%4d|%10s|%18s|\n", aula1.getIdAula(), sdf.format(aula1.getData()), aula1.getObjetivo());
                    }
                    System.out.println("==========================================================");
                    break;
                case 8:
                    System.out.println("8) SAIR");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while (opcao != 8);
        sc.close();
        read.close();
    }

    public static Aula pesquisarIdAula(ArrayList<Aula> a, int id){
        for (Aula aula : a){
            if (aula.getIdAula() == id){
                return aula;
            }
        }
        return null;
    }

    public static Recurso pesquisarIdRecurso(ArrayList<Recurso> r, int id){
        for (Recurso recurso : r){
            if (recurso.getIdRecurso() == id){
                return recurso;
            }
        }
        return null;
    }
    
    public static void mostrarDados(Aula aula) {
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    	String dataFormatada = sdf.format(aula.getData());
    	System.out.println("\n | ID        : " + aula.getIdAula() +
    			           "\n | Objetivo  : " + aula.getObjetivo() +
    			           "\n | Data      : " + dataFormatada +
    			           "\n | Recursos : ");
    	System.out.println("   [Recurso |idRecurso|     descricao     |tipo|");
    	for(Recurso recurso : aula.getRecursos()) {
    		System.out.printf("   [        |%9d|%19s|%4c|\n", recurso.getIdRecurso(), recurso.getDescricao(), recurso.getTipo());
    	}	
    }
}
package Class.Exercicio1;

import java.util.Scanner;

public class LocadoraMain {

    private static Scanner scan = new Scanner(System.in);
    private static Locadora locadora = new Locadora();
    private static int codigo;
    private static int opcao;
    private static String nome, resposta;
    private static char genero;

    public static void main(String[] args) {
        do {
            menu();
            
            System.out.print("=> ");
            opcao = scan.nextInt();

            switch(opcao) {
                case 1:
                incluirFilme();
                break;

                case 2:
                consultarFilmes();
                break;

                case 3:
                consultarFilmesGenero();
                break;

                case 4:
                consultarDados();
                break;

                case 5:
                excluirFilme();
                break;

                default:
                System.out.println("\nValor inválido");
                case 0:
                System.out.println("Sistema finalizado.");
            }
            
        } while (opcao != 0);
    }

    public static void menu() {
        System.out.println("\n=== Menu ===" +
            "\n1) Incluir filmes no cartaz." +
            "\n2) Consultar todos os filmes." +
            "\n3) Consultar total de filmes de um gênero." +
            "\n4) Consultar dados de um filme" +
            "\n5) Excluir filme." +
            "\n0) Sair");
    }

    public static void incluirFilme() {
        do {
            System.out.print("\nDigite o código do filme: ");
            codigo = scan.nextInt();
            scan.nextLine(); // consumir a quebra de linha

            System.out.print("Digite o título do filme: ");
            nome = scan.nextLine();

            System.out.print("Digite o gênero do filme (A - Ação, T - Terror, D - Drama): ");
            genero = scan.nextLine().charAt(0);

            locadora.incluirFilme(codigo, nome, genero);

            System.out.print("Deseja adicionar outro filme? (S/N):");
            resposta = scan.nextLine();
        } while (resposta.equalsIgnoreCase("S"));
    }

    public static void consultarFilmes() {
        locadora.consultarFilmes();
    }

    public static void consultarFilmesGenero() {
        System.out.print("\nDigite o gênero escolhido (A - Ação, T - Terror, D - Drama): ");
        scan.nextLine(); // consumir a quebra de linha
        genero = scan.nextLine().charAt(0);
        locadora.consultarFilmesGenero(genero);
    }

    public static void consultarDados() {
        System.out.print("\nDigite o filme que deseja pesquisar: ");
        scan.nextLine();
        nome = scan.nextLine();
        locadora.consultarDados(nome);
    }

    public static void excluirFilme() {
        System.out.print("\nDigite o filme que deseja excluir: ");
        scan.nextLine();
        nome = scan.nextLine();
        locadora.excluirFilme(nome);
        System.out.println("Filme removido com sucesso!");
    }
}

package Class.Exercicio1;

 import java.util.ArrayList; 
 import java.util.List; 

public class Locadora {
    private List<Filme> filmesLista = new ArrayList<>(); //crio uma lista de filmes de objetos tipo "Filme"
    
    
    public void incluirFilme(int codigo, String nome, char genero) {
        Filme filme = new Filme(codigo, nome, genero); //cria um objeto filme
        filmesLista.add(filme);
        System.out.println("Filme incluído com sucesso!");
    }

    public void consultarFilmesGenero(char genero) {
        int total = 0;
        for (Filme filme : filmesLista) {
            if (Character.toLowerCase(filme.getGenero()) == genero) {
                total++;
            }
        }
        System.out.println("Total de filmes do gênero escolhido: " + total);
    }

    public boolean excluirFilme(String nome) {
        for (Filme filme : filmesLista) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                filmesLista.remove(filme);
                return true;
            }
        }
        return false;
    }

    public void consultarDados(String nome) {
        for (Filme filme : filmesLista) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                System.out.println(filme);
            }
            else {
                System.out.println("Filme não encontrado.");
            }
        }
    }


    public void consultarFilmes() {
        if (filmesLista.isEmpty()) {
            System.out.println("\nNão há filmes listados.");
        }
        else {
            System.out.println("\nFilmes listados:");
            for (Filme filme : filmesLista) {
                System.out.println(filme.getNome());
            }
        }
    }
}

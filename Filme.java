package Class.Exercicio1;

public class Filme {

    //atributos
    private int codigo;
    private String nome;
    private char genero;

    //construtor
    public Filme(int codigo, String nome, char genero) {
        this.codigo = codigo;
        this.nome = nome;
        this.genero = genero;
    }

    //getters
    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public char getGenero() {
        return genero;
    }

    //setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }

    //conteudo
    public String toString() {
        return "\nCódigo: " + codigo +
        "\nNome: " + nome +
        "\nGênero: " + genero;
    }

}
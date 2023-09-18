package Pesquisa;

public class Livro {
    //atributo
    private String título;
    private  String autor;
    private int anoPublicacao;

    public Livro(String título, String autor, int anoPublicacao) {
        this.título = título;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTítulo() {
        return título;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }


    @Override
    public String toString() {
        return "Livro{" +
                "título='" + título + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}

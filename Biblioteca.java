import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    String nome;
    List<Livro> livros;
    List<Autor> autores;


    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
        this.autores = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarAutor(Autor autor) {
        autores.add(autor);
    }

    public boolean verificarDisponibilidade(String livro) {
        boolean disponibilidadeLivro = false;
        for (Livro l : livros) {
            if (l.getTitulo().equals(livro)) {
                l.setDisponivel(true);
                disponibilidadeLivro = l.isDisponivel();
            }
        }
        return disponibilidadeLivro;
    }
}

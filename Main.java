public class Main {


    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Bibli");
        Livro l1 = new Livro("3Porquinhos", "Carlos", false);
        Livro l2 = new Livro("Futebol", "Henrique", false);
        Livro l3 = new Livro("Volei", "Vieira", false);

        Autor a1 = new Autor("Carlos");
        Autor a2 = new Autor("Henrique");
        Autor a3 = new Autor("Vieira");

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);

        biblioteca.adicionarAutor(a1);
        biblioteca.adicionarAutor(a2);
        biblioteca.adicionarAutor(a3);

        System.out.println(biblioteca.verificarDisponibilidade("3Porquinhos"));
        System.out.println(biblioteca.verificarDisponibilidade("Futebol"));
        System.out.println(biblioteca.verificarDisponibilidade("Volei"));
    }
}
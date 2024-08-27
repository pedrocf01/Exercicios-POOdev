import java.util.ArrayList;
import java.util.Iterator;

class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

     public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor;
    }
}

class Biblioteca2 {
    private ArrayList<Livro> livros;

    public Biblioteca2() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(String titulo) {
        Iterator<Livro> iterator = livros.iterator();
        while (iterator.hasNext()) {
            Livro livro = iterator.next();
            if (livro.getTitulo().equals(titulo)) {
                iterator.remove();
                break;
            }
        }
    }

    public void listarLivros() {
        Iterator<Livro> iterator = livros.iterator();
        if (!iterator.hasNext()) {
            System.out.println("A biblioteca está vazia.");
        } else {
            while (iterator.hasNext()) {
                Livro livro = iterator.next();
                System.out.println(livro);
            }
        }
    }

    public static void main(String[] args) {
        Biblioteca2 biblioteca = new Biblioteca2();

        Livro livro1 = new Livro("Livro 1", "Autor 1");
        Livro livro2 = new Livro("Livro 2", "Autor 2");
        Livro livro3 = new Livro("Livro 3", "Autor 3");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        System.out.println("Lista de livros:");
        biblioteca.listarLivros();

        biblioteca.removerLivro("Livro 2");

        System.out.println("\nLista de livros após remoção:");
        biblioteca.listarLivros();
    }
}

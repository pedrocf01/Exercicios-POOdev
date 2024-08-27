import java.util.ArrayList;

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

class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(String titulo) {
        for (int i = 0; i < livros.size(); i++) {
           if (livros.get(i).getTitulo().equals(titulo)) {
               livros.remove(i);
               break;
           }
        }
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
        } else {
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

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

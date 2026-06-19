package Principal;

import java.util.ArrayList;

public class TesteBiblioteca {
    public static void main(String[] args) {
        
        // Instanciando a Biblioteca
        AcademicLibrary biblioteca = new AcademicLibrary("Biblioteca Central Unijuí", "Acervo de Engenharia de Software", "14/11/2025");

        // Criando listas de autores
        ArrayList<Author> autoresLivro = new ArrayList<>();
        Author autor1 = new Author("Unijuí", true, "Bernardo Londero", "bernardogmlondero@gmail.com");
        autoresLivro.add(autor1);

        ArrayList<Author> autoresArtigo = new ArrayList<>();
        Author autor2 = new Author("Universidade de Tecnologia", false, "Alan Turing", "alan@email.com");
        autoresArtigo.add(autor2);

        // Instanciando e adicionando um Livro
        Book livro1 = new Book("Português", 978853650L, (short) 350, "Engenharia de Software", (short) 2026, (byte) 1, autoresLivro);
        biblioteca.addPublication(livro1);

        // Instanciando adicionando um Artigo
        Publisher editora = new Publisher("Tech Publish", "Brasil");
        Journal revista = new Journal(editora, "Revista de Engenharia de Software", (byte) 5);

        ArrayList<String> palavrasChave = new ArrayList<>();
        palavrasChave.add("POO");
        palavrasChave.add("Java");
        palavrasChave.add("Bancos de Dados");

        Article artigo1 = new Article(revista, 12345678L, (byte) 2, (short) 10, (short) 25, palavrasChave, "Fundamentos de Programação Orientada a Objetos", (short) 2026, (byte) 3, autoresArtigo);
        biblioteca.addPublication(artigo1);

        // Exibindo os resultados
        System.out.println("=== SISTEMA DA " + biblioteca.getName().toUpperCase() + " ===");
        System.out.println("Descrição: " + biblioteca.getDescription());
        System.out.println("Total de publicações no acervo: " + biblioteca.countPublications());
        System.out.println("Total de Livros: " + biblioteca.countBooks());
        System.out.println("Total de Artigos: " + biblioteca.countArticles());

        System.out.println("\n--- Lista de Publicações ---");
        for (Publication p : biblioteca.getAllPublications()) {
            System.out.println("- Título: " + p.getTitle() + " | Ano: " + p.getYear());
            System.out.println("  Autor Principal: " + p.getAuthors().get(0).getName());
            
            // Verificando o tipo da publicação
            if (p instanceof Book) {
                Book b = (Book) p;
                System.out.println("  Tipo: Livro | ISBN: " + b.getIsbn() + " | Idioma: " + b.getLenguage());
            } else if (p instanceof Article) {
                Article a = (Article) p;
                System.out.println("  Tipo: Artigo | ISSN: " + a.getIssn() + " | Revista: " + a.getJournal().getName());
            }
            System.out.println();
        }
        
        // Testando os métodos de busca
        System.out.println("--- Teste de Busca ---");
        String busca = "Engenharia de Software";
        if (biblioteca.hasPublication(busca)) {
            System.out.println("Sucesso: A publicação '" + busca + "' foi encontrada no acervo!");
        } else {
            System.out.println("Erro: Publicação não encontrada.");
        }
    }
}
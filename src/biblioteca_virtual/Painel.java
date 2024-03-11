package biblioteca_virtual;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Painel implements Biblioteca { // Classe Painel implementa a Interface Bilbioteca

    Scanner usuario = new Scanner(System.in); // Novo scanner chamado usuario
    List<UsuarioBiblioteca> usuarionovo = new ArrayList<UsuarioBiblioteca>(); // Criando uma nova coleção de usuarios
    List<String> livro = new ArrayList<String>(); // Criando uma nova cole??o de livros
    int opcao, i;
    String livroUsuario;

    @Override
    public int menuPrincipal() { // Menu principal que será exibido ao usuario que executou o programa

        System.out.println("\nBem-vindo a biblioteca virtual!\n");
        System.out.println("Escolha a opção desejada:\n");
        System.out.println("1 - Livros");
        System.out.println("2 - Novo Cadastro");
        System.out.println("3 - Registrar um novo livro");
        System.out.println("4 - Listar usuarios cadastrados");
        System.out.println("5 - Remover um livro da biblioteca");
        System.out.println("6 - Sair");
        System.out.println("Sua opcao: ");
        opcao = usuario.nextInt(); // Guarda o numero da opcao digitada pelo usuario

        switch (opcao) {
            case 1: // Exibir a coleção de livros
                listaLivro();
                break;
            case 2: // inicializa o método registraUsuario
                registraUsuario();
                break;
            case 3: // inicializa o método registraLivro
                registraLivro();
                break;
            case 4: // listar os usuarios cadastrados dentro da lista usuarionovo
                listaUsuario();
                break;
            case 5: // Remover o(s) livro(s) solicitado(s) pelo(s) usuario(s)
                removeLivro();
                break;
            case 6:
                System.out.println("Obrigado por usar a biblioteca virtual!");
                System.exit(0);
        }
        return 0;
    }

    @Override
    public int registraUsuario() { // Pedir um novo cadastro ao usuario
        // cadastro do usuario
        System.out.println("Bem-vindo ao seu cadastro pra biblioteca\n");
        System.out.println("Digite seu nome completo: ");
        String nomeUsuario = usuario.next();
        System.out.println("Digite seu melhor email: ");
        String email = usuario.next();
        System.out.println("Digite sua idade");
        int idade = usuario.nextInt();
        UsuarioBiblioteca u = new UsuarioBiblioteca(nomeUsuario, email, idade); // Instanciando a classe UsuarioBiblioteca
        usuarionovo.add(u); // Adiciona o novo cadastro a lista de usuarios novos       // e armazenando o nome, email e idade que o
        System.out.println("Seja bem-vindo à biblioteca virtual " + u.nomeCompleto + "!"); // usuario digitou dentro da clase

        return 0;
    }

    @Override
    public int registraLivro() { // Pedir ao usuário para adicionar um novo livro a lista de livros
        Scanner usuario = new Scanner(System.in);
        System.out.println("Ol? Usu?rio! Se deseja adicionar um novo livro a biblioteca, por favor forneça o nome do livro");
        livroUsuario = usuario.nextLine();
        livro.add(livroUsuario); // Lendo o input do usuario e adicionando o novo livro a Arraylist de livros
        System.out.println("Muito obrigado! Seu livro foi adicionado a biblioteca com sucesso!");
        return 0;
    }

    @Override
    public int removeLivro() { // Pedir ao usuario para remover um livro dentro da lista de livros
        int indice;
        for (i = 0; i < livro.size(); i++) { // Para cada indice dentro da lista de livros, contanto que o indice seja menor que o tamanho da lista
            System.out.println(livro); // Printa a lista de livros
        }
        System.out.println("Qual livro você deseja remover?");
        indice = usuario.nextInt();
        if (indice < 0 || indice >= livro.size()) { // se o indice digitado pelo usuario for menor que 0 ou for maior ou igual ao tamanho da lista de livros
            System.out.println("Índice inválido. Por favor, tente novamente"); // Printa esta mensagem e volta para o menu principal
            return 1; // Aqui voltamos ao menu principal, obrigando o usuario a tentar novamente
        }
        livro.remove(indice); // Se não, ele termina o programa realizando a remoção do livro solicitado pelo usuario
        System.out.println(livro);
        System.out.println("Livro removido com sucesso!");

        return 0;
    }

    @Override
    public int listaUsuario() {
        for (i = 0; i < usuarionovo.size(); i++) {
            System.out.println(usuarionovo.get(i));
        }
        return 0;
    }

    @Override
    public int listaLivro() {
        if (!livro.isEmpty()) {
            System.out.println("Possuimos os seguintes livros disponiveis na biblioteca: ");
            System.out.println(livro + "\n");
        } else {
            System.out.println("Ainda não possuimos livros na biblioteca\n");
        }
        return 0;
    }

}

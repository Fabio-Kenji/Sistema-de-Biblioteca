package biblioteca_virtual;

public class UsuarioBiblioteca extends UsuarioRegistro { // Classe UsuarioBiblioteca está herdando a classe abstrata UsuarioRegistro


    public UsuarioBiblioteca(String nomeCompleto, String email, int idade) {
        super(nomeCompleto, email, idade);
    }

    @Override
    public String toString() {
        return "Usuario: " + nomeCompleto + ", email: " + email + ", idade: " + idade;
    }
}


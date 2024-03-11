package biblioteca_virtual;

public abstract class UsuarioRegistro { // Classes Abstratas servem apenas para gerar atributos que outras classes herdadas irão utilizar
    String nomeCompleto;
    String email;
    int idade;

    public UsuarioRegistro(String nomeCompleto, String email, int idade) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.idade = idade;
    }
    
    
}
    


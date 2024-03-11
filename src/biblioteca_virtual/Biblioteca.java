package biblioteca_virtual;


public interface Biblioteca { // Uma interface funciona como um padrão de métodos e atributos que todas as classes devem obedecer
    
    int menuPrincipal();
    int registraLivro();
    int registraUsuario();
    int removeLivro();
    int listaUsuario();
    int listaLivro();
}
